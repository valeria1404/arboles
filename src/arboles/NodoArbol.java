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
public class NodoArbol {

    int datos;
    NodoArbol nodoIzquierdo;
    NodoArbol nodoDerecho;

    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzquierdo = nodoDerecho = null; //Nodo vacío
    }
    
    //Insertar un nuevo Nodo
    
    public synchronized void insertar(int valorInsertar){
        
        //Inserta lado Izquierdo
        if(valorInsertar < datos)
            
            if(nodoIzquierdo == null)
                nodoIzquierdo = new NodoArbol(valorInsertar);
            else
                nodoIzquierdo.insertar(valorInsertar);
            
        
        //Inserta en lado derecho
        else if(valorInsertar > datos)
            
            if(nodoDerecho == null)
                nodoDerecho = new NodoArbol(valorInsertar);
            else
                nodoDerecho.insertar(valorInsertar);
            
    }
}
