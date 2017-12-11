package com.revature.commands;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Parser {
    public void parse() {
        Scanner sc = new Scanner(System.in);
        String line = "";
        String word = "";
        boolean recognized = false;

        while (true) {
            line = sc.nextLine();
            line = line.toLowerCase();

            if (line.equals("exit")) {
                Exit endOfSession = new Exit();
                endOfSession.run();
                break;
            }

            if (line.equals("help")) {
                Help helper = new Help();
                helper.run();
                recognized = true;
                if (helper.isGameOver() == true)
                    break;
            }

            if (line.equals("look")) {
                Look looker = new Look();
                looker.run();
                recognized = true;
                if (looker.isGameOver() == true)
                    break;
            }

            if (line.equals("go")) {
                Go goer = new Go();
                goer.run();
                recognized = true;
                if (goer.isGameOver() == true)
                    break;
            }

            if (line.equals("inv")) {
                Inv inver = new Inv();
                inver.run();
                recognized = true;
                if (inver.isGameOver() == true)
                    break;
            }

            if (line.equals("get")) {
                Get getter = new Get();
                getter.run();
                recognized = true;
                if (getter.isGameOver() == true)
                    break;
            }

            StringTokenizer token = new StringTokenizer(line, " ");
            if (token.hasMoreElements() == true) {
                word = token.nextToken();
                if (word.equals("help")) {
                    if (token.hasMoreElements() == true) {
                        Help helper = new Help();
                        helper.run(token.nextToken());
                        recognized = true;
                        if (helper.isGameOver() == true)
                            break;
                    }
                }
                if (word.equals("go")) {
                    if (token.hasMoreElements() == true) {
                        Go goer = new Go();
                        goer.run(token.nextToken());
                        recognized = true;
                        if (goer.isGameOver() == true)
                            break;
                    }
                }
                if (word.equals("look")) {
                    if (token.hasMoreElements() == true) {
                        Look looker = new Look();
                        looker.run(token.nextToken());
                        recognized = true;
                        if (looker.isGameOver() == true)
                            break;
                    }
                }
                if (word.equals("get")) {
                    if (token.hasMoreElements() == true) {
                        Get getter = new Get();
                        getter.run(token.nextToken());
                        recognized = true;
                        if (getter.isGameOver() == true)
                            break;
                    }
                }
            }
            
            if (recognized == false) System.out.println("That's not a command I recognize. Type help for a list of commands.");
            recognized = false;
        }

        sc.close();
    }
}