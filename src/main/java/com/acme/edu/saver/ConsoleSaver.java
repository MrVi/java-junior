package com.acme.edu.saver;

public class ConsoleSaver implements BigSaver {
    @Override
    public void save(String message) {
        System.out.println(message);
    }
}
