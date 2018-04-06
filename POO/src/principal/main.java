package principal;

import carro.carro;

public class main {

    public static void main(String[] args) {

        carro c= new carro();
        String apagar="";

        boolean resp=c.encenderCarro(true); // función de la clase Carro
        if(resp)
        {
            apagar=c.apagarCarro(); // este es otra función de la clase Carro
        }
        if (apagar=="off")
        {
            System.out.println("Se apago el Carro");
        }

    }
}
