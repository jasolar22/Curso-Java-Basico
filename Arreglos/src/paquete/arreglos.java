package paquete;

import java.util.StringJoiner;

public class arreglos {

    public static void main(String[] args) {

        String colores[]={"Rojo","Blanco", "Verde","Amarillo"};
        int numeros[]={1,2,3,4,5,6,7,8,9,0};
        for (int i=0;i<colores.length;i++)
        {
            System.out.println(colores[i]);
        }
        for (int j=0; j<numeros.length;j++)
        {
            System.out.println(numeros[j]);
        }

    /* recorrer array bidimencional
        A B C D E F
        G H I J K L
        M N Ñ O P Q
        R S T U V W
        X Y Z 0 1 2
*/
        String abecedario[][]={
                {"A","B","C","D","E","F"},
                {"G","H","I","J","K","L"},
                {"M","N","Ñ","O","P","Q"},
                {"R","S","T","U","V","W"},
                {"X","Y","Z","0","1","2"}
        };

for (int k=0;k<abecedario.length;k++)
{
    String aux="";
    StringJoiner cadena= new StringJoiner(",");

    for (int l=0; l<abecedario[k].length;l++)
    {
       cadena.add(abecedario[k][l]);
    }
    System.out.println(cadena);
}

    }
}
