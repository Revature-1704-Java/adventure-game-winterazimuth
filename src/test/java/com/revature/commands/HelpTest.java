package com.revature.commands;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HelpTest 
extends TestCase {

    public static Test suite()
    {
        return new TestSuite( HelpTest.class );
    }

    public void testApp()
    {
        Help helpExit = new Help();
        Help helpLook = new Help();
        Help helpGo = new Help();
        Help helpGet = new Help();
        Help helpHelp = new Help();
        Help helpNone = new Help();
        helpExit.run("exit");
        assertTrue( helpExit.answered );
        helpLook.run("look");
        assertTrue( helpLook.answered );
        helpGo.run("go");
        assertTrue( helpGo.answered );
        helpGet.run("get");
        assertTrue( helpGet.answered );
        helpHelp.run("help");
        assertTrue( helpHelp.answered );
        helpNone.run("none");
        assertFalse( helpNone.answered );
    }
    
}