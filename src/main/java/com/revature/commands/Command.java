package com.revature.commands;

public abstract class Command {
    String whatIDo = "This is a command";

    public String help() {
        return whatIDo;
    }
}