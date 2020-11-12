package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlProducto {
    Scanner scanner = new Scanner(System.in);
    private int id;
    private String nom;
    private int opcion;

    public ControlProducto() {
    }

    public ControlProducto(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    ArrayList<Productos> tiposDeBocadillos = new ArrayList<>();
    ArrayList<Productos> tipoBebidas = new ArrayList<>();
    ArrayList<Productos> cafes = new ArrayList<>();

    public void getProductes() {
        tiposDeBocadillos.add(new Productos(1, "Queso", 1.10f));
        tiposDeBocadillos.add(new Productos(2, "Bacon", 1.50f));
        tiposDeBocadillos.add(new Productos(3, "Vegetal", 1.50f));
        tiposDeBocadillos.add(new Productos(4, "Salami", 1.10f));
        tiposDeBocadillos.add(new Productos(5, "Frankfurt", 1.30f));
        tiposDeBocadillos.add(new Productos(6, "Fuet", 1.10f));
        tiposDeBocadillos.add(new Productos(7, "Tortilla", 1.30f));

        tipoBebidas.add(new Productos(1, "Agua", 1.00f));
        tipoBebidas.add(new Productos(2, "CocaCola", 1.20f));
        tipoBebidas.add(new Productos(3, "Fanta Naranja", 1.20f));
        tipoBebidas.add(new Productos(4, "Fanta Limon", 1.20f));
        tipoBebidas.add(new Productos(5, "Nestea", 1.30f));
        tipoBebidas.add(new Productos(6, "7Up", 1.10f));
        tipoBebidas.add(new Productos(7, "CocaCola Cero", 1.50f));

        cafes.add(new Productos(1,"Café Cortado", 1.10f ));
        cafes.add(new Productos(2,"Café Largo", 1.10f));
        cafes.add(new Productos(3,"Café Capuchino", 1.15f ));
        cafes.add(new Productos(4,"Café Descafeinado",1.10f ));
        cafes.add(new Productos(5,"Chocolate", 1f ));
        cafes.add(new Productos(6,"Café Moca",1.20f ));
        cafes.add(new Productos(7,"Café Frappuchino",1.30f ));

    }

    public void listarBocadillos() {

        for (Productos p : tiposDeBocadillos) {
            System.out.println("[" + p.getId()+ "]" + " Nombre: " + p.getNom() + " Precio: " + p.getPrecio());
        }
        System.out.println();

    }

    public void listarbebidas() {

        for (Productos p: tipoBebidas) {
            System.out.println("[" + p.getId() + "]" + " Nombre: " + p.getNom() + " Precio: " + p.getPrecio());
        }
        System.out.println();

    }

    public void listarCafes() {

        for (Productos p : cafes) {
            System.out.println("[" + p.getId() + "]" + " Nombre: " + p.getNom() + " Precio: " + p.getPrecio());
        }
        System.out.println();

    }

    public void anadirProductos() {

        int opcionAnadir = 0;

        while (opcionAnadir != 4) {
        System.out.println("Que quieres añadir?: ");
        System.out.println("1. Bocadillos");
        System.out.println("2. Bebidas");
        System.out.println("3. Cafes");
        System.out.println("4. Salir");

            opcionAnadir = scanner.nextInt();
            switch (opcionAnadir) {
                case 1 -> {
                    System.out.println("ID del bocadillo");
                    int id = scanner.nextInt();
                    System.out.println("Nombre del bocadillo");
                    String nom = scanner.next();
                    System.out.println("Precio del bocadillo");
                    float precio = scanner.nextFloat();

                    Productos producto = new Productos(id, nom, precio);

                    tiposDeBocadillos.add(producto);
                    System.out.println("Producto añadido :)");
                }
                case 2 -> {
                    System.out.println("ID de Bebida");
                    int id = scanner.nextInt();
                    System.out.println("Nombre de la bebida");
                    String nom = scanner.next();
                    System.out.println("Precio de la bebida");
                    float precio = scanner.nextFloat();

                    Productos producto = new Productos(id, nom, precio);

                    tipoBebidas.add(producto);
                    System.out.println("Producto añadido :)");
                }
                case 3 -> {
                    System.out.println("ID del cafe");
                    int id = scanner.nextInt();
                    System.out.println("Nombre del cafe");
                    String nom = scanner.next();
                    System.out.println("Precio del cafe");
                    float precio = scanner.nextFloat();

                    Productos producto = new Productos(id, nom, precio);

                    cafes.add(producto);
                    System.out.println("Producto añadido :)");
                }
            }
        }
    }

    public void borrarProductos() {

        int opcionBorrar = 0;
        while (opcionBorrar != 4) {
            System.out.println("Que quieres eliminar?: ");
            System.out.println("1. Bocadillos");
            System.out.println("2. Bebidas");
            System.out.println("3. Cafes");
            System.out.println("4. Salir");



            opcionBorrar = scanner.nextInt();
            switch (opcionBorrar) {
                case 1 -> {
                    System.out.println("ID del Bocadillo");
                    int id = scanner.nextInt();
                    tiposDeBocadillos.remove(id - 1);
                    System.out.println("Producto eliminado :)");
                }
                case 2 -> {
                    System.out.println("ID de Bebida");
                    int id = scanner.nextInt();
                    tipoBebidas.remove(id - 1);
                    System.out.println("Producto eliminado :)");
                }
                case 3 -> {
                    System.out.println("ID del Cafe");
                    int id = scanner.nextInt();
                    cafes.remove(id - 1);
                    System.out.println("Producto eliminado :)");
                }
            }
        }
    }

    public void mostrarProductos() {
        ControlProducto bocadillos = new ControlProducto(1,"Bocadillos");
        ControlProducto bebidas = new ControlProducto(2, "Bebidas");
        ControlProducto cafes = new ControlProducto(3, "Cafes");

        ArrayList<ControlProducto> categoriaList = new ArrayList<>();

        categoriaList.add(bocadillos);
        categoriaList.add(bebidas);
        categoriaList.add(cafes);

        int opcionProducto = 0;

        while (opcionProducto != 4) {

            for (ControlProducto c : categoriaList) {
                System.out.println(c.getId() + ". " + c.getNom());
            }
            System.out.println("4. Salir");

            System.out.println("Elige un prodcto:");

            opcionProducto = scanner.nextInt();

            switch (opcionProducto) {
                case 1 -> listarBocadillos();
                case 2 -> listarbebidas();
                case 3 -> listarCafes();
                case 4 -> System.out.println("saliendo...");
                default -> System.out.println("Selecciona una opcion entre 1-3");
            }
        }
    }
}
