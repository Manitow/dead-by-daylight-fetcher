import java.util.Scanner;

interface Command {
    void execute();
}

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();
        Command buyCommand;
        Command sellCommand;
        int[] amountList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            amountList[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            Option option = new Option(amountList[i]);
            if (amountList[i] > 0) {
                buyCommand = new BuyCommand(option);
                broker.setCommand(buyCommand);
                broker.executeCommand();
            } else {
                sellCommand = new SellCommand(option);
                broker.setCommand(sellCommand);
                broker.executeCommand();
            }
        }
    }
}

class Option {
    private int amount;

    Option(int amount) {
        this.amount = amount;
    }

    void buy() {
        System.out.println(amount + " was bou