package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlComandas {

    Scanner scanner = new Scanner(System.in);
    ControlProducto cp = new ControlProducto();

    ArrayList<Productos> productosComprados = new ArrayList<>();
    ArrayList<Float> precioTotalDeLaCompra = new ArrayList<>();

    public void start() {

        cp.getProductes();

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
                case 1 -> {
                    clientePideBocadillo();
                }
                case 2 -> {
                    clientePideBebida();
                }
                case 3 -> {
                    clientePideCafe();
                }
                case 4 ->{
                    resumenDeLaCompra();
                }
            }
        }
    }

    public void clientePideBocadillo() {
        System.out.println("Que bocadillo quieres?");
        cp.listarBocadillos();


        int idDelBocadilloQueQuiero = scanner.nextInt() - 1;

        System.out.println("Este es el bocadillo que as pedido:");
        System.out.println("Nom: " + cp.tiposDeBocadillos.get(idDelBocadilloQueQuiero).getNom() + " | Precio: " + cp.tiposDeBocadillos.get(idDelBocadilloQueQuiero).getPrecio());

        productosComprados.add(cp.tiposDeBocadillos.get(idDelBocadilloQueQuiero));
        precioTotalDeLaCompra.add(cp.tiposDeBocadillos.get(idDelBocadilloQueQuiero).getPrecio());

    }

    public void clientePideBebida() {
        System.out.println("Que bebida quieres?");
        cp.listarbebidas();

        int idDelaBebidaQueQuiero = scanner.nextInt() - 1;

        System.out.println("Esta es la bebida que as pedido:");
        System.out.println("Nom: " + cp.tipoBebidas.get(idDelaBebidaQueQuiero).getNom() + " | Precio: " + cp.tipoBebidas.get(idDelaBebidaQueQuiero).getPrecio());

        productosComprados.add(cp.tipoBebidas.get(idDelaBebidaQueQuiero));
        precioTotalDeLaCompra.add(cp.tipoBebidas.get(idDelaBebidaQueQuiero).getPrecio());

    }

    public void clientePideCafe() {
        System.out.println("Que cafe quieres?");
        cp.listarCafes();

        int idDelcafeQueQuiero = scanner.nextInt() - 1;

        System.out.println("Este es el Café que as pedido:");
        System.out.println("Nom: " + cp.cafes.get(idDelcafeQueQuiero).getNom() + " | Precio: " + cp.cafes.get(idDelcafeQueQuiero).getPrecio());

        productosComprados.add(cp.cafes.get(idDelcafeQueQuiero));
        precioTotalDeLaCompra.add(cp.cafes.get(idDelcafeQueQuiero).getPrecio());

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
}

