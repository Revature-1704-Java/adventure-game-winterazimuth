package com.revature;

public class GameBuilder {
    public void buildGame(String gameName) {
        if (gameName.equals("Coffee Quest") == true) {
            Game.setStartingMessage("A video game is about to begin, the epic quest of a brave hero to defeat the evil villain.\nThis is not that video game. This is backstage on the same set.\nYou are an intern tasked with bringing the hero his morning coffee before the game starts.\nUnfortunately for you, the only coffee machine is in the villain's castle, on the other side of the map...\n\n~~***COFFEE QUEST***~~~\ntype help for help");
        }
    }
}