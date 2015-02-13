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
public class nodo_planta {
    public String nombre;
//    public icon imagen;
    public int ataque;
    public int defensa;
    public String tipo;
    public String pathimagen;
    public nodo_planta siguiente;
    
    public nodo_planta(String nombre,String path, int ataque, int defensa, String tipo){
    this.nombre=nombre;
    this.ataque=ataque;
    this.defensa=defensa;
    this.tipo=tipo;   
    this.pathimagen=path;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getTipo() {
        return tipo;
    }

    public nodo_planta getSiguiente() {
        return siguiente;
    }
  
    
}
