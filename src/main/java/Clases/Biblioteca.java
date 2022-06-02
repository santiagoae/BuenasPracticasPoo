/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaz.BibliotecaInterfaz;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Santiago Avendaño y Andres Lopez 
 */
public class Biblioteca implements BibliotecaInterfaz {
    Scanner teclado = new Scanner(System.in);
    private  Cancion Tema = new Cancion();
    private  ArrayList<Cancion> Canciones = new ArrayList<Cancion>(); 

    public Cancion getTema() {
        return Tema;
    }
    
    public void setTema(Cancion c){
        this.Tema = c;
        
    }

    public ArrayList<Cancion> getCanciones() {
        return Canciones;
    }
    
    public void Llenar(){
        
        Canciones.add(getTema()); 
        
    }
    

    @Override
    public void FiltrarCancionesMismoGenero() {
        System.out.println("Digite el genero a buscar");
        String Genero = teclado.next();
        int posicion = Canciones.indexOf(Genero);
        if (posicion >= 0)
            Canciones.get(posicion).Mostrar();
            else
            System.out.println("El elemento " + Genero + " NO está en la lista");
}

    @Override
    public void FiltrarCancionesMismoAño() {
        
    }

    @Override
    public void Mostrar() {
        
    }

    @Override
    public void Ordenar() {
        
    }
    
    
}
