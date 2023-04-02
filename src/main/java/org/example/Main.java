package org.example;

import org.example.commands.CommandInvoker;
import org.example.exceptions.NoSuchCommandException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationConfig appConfig = new ApplicationConfig();
        CommandInvoker commandInvoker = appConfig.getCommandInvoker();
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        try{
            while (!gameOver) {
                System.out.println("Enter a command: ");
                String command = scanner.nextLine();
                String token = scanner.nextLine();
                String result = commandInvoker.executeCommand(command,token);

                if (result.equals("Game Over")) {
                    gameOver = true;
                } else {
                    System.out.println(result);
                }
            }
            scanner.close();
        } catch (NoSuchCommandException e) {
            e.printStackTrace();
        }
    }
}