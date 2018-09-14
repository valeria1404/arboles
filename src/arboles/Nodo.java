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
public class Nodo {
    /*declaracion de variables*/
      private int valor;
      
      private Nodo nodoPadre;
      private Nodo hojaIzq;
      private Nodo hojaDer;
    
      /*Connstructor*/
      
      public Nodo()
      {
          this.valor = valor;
      }
        
      Nodo nodo = new Nodo(1);
      
    private Nodo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
      /*se obtienen getters and setters*/

      public void setValor(int valor) {
          this.valor = valor;
      }
      
      public int getValor(){
          return valor;
      }
      
      public void setNodoPadre(Nodo nodoPadre){
          this.nodoPadre = nodoPadre;
      }
      
      public Nodo getNodoPadre(){
          return nodoPadre;
      }
      
      public void setHojaIzq(Nodo hojaIzq){
          this.hojaIzq = hojaIzq;
      }
      
      public Nodo getHojaIzq(){
          return hojaIzq;
      }
      
      public void setHojaDer(Nodo hojaDer){
          this.hojaDer = hojaDer;
      }
      
      public Nodo getHojaDer(){
          return hojaDer;
      }
      
}
