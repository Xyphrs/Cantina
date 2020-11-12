package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        ControlComandas comandas = new ControlComandas();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println(" BIENVENIDO A LA CANTINA!!!!");
            System.out.println("Quien eres (1.-Boss o 2.-cliente)?");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    menu.start();
                }
                case 2 -> {
                    comandas.start();
                }
                case 3 -> {
                    System.out.println("Adios!!!!!!!!!!!");
                }
            }
        }
    }
}
