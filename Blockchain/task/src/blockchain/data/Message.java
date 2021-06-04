package blockchain.data;

import java.util.Objects;

public class Message implements Data {
    protected final long id;
    protected final String text;

    public Message(long id, String text) {
        this.id = id;
        this.text = text;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return fa