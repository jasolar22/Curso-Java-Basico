package main;

public class main {

    public static void main(String[] args) {

        /**
         * Operadores lógicos
         * >,>=,<,<=,==,!=,||,&&
         */

        // IF and ELSE
        boolean bandera=false;
        if(bandera)
        {
            System.out.println("La bander es:"+ bandera);
        }
        else
        {
            System.out.println("La bandera es: "+bandera);
        }

        // Ciclo FOR
        for (int contador=1; contador<=20; contador++)
        {
            contador=contador*2;
            System.out.println("El valor de contador es: "+contador);
        }

        // Ciclo While

        int aux=1;
        boolean bandera1=true;
        while (bandera1==true)
        {

            if( aux==10)
            {
                bandera1=false;
            }
            System.out.println(aux);
            aux=aux+1;

        }





    }
}
