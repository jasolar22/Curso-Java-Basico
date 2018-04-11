package paquete;

import java.util.LinkedList;

public class Main {


    public static void main(String[] args) {
       LinkedList lista= new LinkedList();

       lista.add("palabra");
       lista.add(34);
       lista.add(17);
       lista.add("palabra 2");
       lista.add("palabra 3");


       lista.remove(2);
        System.out.println("El tamaño de la lista es: " + lista.size());

        for (int j=0;j<lista.size();j++) {
            System.out.println(lista.get(j));
        }

    }
}
