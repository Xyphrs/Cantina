package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        Menu menu = new Menu();
        ControlProducto producto = new ControlProducto();
        MenuProductos menuProductos = new MenuProductos();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        producto.getProductes();

        while (opcion != 3) {
            System.out.println("-----------------------------");
            System.out.println(" BIENVENIDO A LA CANTINA!!!! ");
            System.out.println("-----------------------------");
            System.out.println("Quien eres (1.-Boss o 2.-cliente)?");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: {
                    menu.start();
                    break;
                }
                case 2: {
                    menuProductos.start();
                    break;
                }
                case 3: {
                    System.out.println("Adios!!!!!!!!!!!");
                    break;
                }
            }
        }
    }
}
