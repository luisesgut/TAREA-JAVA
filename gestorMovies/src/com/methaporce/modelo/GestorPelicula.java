package com.methaporce.modelo;
import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {
   //creamos array list
   private List<Pelicula> peliculasList = new ArrayList<>();

//constructor

    public GestorPelicula() {}
    public GestorPelicula(List<Pelicula> peliculas) {
        this.peliculasList = peliculas;
    }

    //metodos
    //agregar pelicula
    public void agregarPelicula(Pelicula pelicula) {
        peliculasList.add(pelicula);
    }

    //eliminar pelicula por ID
    public void eliminarPelicula (int id) {
        for (Pelicula pelicula : peliculasList) {
            if (pelicula.getId() == id) {
                peliculasList.remove(pelicula);
                break;
            }
        }
    }

//obtener todas las peliculas
public List<Pelicula> obtenerPeliculas() {
    return peliculasList;
}


    //obtener peliculas disponibles
    public List<Pelicula> obtenerPeliculasDisponibles () {
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculasList) {
            if (pelicula.isDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    //obtener peliculas no disponibles
    public List <Pelicula> obtenerPeliculasNoDisponibles () {
        List<Pelicula> noDisponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculasList) {
            if (!pelicula.isDisponible()) {
                noDisponibles.add(pelicula);
            }
        }
        return noDisponibles;
    }

    //marcar pelicula disponible por id
   public void  marcarPeliculaComoDisponible (int id) {
        for (Pelicula pelicula : peliculasList) {
            if (pelicula.getId() == id && !pelicula.isDisponible()) {
                pelicula.setDisponible(true);
                break;
            }
        }
    }

    public Pelicula searchByName (String nombre) {
        for (Pelicula pelicula : peliculasList) {
            if (pelicula.getNombre().equals(nombre)) {
                return pelicula;
            }
        }
        return null;
    }



}
