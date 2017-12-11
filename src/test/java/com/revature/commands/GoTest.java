package com.revature.commands;

import com.revature.RoomFactory;
import com.revature.Room;
import com.revature.Item;
import com.revature.Game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

public class GoTest 
extends TestCase {

    public static Test suite()
    {
        return new TestSuite( GoTest.class );
    }

    public void testApp()
    {
        RoomFactory roomMaker = new RoomFactory();
        ArrayList<String> testExits = new ArrayList<String>();
        testExits.add("newplace");
        ArrayList<Item> noItems = new ArrayList<Item>();
        Room testRoom = roomMaker.getRoom("test", "Test test test", testExits, noItems);

        Game.setCurrentRoom(testRoom);

        Go testGo = new Go();

        testGo.run("Not A Match");
        assertFalse(testGo.matchFound);

        testGo.run("newplace");
        assertTrue(testGo.matchFound);
    }
    
}