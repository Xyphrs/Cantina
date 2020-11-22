package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuProductos {

    Scanner scanner = new Scanner(System.in);
    ControlProducto controlProducto = new ControlProducto();
    AccesoAProductos accesoAProductos = new AccesoAProductos();
    static ArrayList<Productos> productosComprados = new ArrayList<>();
    static ArrayList<Float> precioTotalDeLaCompra = new ArrayList<>();

    public void anadirProductos()   {
        int opcionAnadir = 0;

        while (opcionAnadir != 4) {

            System.out.println("[1] Bocadillos");
            System.out.println("[2] Bebidas");
            System.out.println("[3] Cafes");
            System.out.println("[4] Salir \n");
            System.out.print("Que quieres añadir?: ");

            opcionAnadir = scanner.nextInt();
            switch (opcionAnadir) {
                case 1: {
                    System.out.println("ID del bocadillo");
                    int id = scanner.nextInt();
                    System.out.println("Nombre del bocadillo");
                    String nom = scanner.next();
                    System.out.println("Precio del bocadillo");
                    float precio = scanner.nextFloat();

                    Productos producto = new Productos(id, nom, precio);

                    ControlProducto.tiposDeBocadillos.add(producto);
                    System.out.println("Producto añadido :)");
                    break;
                }
                case 2: {
                    System.out.println("ID de Bebida");
                    int id = scanner.nextInt();
                    System.out.println("Nombre de la bebida");
                    String nom = scanner.next();
                    System.out.println("Precio de la bebida");
                    float precio = scanner.nextFloat();

                    Productos producto = new Productos(id, nom, precio);

                    ControlProducto.tipoBebidas.add(producto);
                    System.out.println("Producto añadido :)");
                    break;
                }
                case 3: {
                    System.out.println("ID del cafe");
                    int id = scanner.nextInt();
                    System.out.println("Nombre del cafe");
                    String nom = scanner.next();
                    System.out.println("Precio del cafe");
                    float precio = scanner.nextFloat();

                    Productos producto = new Productos(id, nom, precio);

                    ControlProducto.cafes.add(producto);
                    System.out.println("Producto añadido :)");
                    break;
                }
            }
        }
    }

    public void borrarProductos() throws IOException, InterruptedException {
        int opcionBorrar = 0;
        while (opcionBorrar != 4) {

            System.out.println("[1] Bocadillos");
            System.out.println("[2] Bebidas");
            System.out.println("[3] Cafes");
            System.out.println("[4] Salir\n");
            System.out.print("Que quieres eliminar?: ");



            opcionBorrar = scanner.nextInt();
            switch (opcionBorrar) {
                case 1: {
                    System.out.println("ID del Bocadillo");
                    int id = scanner.nextInt();
                    ControlProducto.tiposDeBocadillos.remove(id - 1);
                    System.out.println("Producto eliminado :)");
                    break;
                }
                case 2: {
                    System.out.println("ID de Bebida");
                    int id = scanner.nextInt();
                    ControlProducto.tipoBebidas.remove(id - 1);
                    System.out.println("Producto eliminado :)");
                    break;
                }
                case 3: {
                    System.out.println("ID del Cafe");
                    int id = scanner.nextInt();
                    ControlProducto.cafes.remove(id - 1);
                    System.out.println("Producto eliminado :)");
                    break;
                }
            }
        }
    }

    public void clientePideBocadillo() throws IOException, InterruptedException {
        System.out.println("Que bocadillo quieres?");
        controlProducto.listarBocadillos();


        int idDelBocadilloQueQuiero = scanner.nextInt() - 1;

        System.out.println("Este es el bocadillo que as pedido:");
        System.out.println("Nom: " + ControlProducto.tiposDeBocadillos.get(idDelBocadilloQueQuiero).getNom() + " | Precio: " + ControlProducto.tiposDeBocadillos.get(idDelBocadilloQueQuiero).getPrecio());

        productosComprados.add(ControlProducto.tiposDeBocadillos.get(idDelBocadilloQueQuiero));
        precioTotalDeLaCompra.add(ControlProducto.tiposDeBocadillos.get(idDelBocadilloQueQuiero).getPrecio());

    }

    public void clientePideBebida() throws IOException, InterruptedException {
        System.out.println("Que bebida quieres?");
        controlProducto.listarbebidas();

        int idDelaBebidaQueQuiero = scanner.nextInt() - 1;

        System.out.println("Esta es la bebida que as pedido:");
        System.out.println("Nom: " + ControlProducto.tipoBebidas.get(idDelaBebidaQueQuiero).getNom() + " | Precio: " + ControlProducto.tipoBebidas.get(idDelaBebidaQueQuiero).getPrecio());

        productosComprados.add(ControlProducto.tipoBebidas.get(idDelaBebidaQueQuiero));
        precioTotalDeLaCompra.add(ControlProducto.tipoBebidas.get(idDelaBebidaQueQuiero).getPrecio());

    }

    public void clientePideCafe() throws IOException, InterruptedException {
        System.out.println("Que cafe quieres?");
        controlProducto.listarCafes();

        int idDelcafeQueQuiero = scanner.nextInt() - 1;

        System.out.println("Este es el Café que as pedido:");
        System.out.println("Nom: " + ControlProducto.cafes.get(idDelcafeQueQuiero).getNom() + " | Precio: " + ControlProducto.cafes.get(idDelcafeQueQuiero).getPrecio());

        productosComprados.add(ControlProducto.cafes.get(idDelcafeQueQuiero));
        precioTotalDeLaCompra.add(ControlProducto.cafes.get(idDelcafeQueQuiero).getPrecio());

    }

    public void resumenDeLaCompra() {

        System.out.println("---------------------------------------------");
        System.out.println("Resumen de tu compra:");

        for (Productos p: productosComprados) {
            System.out.println("Nombre: " + p.getNom() + " Precio: " + p.getPrecio());

        }

        float suma = 0f;

        float laSumaTotal = 0f;

        for (float p: precioTotalDeLaCompra) {
            laSumaTotal = suma += p;
        }

        System.out.println("---------------------------------------------");
        System.out.printf("Precio total a pagar : " +"%.2f%n", laSumaTotal);
        System.out.println("---------------------------------------------\n");


    }

    public void start() throws IOException, InterruptedException {

        int opcion = 0;
        while (opcion != 4) {

            System.out.println(" ");
            System.out.println("Que quieres pedir? \n");
            System.out.println("[1] Pedir un bocadillo");
            System.out.println("[2] Pedir una bebida");
            System.out.println("[3] Pedir un cafe");
            System.out.println("[4] Salir");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: {
                    accesoAProductos.getProductos(opcion).forEach(System.out::println);
                    clientePideBocadillo();
                    break;
                }
                case 2: {
                    accesoAProductos.getProductos(opcion).forEach(System.out::println);
                    clientePideBebida();
                    break;
                }
                case 3: {
                    accesoAProductos.getProductos(opcion).forEach(System.out::println);
                    clientePideCafe();
                    break;
                }
                case 4: {
                    resumenDeLaCompra();
                    break;
                }
            }
        }
    }



}
