package main;

public class fibonacci {

    public static void main(String[] args) {

        // Serie de número impares
        for(int i=0;i<=20;i++)
        {
            if((i%2)!=0)
            {
                System.out.println(i);
            }
        }

        // Fibonacci
        int x=1;
        int anterior=0;
        int temp;

        while (true)
        {
            System.out.println(x);
            temp=x;
            x=x+anterior;
            anterior=temp;

            if(x>30)
            {
                break;
            }
        }
    }
}
