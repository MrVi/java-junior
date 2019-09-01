package com.acme.edu.command;

public interface Command {
    String getDecorated();
    boolean isTypeEqual(Command command);
//    void accumulate(Command command);
}
