package com.acme.edu;

import java.util.Arrays;

public class StrUtils {
    private StrUtils(){}
    public final static String SEPARATORM = System.lineSeparator();

    public static String arrayToString(int[] array) {
        return Arrays.toString(array)
                .replace("[", "{")
                .replace("]", "}");
    }

    public static String arrayToString(int[][] array) {
        StringBuilder sb = new StringBuilder("{" + SEPARATORM);
        for (int[] subArray : array) {
            sb.append(arrayToString(subArray)).append(SEPARATORM);
        }
        sb.append("}");
        return sb.toString();
    }

    public static String arrayToString(int[][][][] array) {
        return Arrays.deepToString(array)
                .replace("[", "{" + SEPARATORM)
                .replace("]", SEPARATORM + "}");
    }
}
