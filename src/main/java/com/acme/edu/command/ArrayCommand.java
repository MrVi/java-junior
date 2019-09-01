package com.acme.edu.command;

import com.acme.edu.StrUtils;

public class ArrayCommand implements Command {
    private final String Decor = "primitives array: ";
    private int[] message;

    public ArrayCommand(int[] message) {
        this.message = message;
    }

    @Override
    public String getDecorated() {
        return Decor + StrUtils.arrayToString(message);
    }

    @Override
    public boolean isTypeEqual(Command command) {
        return command instanceof ArrayCommand;
    }
}
