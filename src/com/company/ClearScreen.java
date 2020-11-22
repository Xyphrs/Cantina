package com.company;

import java.io.IOException;

public class ClearScreen {

    public void clearScreen() throws IOException, InterruptedException {

        String OS = System.getProperty("os.name");

        if (OS.equals("Windows 10") || OS.equals("Windows 8.1") || OS.equals("Windows 7")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("\n");
        } else if (OS.contains("Linux")) {
            System.out.print("\033\143");
        }

    }

}