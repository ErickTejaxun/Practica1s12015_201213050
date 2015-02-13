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
public class nodo_atributo {
    public String nombre;
    public String dato;
    public nodo_atributo siguiente;
    
    public nodo_atributo(String nombre, String dato){
    this.nombre=nombre;
    this.dato=dato;
    }
}
