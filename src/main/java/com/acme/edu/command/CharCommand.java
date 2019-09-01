package com.acme.edu.command;

public class CharCommand implements Command {
    private char message;
    private String Decor = "char: ";

    public CharCommand(char message) {
        this.message = message;
    }

    @Override
    public String getDecorated() {
        return Decor + message;
    }

    @Override
    public boolean isTypeEqual(Command command) {
        return command instanceof CharCommand;
    }
}
