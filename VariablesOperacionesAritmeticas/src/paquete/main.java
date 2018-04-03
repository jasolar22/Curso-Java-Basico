package paquete;

public class main {

    public static void main(String[] args) {

   /*
    boolean : Tipo de dato que solo puede ser verdadero (true) o falso (false). ¡Imagínate una bombilla que se enciede y apaga! Eso es un booleano.
    byte : Dato entero que no puede guardar valores grandes ni pequeños. Concretamente entre -128 y 127.
    char : Tan sencillo como un caracter. Pueden ser letras, números o caracteres especiales. Por ejemplo ‘H’, ‘g’, incluso un número, ‘8’.
    float : Los decimales pueden ser guardados mediante este tipo de dato. ¡Pero cuidado! A veces pueden ser poco precisos.
    double : ¡El lugar indicado para guardar decimales! Tiene mucha más precisión que ‘float’ y es el más utilizado.
    int : El tipo de dato más utilizado. Nos permite guardar enteros en un amplio rango de valores.
    long : Para cuando ‘int’ no es suficiente. ‘long’ permite guardar números enteros enormes.
    short : Guarda también valores enteros en un rango de valores inferior a ‘int’.
    */

        short suma=3+10;
        int resta=8-17;
        long residuo= 9%2;
        float multiplicacion= 2*(15*(-2));
        double division= 10/3.4;

        System.out.println("El resultado de la suma es: " + suma); // suma
        System.out.println("El resultado de la resta es: "+resta); //resta
        System.out.println("El resultado de la multiplicación "+ multiplicacion); // multiplicación
        System.out.println("El resultado de la división es: "+division); //división
        System.out.println("El residuo de la división es: "+residuo); //modulo o residuo

    }
}
