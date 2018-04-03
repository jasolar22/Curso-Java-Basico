package main;

public class breakContinue {

    public static void main(String[] args) {

        for(int cont=0;cont<=10;cont++)
        {
          //  System.out.println("Dentro del FOR");
            if(cont==4)
            {
                System.out.println("Lllege a "+cont +" continuare ..");
             continue;
            }
            System.out.println("El valor del contador es: "+cont);
        }
        System.out.println("Salio del FOR");

    }
}
