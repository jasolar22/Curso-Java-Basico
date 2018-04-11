package paquete;

public class mainFileText {

    public static void main(String[] args) {

        ReadFileText t= new ReadFileText();
        t.leer("archivo.txt");

        // crear un archivo

        t.escribir("escrito.txt");

    }
}
