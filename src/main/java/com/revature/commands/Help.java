package com.revature.commands;

import com.revature.Game;

public class Help extends Command {
    public void helptext() {
        System.out.println("Lists and describes the game's commands");
    }

    public void run() {
        System.out.println("The game's commands are: help, look, go, " /*inv,*/ + "get, exit");
        System.out.println("For a description of each command, type \"help command\"");
    }

    public void run(String verb) {
        boolean answered = false;
        if (verb.equals("exit")) {
            Exit exithelp = new Exit();
            exithelp.helptext();
            answered = true;
        }
        if (verb.equals("look")) {
            Look lookhelp = new Look();
            lookhelp.helptext();
            answered = true;
        }
        if (verb.equals("go")) {
            Go gohelp = new Go();
            gohelp.helptext();
            answered = true;
        }
        /*if (verb.equals("inv")) {
            Inv invhelp = new Inv();
            invhelp.helptext();
            answered = true;
        }*/
        if (verb.equals("get")) {
            Get gethelp = new Get();
            gethelp.helptext();
            answered = true;
        }
        if (verb.equals("help")) {
            helptext();
            answered = true;
        }
        if (answered == false)
            System.out.println("I don't recognize the command " + verb);
    }

    public boolean isGameOver() {
        return false;
    }
}