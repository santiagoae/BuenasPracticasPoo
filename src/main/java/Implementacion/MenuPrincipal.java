package Implementacion;

import Clases.Biblioteca;
import Clases.Cancion;
import java.util.Scanner;

/**
 *
 * @author Santiago Avendaño y Andres Lopez
 */
public class MenuPrincipal {

    int op, op2;
    Scanner teclado = new Scanner(System.in);
    Biblioteca b = new Biblioteca();

    public void Menu() {

        System.out.println("|---------------------------------------------------|");
        System.out.println("|1. Mostrar Biblioteca de musica                    |");
        System.out.println("|2. Filtrar Canciones por genero                    |");
        System.out.println("|3. Filtrar Canciones por año                       |");
        System.out.println("|4. Ordenar canciones por Duracion                  |");
        System.out.println("|5. Ordenar canciones por año                       |");
        System.out.println("|6. Crear PlayList                                  |");
        System.out.println("|0. Salir                                           |");
        System.out.println("|---------------------------------------------------|");
        this.op = teclado.nextInt();
        switch (op) {
            case 1:
                b.Mostrar();
                Menu();
                break;
            case 2:
                b.FiltrarCancionesMismoGenero();
                Menu();
                break;
            case 3:
                b.FiltrarCancionesMismoAño();
                Menu();
                break;
            case 4:
                b.OrdenarDuracion();
                Menu();
                break;
            case 5:
                b.OrdenarAño();
                Menu();
                break;
            case 6:
                do {
                    System.out.println("|---------------------------------------------------|");
                    System.out.println("|Bienvenido al apartado de creacion de playList     |");
                    System.out.println("|1. Añadir Cancion a la playList                    |");
                    System.out.println("|2. Mostrar PlayList                                |");
                    System.out.println("|3. Salir                                           |");
                    System.out.println("|---------------------------------------------------|");
                    this.op2 = teclado.nextInt();
                    if (op2 == 1) {
                        b.PlayList();

                    } else if (op2 == 2) {
                        b.MostrarPlayList();
                    }

                } while (op2 != 3);
                Menu();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public void LlenarBibilioteca() {

        Cancion c = new Cancion();
        Cancion c1 = new Cancion();
        Cancion c2 = new Cancion();
        Cancion c3 = new Cancion();
        Cancion c4 = new Cancion();
        Cancion c5 = new Cancion();
        Cancion c6 = new Cancion();
        Cancion c7 = new Cancion();
        Cancion c8 = new Cancion();
        

        c.setCaratula("Linda");
        c.setDescripcion("muy buena");
        c.setDuracion(3.5);
        c.setAño(2004);
        c.setGenero("Salsa");
        c.setId(0);
        c.setTitulo("Sobeteo");

        b.Llenar(0, c);

        c1.setCaratula("estrella");
        c1.setDescripcion("muy buena");
        c1.setDuracion(4);
        c1.setAño(2020);
        c1.setGenero("Salsa");
        c1.setId(1);
        c1.setTitulo("Guayoteo");

        b.Llenar(1, c1);

        c2.setCaratula("Rombo");
        c2.setDescripcion("muy buena");
        c2.setDuracion(4.3);
        c2.setAño(2021);
        c2.setGenero("Cumbion");
        c2.setId(2);
        c2.setTitulo("Bailoteo");

        b.Llenar(2, c2);

        c3.setCaratula("Cuadrado");
        c3.setDescripcion("muy buena");
        c3.setDuracion(2.4);
        c3.setAño(2018);
        c3.setGenero("Salsa");
        c3.setId(3);
        c3.setTitulo("Estregueteo");

        b.Llenar(3, c3);
        
        c4.setCaratula("Rectangulo");
        c4.setDescripcion("muy buena");
        c4.setDuracion(2.4);
        c4.setAño(2018);
        c4.setGenero("Cumbion");
        c4.setId(4);
        c4.setTitulo("CumbiaMetalera");

        b.Llenar(4, c4);
        
        c5.setCaratula("Queroso");
        c5.setDescripcion("muy buena");
        c5.setDuracion(2.4);
        c5.setAño(2009);
        c5.setGenero("Merengue");
        c5.setId(5);
        c5.setTitulo("Merengon");

        b.Llenar(5, c5);
        
        c6.setCaratula("pesima");
        c6.setDescripcion("muy buena");
        c6.setDuracion(5.6);
        c6.setAño(2004);
        c6.setGenero("Regueton");
        c6.setId(6);
        c6.setTitulo("LosTraques");

        b.Llenar(6, c6);
        
        c7.setCaratula("Maso");
        c7.setDescripcion("muy buena");
        c7.setDuracion(2);
        c7.setAño(2001);
        c7.setGenero("Cumbion");
        c7.setId(7);
        c7.setTitulo("BotasDomingueras");

        b.Llenar(7, c7);
        
        c8.setCaratula("feo");
        c8.setDescripcion("muy buena");
        c8.setDuracion(2.8);
        c8.setAño(2004);
        c8.setGenero("Regueton");
        c8.setId(8);
        c8.setTitulo("Raise");

        b.Llenar(8, c8);

    }
}
