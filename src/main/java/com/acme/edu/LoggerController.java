package com.acme.edu;

import com.acme.edu.command.Command;
import com.acme.edu.saver.BigSaver;
import com.acme.edu.saver.ConsoleSaver;
import com.acme.edu.saver.FileSaver;

public class LoggerController {
//    private BigSaver saver = new ConsoleSaver();
    private BigSaver saver = new FileSaver();
    private Command currentState = null;

    void log(Command command){
//        if (command.isTypeEqual(currentState)) {
//            currentState.accumulate(command);
//        }
//        else {
            currentState = command;
            saver.save(currentState.getDecorated());
//        }
//        saver.save(command.getDecorated());
    }
}
