package com.acme.edu.command;

import com.acme.edu.StrUtils;

public class MatrixCommand implements Command {
    private int[][] message;
    private String Decor = "primitives matrix: ";

    public MatrixCommand(int[][] message) {
        this.message = message;
    }

    @Override
    public String getDecorated() {
        return Decor + StrUtils.arrayToString(message);
    }

    @Override
    public boolean isTypeEqual(Command command) {
        return command instanceof MatrixCommand;
    }
}
