package com.revature.commands;

import com.revature.GameBuilder;
import com.revature.RoomFactory;
import com.revature.ItemFactory;
import com.revature.Room;
import com.revature.Item;
import com.revature.Game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

public class GetTest 
extends TestCase {

    public static Test suite()
    {
        return new TestSuite( GetTest.class );
    }

    public void testApp()
    {
        GameBuilder testGameBuilder = new GameBuilder();
        testGameBuilder.buildGame("Coffee Quest");

        RoomFactory roomMaker = new RoomFactory();
        ItemFactory itemMaker = new ItemFactory();
        ArrayList<String> testExits = new ArrayList<String>();
        ArrayList<Item> victory = new ArrayList<Item>();

        Item testItem = itemMaker.getItem(GameBuilder.victoryItemName, "description");
        victory.add(testItem);
        Room testRoom = roomMaker.getRoom("test", "Test test test", testExits, victory);

        Game.setCurrentRoom(testRoom);

        Get testGet = new Get();
        testGet.run(GameBuilder.victoryItemName);
        assertTrue(testGet.isGameOver());
    }

}