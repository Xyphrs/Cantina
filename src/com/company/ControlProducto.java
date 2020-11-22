package com.company;

import jdk.jshell.spi.SPIResolutionException;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlProducto {

    private int id;
    private String nom;
    private int opcion;
    static ArrayList<Productos> tiposDeBocadillos = new ArrayList<>();
    static ArrayList<Productos> tipoBebidas = new ArrayList<>();
    static ArrayList<Productos> cafes = new ArrayList<>();

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

    public ArrayList<Productos> getTiposDeBocadillos() {
        return tiposDeBocadillos;
    }

    public void setTiposDeBocadillos(ArrayList<Productos> tiposDeBocadillos) {
        ControlProducto.tiposDeBocadillos = tiposDeBocadillos;
    }

    public ArrayList<Productos> getTipoBebidas() {
        return tipoBebidas;
    }

    public void setTipoBebidas(ArrayList<Productos> tipoBebidas) {
        ControlProducto.tipoBebidas = tipoBebidas;
    }

    public ArrayList<Productos> getCafes() {
        return cafes;
    }

    public void setCafes(ArrayList<Productos> cafes) {
        ControlProducto.cafes = cafes;
    }



    public void getProductes() {
        ControlProducto.tiposDeBocadillos.add(new Productos(1,"Queso", 1.10f));
        ControlProducto.tiposDeBocadillos.add(new Productos(2,"Bacon", 1.50f));
        ControlProducto.tiposDeBocadillos.add(new Productos(3,"Vegetal", 1.50f));

        ControlProducto.tipoBebidas.add(new Productos(1,"Agua", 1.00f));
        ControlProducto.tipoBebidas.add(new Productos(2,"CocaCola", 1.20f));
        ControlProducto.tipoBebidas.add(new Productos(3,"Fanta Naranja", 1.20f));

        ControlProducto.cafes.add(new Productos(1,"Café Cortado", 1.10f ));
        ControlProducto.cafes.add(new Productos(2,"Café Largo", 1.10f));
        ControlProducto.cafes.add(new Productos(3,"Café Capuchino", 1.15f ));
    }

    public ArrayList<Productos> listarBocadillos() {
        return tiposDeBocadillos;
    }

    public ArrayList<Productos> listarbebidas()  {
        return tipoBebidas;
    }

    public ArrayList<Productos> listarCafes()  {
        return cafes;
    }
}