package paquete;

public class ordenamiento {

    public void ordenamientoBurbuja(int [] array)
    {
        int aux;
        boolean cambio=false;

        while (true)
        {
            cambio=false;
            for (int i=1;i<array.length;i++)
            {
                if(array[i]<array[i-1])
                {
                    aux=array[i];
                    array[i]=array[i-1];
                    array[i-1]=aux;
                    cambio=true;
                }
            }
            if(cambio==false)
            {
                break;
            }
        }
    }
}
