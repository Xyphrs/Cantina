package com.company;

public class Productos {
    private int id;
    private String nom;
    private float precio;

    public Productos(int id, String nom, float precio) {
        this.id = id;
        this.nom = nom;
        this.precio = precio;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", precio=" + precio +
                '}';
    }
}
