/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import Clases.Cancion;
import java.util.ArrayList;

/**
 *
 * @author Santiago Avendaño y Andres Lopez
 */
public interface BibliotecaInterfaz {

    public void FiltrarCancionesMismoGenero();

    public void FiltrarCancionesMismoAño();

    public void MostrarOrdenado(ArrayList<Cancion> c);

    public void OrdenarAño();

    public void OrdenarDuracion();
}
