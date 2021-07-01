
import blockchain.Main;
import org.hyperskill.hstest.v6.stage.BaseStageTest;
import org.hyperskill.hstest.v6.testcase.CheckResult;
import org.hyperskill.hstest.v6.testcase.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class BlockParseException extends Exception {
    BlockParseException(String msg) {
        super(msg);
    }
}


class Block {

    int id;
    long timestamp;
    long magic;
    String hashprev;
    String hash;

    static Block parseBlock(String strBlock) throws BlockParseException {
        if (strBlock.length() == 0) {
            return null;
        }

        if (!(strBlock.contains("Block:")
            && strBlock.contains("Timestamp:"))) {

            return null;
        }

        Block block = new Block();

        List<String> lines = strBlock
            .lines()
            .map(String::strip)
            .filter(e -> e.length() > 0)
            .collect(Collectors.toList());

        if (lines.size() < 13) {
            throw new BlockParseException("Every block should " +
                "contain at least 13 lines of data");
        }

        if (!lines.get(0).equals("Block:")) {
            throw new BlockParseException("First line of every block " +
                "should be \"Block:\"");
        }

        if (!lines.get(1).startsWith("Created by")) {
            throw new BlockParseException("Second line of every block " +
                "should start with \"Created by\"");
        }

        if (!lines.get(2).contains("gets 100 VC")) {
            throw new BlockParseException("Third line of every block " +
                "should contain \"gets 100 VC\"");
        }

        if (!lines.get(3).startsWith("Id:")) {
            throw new BlockParseException("4-th line of every block " +
                "should start with \"Id:\"");
        }

        String id = lines.get(3).split(":")[1]
            .strip().replace("-", "");