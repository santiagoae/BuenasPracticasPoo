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
    public void Mostrar(ArrayList<Cancion> c) {
        for (int i = 0; i < c.size(); i++) {
            c.get(i).Mostrar();
        }
    }

    @Override
    public void Ordenar() {    
        Collections.sort(Canciones, new CompararCanciones());
        Mostrar(Canciones);
    }
    
    
        
        
    
    public void MostrarPorGenero(){
        if (cont > 0) {
            for (int i = 0; i < EncontradoPorGenero.size(); i++) {
                EncontradoPorGenero.get(i).Mostrar();
                System.out.println();
            }
        } else {
            System.out.println("El genero no se encontro");
        }
    }
    
    public void MostrarPorAño(){
        if (cont > 0) {
            for (int i = 0; i < EncontradoPorAño.size(); i++) {
                EncontradoPorAño.get(i).Mostrar();
                System.out.println();
            }
        } else {
            System.out.println("El Año no se encontro");
        }
    }

}
