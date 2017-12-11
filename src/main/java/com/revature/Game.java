package com.revature;

public class Game 
{
    static String startingMessage = "";
    static String gameName = "Coffee Quest";

    public static void main( String[] args )
    {
        Player you = Player.makePlayer();
        GameBuilder ourGameBuilder = new GameBuilder();
        Parser io = new Parser();

        ourGameBuilder.buildGame(gameName);

        System.out.println(startingMessage);

        io.parse();
    }

    public static void setStartingMessage(String message) {
        startingMessage = message;
    }

    public static String getGameName() {
        return gameName;
    }
}
