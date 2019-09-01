package com.acme.edu.command;

public class ObjectCommand implements Command {
    private Object message;
    private String Decor = "reference: ";

    public ObjectCommand(Object message) {
        this.message = message;
    }

    @Override
    public String getDecorated() {
        return Decor + message;
    }

    @Override
    public boolean isTypeEqual(Command command) {
        return command instanceof ObjectCommand;
    }
}
