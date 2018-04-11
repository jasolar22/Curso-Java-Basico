package paquete;

import java.io.*;

public class ReadFileText {
    public void leer(String nombreArchivo) {

        String temp="";
        try {
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer= new BufferedReader(r);
            // System.out.println(buffer.readLine());
            while (temp!=null)
            {
                temp=buffer.readLine();
                if(temp==null)
                {
                    break;
                }
                System.out.println(temp);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void escribir(String nameFile)
    {
        File f; // crea un objeto de tipo archivo
        f=new File(nameFile); // se asigna un nombre al archivo
        // Escritura
        try
        {
            FileWriter w =new FileWriter(f); // FileWriter
            BufferedWriter bw= new BufferedWriter(w); // BufferedWriter
            PrintWriter wr= new PrintWriter(bw); //PrintWriter

            wr.append(" - esto es una concatenación al texto");
            wr.close();
            bw.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        };
    }
}
