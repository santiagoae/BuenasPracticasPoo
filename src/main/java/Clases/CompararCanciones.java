/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Comparator;

/**
 *
 * @author kawa
 */
public class CompararCanciones implements Comparator<Cancion> {
        
    @Override
        public int compare(Cancion c1, Cancion c2){
            if (c2.getAño() > c1.getAño()) {                
                return -1;            
            }else if(c2.getAño() > c1.getAño()){
                return 0;
            }else{
                return 1;
            }
        }
}
