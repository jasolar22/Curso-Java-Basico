package paquete;

import java.util.Stack;

public class Main {
    /**
     * push introduce un dato a la pila
     * pop  elimina el utimo dato de la pila
     * peek  ver cual es ultimo de dato en la piña
     * empty  para saber si tiene datos la pila
     * @param args
     */

    public static void main(String[] args) {

        // FILO first-in, last-out
        Stack pila = new Stack();
        pila.push("50");
        pila.push("12");
        pila.push("Escribir");
        pila.push("Pruebas");

        /* solo se puede obtener el ultimo valor
            peek para ver y el metodo pop para obtener y eliminar
        */
        System.out.println("El último elemento en la pila es: "+pila.peek());

        while (pila.empty()==false)
        {
            System.out.println(pila.pop());
        }
    }
}
