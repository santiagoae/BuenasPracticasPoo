package Clases;

import java.util.Comparator;

/**
 *
 * @author Santiago Avendaño y Andres Lopez
 */
public class CompararDuracion implements Comparator<Cancion> {

    @Override
    public int compare(Cancion c1, Cancion c2) {
        if (c2.getDuracion() > c1.getDuracion()) {
            return -1;
        } else if (c2.getDuracion() > c1.getDuracion()) {
            return 0;
        } else {
            return 1;
        }
    }
}
