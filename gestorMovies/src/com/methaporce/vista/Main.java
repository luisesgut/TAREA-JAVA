package com.methaporce.vista;
import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestorPelicula gestor = new GestorPelicula();
        boolean continuar = true;
        int opcion = 0;

        while (continuar) {
            System.out.println("1. Crear Pelicula");
            System.out.println("2. Marcar Pelicula como Disponible");
            System.out.println("3. Eliminar Pelicula");
            System.out.println("4. Listar Peliculas");
            System.out.println("5. Listar Peliculas Disponibles");
            System.out.println("6. Listar Peliculas No disponibles");
            System.out.println("7. Salir");

            System.out.println("Escribe tu opcion:");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID de la película:");
                    int id = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer

                    System.out.println("Ingrese el nombre de la película:");
                    String nombre = sc.nextLine();

                    System.out.println("¿Está disponible? (true/false):");
                    boolean disponible = sc.nextBoolean();

                    Pelicula nueva = new Pelicula(id, nombre, disponible);
                    gestor.agregarPelicula(nueva);
                    System.out.println(" Película agregada.");
                    break;
                case 2:
                    System.out.println("Ingrese el ID de la película:");
                    int id3 = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer
                    gestor.marcarPeliculaComoDisponible(id3);
                    System.out.println(" Película Marcada como Disponible.");
                    break;

                case 3:
                    System.out.println("Ingrese el ID de la película:");
                    int id2 = sc.nextInt();
                    sc.nextLine();
                    gestor.eliminarPelicula(id2);
                    System.out.println("Pelicula eliminada.");
                    break;
                case 4:
                    List<Pelicula> todas = gestor.obtenerPeliculas();
                    for (Pelicula p : todas) {
                        System.out.println("ID: " + p.getId() + " | Nombre: " + p.getNombre() + " | Disponible: " + p.isDisponible());
                    }
                    break;
                case 5:
                    List<Pelicula> todasDisponibles = gestor.obtenerPeliculasDisponibles();
                    for (Pelicula p : todasDisponibles) {
                        System.out.println("ID: " + p.getId() + " | Nombre: " + p.getNombre() + " | Disponible: " + p.isDisponible());
                    }
                    break;
                case 6:
                    List<Pelicula> todasNoDisponibles = gestor.obtenerPeliculasNoDisponibles();
                    for (Pelicula p : todasNoDisponibles) {
                        System.out.println("ID: " + p.getId() + " | Nombre: " + p.getNombre() + " | Disponible: " + p.isDisponible());
                    }
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Saliendo...");
                    break;





            }
        }

    }
}