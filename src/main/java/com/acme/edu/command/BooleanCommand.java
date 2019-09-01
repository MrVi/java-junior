package com.acme.edu.command;

public class BooleanCommand extends PrimitiveCommands {
    private boolean message;

    public BooleanCommand(boolean message) {
        this.message = message;
    }

    @Override
    public String getDecorated() {
        return Decor + message;
    }

    @Override
    public boolean isTypeEqual(Command command) {
        return command instanceof BooleanCommand;
    }
}
