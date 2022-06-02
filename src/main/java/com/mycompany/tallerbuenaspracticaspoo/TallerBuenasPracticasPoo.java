package com.mycompany.tallerbuenaspracticaspoo;

import Clases.Biblioteca;
import Clases.Cancion;
import java.util.Collections;

/**
 *
 * @author Santiago Avendaño y Andres Lopez 
 */
public class TallerBuenasPracticasPoo {

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        Cancion c = new Cancion();
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion();
        Cancion c3 = new Cancion();
        c.setCaratula("Linda");
        c.setDescripcion("muy buena");
        c.setDuracion(2.5);
        c.setAño(2025);
        c.setGenero("Salsa");
        c.setId(0);
        c.setTitulo("Sobeteo guayoteo ft pitbull");      
        
        b.Llenar(0,c);
        
        
        c1.setCaratula("estrella");
        c1.setDescripcion("muy buena");
        c1.setDuracion(2.5);
        c1.setAño(2020);
        c1.setGenero("Bachata");
        c1.setId(0);
        c1.setTitulo("Sobeteo guayoteo ft randy");      
        
        b.Llenar(1,c1);
        
        c2.setCaratula("estrella");
        c2.setDescripcion("muy buena");
        c2.setDuracion(2.5);
        c2.setAño(2021);
        c2.setGenero("Vallenato");
        c2.setId(0);
        c2.setTitulo("Sobeteo guayoteo ft nota loca");      
        
        b.Llenar(2,c2);
        
        c3.setCaratula("estrella");
        c3.setDescripcion("muy buena");
        c3.setDuracion(2.5);
        c3.setAño(2018);
        c3.setGenero("Salsa");
        c3.setId(0);
        c3.setTitulo("Sobeteo guayoteote ft nota reloca");      
        
        b.Llenar(3,c3);
        
        b.Ordenar();
        
        b.FiltrarCancionesMismoAño();
        b.FiltrarCancionesMismoGenero();
    }
}
