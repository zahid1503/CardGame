package org.example;

import org.example.commands.CommandInvoker;
import org.example.exceptions.NoSuchCommandException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ApplicationConfig appConfig = new ApplicationConfig();
        CommandInvoker commandInvoker = appConfig.getCommandInvoker();
        Scanner scanner = new Scanner(System.in);
        try{
                System.out.println("Please press [Y] to start the game: ");
                String command = scanner.nextLine();
                if(command.equalsIgnoreCase("Y"))
                    commandInvoker.executeCommand("S","");
                else
                    return;
            scanner.close();
        } catch (NoSuchCommandException e) {
            e.printStackTrace();
        }
    }
}