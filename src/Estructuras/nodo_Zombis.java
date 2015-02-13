/*
 * To change this licepnse header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Erick
 */
public class nodo_Zombis {
    public String nombre;
    public String pathimagen;
    public int ataque;
    public int defensa;
    public String tipo;
    public nodo_Zombis siguiente;
    
    public nodo_Zombis(String nombre,String path,int ataque,int defensa, String tipo){
    this.nombre=nombre;
    this.pathimagen=path;
    this.ataque=ataque;
    this.defensa=defensa;
    this.tipo=tipo;
    
    }
}
