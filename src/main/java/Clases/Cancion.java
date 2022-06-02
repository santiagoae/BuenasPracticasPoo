/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaz.BibliotecaInterfaz;

/**
 *
 * @author Santiago Avendaño y Andres Lopez 
 */
public class Cancion {
    
    private String Titulo;
    private int Id;
    private String Fecha;
    private double Duracion;
    private String Genero;
    private String Caratula;
    private String Descripcion;
    
    public Cancion(){
        
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public double getDuracion() {
        return Duracion;
    }

    public void setDuracion(double Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCaratula() {
        return Caratula;
    }

    public void setCaratula(String Caratula) {
        this.Caratula = Caratula;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
     
    public void Mostrar() {
        System.out.println("Titulo de la cancion: "+getTitulo());
        System.out.println("Indetificacion: "+getId());
        System.out.println("Fecha de la cancion: "+getFecha());
        System.out.println("Duracion de la cancion: "+getDuracion());
        System.out.println("Genero de la cancion: "+getGenero());
        System.out.println("Caratula: "+getCaratula());
        System.out.println("Descripcion: "+getDescripcion());
        
    }

   
    
       
}
