package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    ControlProducto controlProducto = new ControlProducto();
    ClearScreen cls = new ClearScreen();
    AccesoAProductos accesoAProductos = new AccesoAProductos();
    MenuProductos menuProductos = new MenuProductos();



    public void start() throws IOException, InterruptedException {

        int opcion = 0;


        System.out.println("Contraseña del jefe: ");

        String password = "s";
        String passwordCorrect = scanner.next();


        System.out.println("Entrando como jefe...");
        Thread.sleep(2000);



        if (passwordCorrect.equals(password)) {
            while (opcion != 4){
                cls.clearScreen();
                System.out.println("[1] Ver Productos \n[2] Añadir Productos \n[3] Borrar Productos \n[4] Salir\n");
                System.out.print("Elige Que quieres ver: ");

                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1 : {
                        System.out.println("[1] Bocadillos");
                        System.out.println("[2] Bebidas");
                        System.out.println("[3] Cafes");
                        System.out.println("[4] Salir");
                        int opcionAMostrar = scanner.nextInt();
                        System.out.println("Bocadillos disponibles: ");
                        accesoAProductos.getProductos(opcionAMostrar).forEach(System.out::println);
                        break;
                    }
                    case 2: {
                        menuProductos.anadirProductos();
                        break;
                    }
                    case 3: {
                        menuProductos.borrarProductos();
                        break;
                    }
                    default: {
                        System.out.println("Selecciona una opcion entre 1-3");
                        cls.clearScreen();
                        break;
                    }
                }
            }
        }
    }
}
