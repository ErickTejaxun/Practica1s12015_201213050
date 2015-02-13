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
public class Lista_plantas {
    public nodo_planta raiz,ultimo;
    
     public Lista_plantas(){
    
    }
    
    public boolean vacio(){
        boolean resultado=false;
        if (raiz==null){
        resultado=true;
        }
        return resultado;
    }
    
    public void insertar(nodo_planta nuevo){
        if(vacio()){
        raiz=nuevo;
        ultimo=nuevo;
        }else{
            if(raiz.siguiente==null){
            ultimo=nuevo;
            raiz.siguiente =ultimo;            
            }else{
            ultimo.siguiente=nuevo;
            ultimo=nuevo;
            }
        
        }
   
    }
    
    public void eliminar(String nombre)
    {
    
    }
    
}
