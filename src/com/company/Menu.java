package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ControlProducto controlProducto = new ControlProducto();

    public void start() {

        controlProducto.getProductes();
        int opcion = 0;

        while (opcion != 4){
            System.out.println("Elige Que quieres ver:\n");
            System.out.println("1: Ver Productos \n2: Añadir Productos \n3: Borrar Productos \n4: Salir");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> controlProducto.mostrarProductos();
                case 2 -> controlProducto.anadirProductos();
                case 3 -> controlProducto.borrarProductos();
                default -> System.out.println("Selecciona una opcion entre 1-3");
            }
        }
    }
}
