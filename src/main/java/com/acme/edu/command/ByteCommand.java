package com.acme.edu.command;

public class ByteCommand extends PrimitiveCommands {
    private final byte message;

    public ByteCommand(byte message) {
        this.message = message;
    }

    @Override
    public String getDecorated() {
        return Decor + message;
    }

    @Override
    public boolean isTypeEqual(Command command) {
        return command instanceof ByteCommand;
    }
}
