package com.mycompany.tallerbuenaspracticaspoo;

import Clases.Biblioteca;
import Clases.Cancion;

/**
 *
 * @author Santiago Avendaño y Andres Lopez 
 */
public class TallerBuenasPracticasPoo {

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        Cancion c = new Cancion();
        c.setCaratula("Linda");
        c.setDescripcion("muy buena");
        c.setDuracion(2.5);
        c.setFecha("05/06/2022");
        c.setGenero("Terror");
        c.setId(0);
        c.setTitulo("Sobeteo guayoteo ft pitbull");
        b.setTema(c);
        b.Llenar();
        b.FiltrarCancionesMismoGenero();
    }
}
