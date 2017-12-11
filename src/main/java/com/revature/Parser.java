package com.revature;

import java.io.*;
import java.util.Scanner;
import com.revature.commands.*;

public class Parser {
    public void parse() {
        Scanner sc = new Scanner(System.in);
        String line = "";

        while (true) {
            System.out.print(">");
            line = sc.nextLine();
            line = line.toLowerCase();

            if (line.equals("exit")) {
                Exit endOfSession = new Exit();
                break;
            }
        }

        sc.close();
    }
}