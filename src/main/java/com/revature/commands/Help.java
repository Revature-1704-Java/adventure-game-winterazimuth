package com.revature.commands;

import com.revature.Game;

public class Help extends Command {
    String whatIDo = "Lists and describes the game's commands";

    Help() {
        System.out.println("The game's commands are: help, exit");
        System.out.println("For a description of each command, type \"help command\"");
    }

    Help(String verb) {
        boolean answered = false;
        if (verb.equals("exit")) {
            Exit.helptext();
            answered = true;
        }
        if (verb.equals("help")) {
            Help.helptext();
            answered = true;
        }
        if (answered == false)
            System.out.println("I don't recognize the command " + verb);
    }
}