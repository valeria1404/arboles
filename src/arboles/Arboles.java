/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arboles {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Arbol arbol = new Arbol();
        int valor;
        String dato;
        System.out.println("Instertando los siguientes valores:");
        dato = JOptionPane.showInputDialog("Inserta el número de nodos que tendrá el árbol");
        int n = Integer.parseInt(dato);
        for (int i = 1; i <= n; i++) {
            dato = JOptionPane.showInputDialog("Muestra el " + i + " valor que tendrá el árbol");
            valor = Integer.parseInt(dato);
            System.out.println(valor + " ");
            arbol.insertarNodo(valor);
        }
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Arboles \n\n 1.Recorrido PreOrden\n 2.Recorrido InOrden\n 3.Recorrido PostOrden\n 0.Salir"));
        System.out.println(opcion + "");
        try {
            switch (opcion) {
                case 1:
                    System.out.println("\n Recorrido PreOrden");
                    arbol.recorridoPreOrden();
                    break;
                case 2:
                    System.out.println("\n Recorrido InOrden");
                    arbol.recorridoInOrden();
                    break;
                case 3:
                    System.out.println("\n Recorrido PostOrden");
                    arbol.recorridoPostOrden();
                    break;
                case 0:
                    System.out.println("\n Termino el Recorrido");
                    break;

                default:
                    System.out.println("\n Fuera del Case");
            }
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Error!");
        }

    }
}
