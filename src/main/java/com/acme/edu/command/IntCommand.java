package com.acme.edu.command;

public class IntCommand extends PrimitiveCommands {
    private int message = 0;

    public IntCommand(int message) {
        this.message = message;
    }

    public IntCommand(int... message) {
        for (int item: message) {
            this.message += item;
        }
    }

    public int getMessage(){
        return message;
    }

    public void accumulate(IntCommand command) {
        this.message += command.getMessage();
    }

    @Override
    public String getDecorated() {
        return Decor + message;
    }

    @Override
    public boolean isTypeEqual(Command command) {
        System.out.println("YES!!!!!" + String.valueOf(command instanceof IntCommand));
        return command instanceof IntCommand;
    }

}
