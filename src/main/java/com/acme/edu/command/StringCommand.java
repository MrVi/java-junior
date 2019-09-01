package com.acme.edu.command;

import static com.acme.edu.StrUtils.SEPARATORM;

public class StringCommand implements Command {
    private String message;
    private String Decor = "string: ";

    public StringCommand(String message) {
        this.message = message;
    }

    public StringCommand(String... message){
        for (String item: message) {
            this.message += item + SEPARATORM;
        }
    }

    @Override
    public String getDecorated() {
        return Decor + message;
    }

    @Override
    public boolean isTypeEqual(Command command) {
        return command instanceof StringCommand;
    }
}
