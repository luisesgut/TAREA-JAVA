package com.methaporce.modelo;

//atributos
public class Pelicula {
    private int id;
    private String nombre;
    private boolean disponible;

    //constructores
    public Pelicula() {}

    public Pelicula (int id, String matricula, boolean disponible){
    this.id = id;
    this.nombre = matricula;
    this.disponible = disponible;
    //cambio pequeño

    }
//getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }
//setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

