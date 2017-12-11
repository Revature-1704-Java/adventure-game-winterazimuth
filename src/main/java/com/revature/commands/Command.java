package com.revature.commands;

public abstract class Command {
    public void helptext() {
        System.out.println("This is a command");
    }

    public abstract void run();
}