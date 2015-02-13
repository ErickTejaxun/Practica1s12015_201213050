/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombis;

import Estructuras.*;

/**
 *
 * @author Erick
 */
public class PlantasvsZombis {

    /**
     * @param args the command line arguments
     */
    public static Lista_jugadores jugadores;
    public static Lista_plantas plantas;
   
    public static void main(String[] args) {
        // TODO code application logic here
        Inicio nueva= new Inicio();
        plantas=new Lista_plantas();
       jugadores=new Lista_jugadores();
        nueva.show(true);
    }
    
}
