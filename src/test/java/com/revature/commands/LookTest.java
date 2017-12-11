package com.revature.commands;

import com.revature.RoomFactory;
import com.revature.ItemFactory;
import com.revature.Room;
import com.revature.Item;
import com.revature.Game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

public class LookTest 
extends TestCase {

    public static Test suite()
    {
        return new TestSuite( LookTest.class );
    }

    public void testApp()
    {
        RoomFactory roomMaker = new RoomFactory();
        ArrayList<String> testExits = new ArrayList<String>();
        ArrayList<Item> oneItem = new ArrayList<Item>();
        ItemFactory itemMaker = new ItemFactory();
        Item rubberDuck = itemMaker.getItem("rubber duck", "A rubber duck");
        oneItem.add(rubberDuck);
        Room testRoom = roomMaker.getRoom("test", "Test test test", testExits, oneItem);

        Game.setCurrentRoom(testRoom);

        Look testLook = new Look();
        testLook.run("Captain Planet");
        assertFalse(testLook.itemFound);

        testLook.run("rubber duck");
        assertTrue(testLook.itemFound);
    }
    
}