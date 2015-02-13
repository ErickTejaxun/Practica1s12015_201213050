/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Erick
 */
public class nodo_jugador {
  
    public String nombre_jugador;
    public int numero_personajes;
    public String tipo_jugador;
    public nodo_jugador siguiente;  
    public Lista_atributo atributos; 
    
    public nodo_jugador(String nombre_jugador,int numero_personajes, String tipo_jugador){
     this.nombre_jugador=nombre_jugador;
     this.numero_personajes=numero_personajes;
     this.tipo_jugador=tipo_jugador;
    }
    
}
