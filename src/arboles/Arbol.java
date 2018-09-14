/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author dgnm.valeria
 */
public class Arbol {
    
   private NodoArbol raiz;
    
   public Arbol(){
       raiz = null;
   }
   
   //Inserta un nuevo nodo
   public synchronized void insertarNodo(int valorInsertar){
      
       if(raiz == null)
           raiz = new NodoArbol(valorInsertar);
        else
           raiz.insertar(valorInsertar);
       
       
   }
       
       //Recorrido PreOrden
       public synchronized void recorridoPreOrden(){
           preOrden(raiz);
       }
       private void preOrden(NodoArbol nodo){
           if(nodo == null)
           return;
           System.out.println(nodo.datos + " ");
           preOrden(nodo.nodoIzquierdo);
           preOrden(nodo.nodoDerecho);
       }
       
        //Recorrido InOrden
       public synchronized void recorridoInOrden(){
           inOrden(raiz);
       }
       private void inOrden(NodoArbol nodo){
           if(nodo == null)
           return;
           
           inOrden(nodo.nodoIzquierdo);
           System.out.println(nodo.datos + " ");
           inOrden(nodo.nodoDerecho);
       }
       
       //Recorrido InOrden
       public synchronized void recorridoPostOrden(){
           postOrden(raiz);
       }
       private void postOrden(NodoArbol nodo){
           if(nodo == null)
           return;
           
           postOrden(nodo.nodoIzquierdo);
           System.out.println(nodo.datos + " ");
           postOrden(nodo.nodoDerecho);
       }
   }
    
