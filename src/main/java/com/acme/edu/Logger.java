package com.acme.edu;

//Single line
/*
Multi-line comment
 */


import com.acme.edu.command.*;

/**
 * JavaDoc comment
 * Class Logger has unnecessarily comment.
 * <strong>bold</strong>
 * @see java.lang.String#String()
 */
public class Logger {
    private static LoggerController logger = new LoggerController();

    public static void log(int message) {
        logger.log(new IntCommand(message));
    }

    public static void log(byte message) {
        logger.log(new ByteCommand(message));
    }

    public static void log(char message){
        logger.log(new CharCommand(message));
    }

    public static void log(boolean message){
        logger.log(new BooleanCommand(message));
    }

    public static void log(String message){
        logger.log(new StringCommand(message));
    }

    public static void log(String... message){
        logger.log(new StringCommand(message));
    }

    public static void log(Object message){
        logger.log(new ObjectCommand(message));
    }

    public static void log(int[] message){
        logger.log(new ArrayCommand(message));
    }

    public static void log(int[][] message){
        logger.log(new MatrixCommand(message));
    }

    public static void log(int[][][][] message){
        logger.log(new MultiMatrixCommand(message));
    }


    public static void main(String[] args) {
        System.out.println(1 + 2 + "3" + 4 + 5);
        Logger.log(3);
        Logger.log(4);
    }
}

