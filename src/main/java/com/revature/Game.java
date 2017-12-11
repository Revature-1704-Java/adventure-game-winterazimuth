package com.revature;

public class Game 
{
    static String startingMessage = "";
    
    public static void main( String[] args )
    {
        Player you = Player.makePlayer();
        GameBuilder ourGameBuilder = new GameBuilder();
        Parser io = new Parser();

        ourGameBuilder.buildGame("Coffee Quest");

        System.out.println(startingMessage);
    }

    public static void setStartingMessage(String message) {
        startingMessage = message;
    }
}
