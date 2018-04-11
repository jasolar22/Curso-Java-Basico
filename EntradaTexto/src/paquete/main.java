package paquete;

import java.io.*;
public class main {

    /*
     * @param args
     * Leer desde el teclado
     * concat()
     * toUpperCase()
     * toLowerCase()
     * length()
     * Convertir variables numericas a String y viceversa
     */

    public static void main(String[] args) {

        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader buffer= new BufferedReader(in);

        String texto="";
        try{
            System.out.println("Ingresa un Texto:");
            texto=buffer.readLine();
            texto+=" Eres bienvenido"; // concatenación corta primero el valor ingresado y despues el texto a concatenar
            int tamTexto=texto.length();
            System.out.println(texto.toUpperCase()+ " El tamaño es: "+ tamTexto);

        }catch (IOException e)
        {
            System.out.println("El valor  de la captura es incorrecto");
        }

        int numero=0;
        String nuevo_Texto="";
        try{
            System.out.println("Ingresa un número:");
            nuevo_Texto=buffer.readLine();
            numero=Integer.parseInt(nuevo_Texto);
            System.out.println("El tamaño es: "+  numero);

        }catch (Exception e)
        {
            System.out.println("El valor  de la captura es incorrecto");
        }

    }

}
