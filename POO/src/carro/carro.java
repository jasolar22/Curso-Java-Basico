package carro;

public class carro {

    public boolean encenderCarro(boolean encender)
    {
        boolean bandera=false;
        if (encender)
        {
            System.out.println("Se encendio el auto");
            bandera=true;
        }
        else {
            System.out.println("No se pudo encender el auto");
        }
        return bandera;
    }

    public String apagarCarro()
    {
        System.out.println("Voy a apagar el carro");

        return "off";
    }

   /* Se pueden agregar mas funciones que pueden utilizarce
   en otras clases.
    */


}
