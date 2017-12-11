package com.revature.commands;

public abstract class Command {
    static String whatIDo = "This is a command";

    public static String helptext() {
        return whatIDo;
    }
}