package Clases;

import Interfaz.BibliotecaInterfaz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Santiago Avendaño y Andres Lopez
 */
public class Biblioteca implements BibliotecaInterfaz {

    int cont = 0;
    Scanner teclado = new Scanner(System.in);
    ArrayList<Cancion> EncontradoPorGenero = new ArrayList<>();
    ArrayList<Cancion> EncontradoPorAño = new ArrayList<>();
    private ArrayList<Cancion> Canciones = new ArrayList<>();
    ArrayList<Cancion> PlayList = new ArrayList<>();

    public void Llenar(int index, Cancion c) {
        Canciones.add(index, c);
    }

    @Override
    public void FiltrarCancionesMismoGenero() {

        System.out.println("Digite el genero a buscar:");
        String Genero = teclado.next();
        for (int i = 0; i < Canciones.size(); i++) {
            if (Canciones.get(i).getGenero().equals(Genero)) {
                EncontradoPorGenero.add(Canciones.get(i));
                cont++;
            }
        }
        MostrarPorGenero();

    }

    @Override
    public void FiltrarCancionesMismoAño() {
        System.out.println("Digite el Año a buscar:");
        int Año = Integer.parseInt(teclado.next());
        for (int i = 0; i < Canciones.size(); i++) {
            if (Canciones.get(i).getAño() == Año) {
                EncontradoPorAño.add(Canciones.get(i));
                cont++;
            }
        }
        MostrarPorAño();
    }

    @Override
    public void MostrarOrdenado(ArrayList<Cancion> c) {
        for (int i = 0; i < c.size(); i++) {
            c.get(i).Mostrar();
            System.out.println();
        }
    }

    public void Mostrar() {
        for (int i = 0; i < Canciones.size(); i++) {
            Canciones.get(i).Mostrar();
            System.out.println();
        }
    }

    @Override
    public void OrdenarAño() {
        Collections.sort(Canciones, new CompararCanciones());
        MostrarOrdenado(Canciones);
    }

    @Override
    public void OrdenarDuracion() {
        Collections.sort(Canciones, new CompararDuracion());
        MostrarOrdenado(Canciones);
    }

    public void MostrarPorGenero() {
        if (cont > 0) {
            for (int i = 0; i < EncontradoPorGenero.size(); i++) {
                EncontradoPorGenero.get(i).Mostrar();
                System.out.println();
            }
        } else {
            System.out.println("El genero no se encontro");
        }
    }

    public void MostrarPorAño() {
        if (cont > 0) {
            for (int i = 0; i < EncontradoPorAño.size(); i++) {
                EncontradoPorAño.get(i).Mostrar();
                System.out.println();
            }
        } else {
            System.out.println("El Año no se encontro");
        }
    }

    public void FiltrarPorNombre(String Can) {

        for (int i = 0; i < Canciones.size(); i++) {
            if (Canciones.get(i).getTitulo().equals(Can)) {
                PlayList.add(Canciones.get(i));
                cont++;
            }
        }

    }

    public void MostrarPlayList() {
        if (cont > 0) {
            for (int i = 0; i < PlayList.size(); i++) {
                PlayList.get(i).Mostrar();
                System.out.println();
            }
        } else {
            System.out.println("La cancion no se encontro");
        }
    }

    public void PlayList() {
        System.out.println("Que cancion deseas añadir: ");
        String nom = teclado.next();
        FiltrarPorNombre(nom);
    }

}
