package com.revature.commands;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Parser {
    public void parse() {
        Scanner sc = new Scanner(System.in);
        String line = "";
        String word = "";

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
            }

            StringTokenizer token = new StringTokenizer(line, " ");
            if (token.hasMoreElements() == true) {
                word = token.nextToken();
                if (word.equals("help")) {
                    if (token.hasMoreElements() == true) {
                        Help helper = new Help();
                        helper.run(token.nextToken());
                    }
                }
            }
        }

        sc.close();
    }
}