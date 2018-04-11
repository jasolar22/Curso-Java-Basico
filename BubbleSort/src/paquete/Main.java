package paquete;

public class Main {

    public static void main(String[] args) {

        int []arreglo={5,2,6,3,1,8};
        ordenamiento o=new ordenamiento();
        o.ordenamientoBurbuja(arreglo);

        for (int i=0; i<arreglo.length;i++)
        {
            System.out.println(arreglo[i]);
        }

    }
}
