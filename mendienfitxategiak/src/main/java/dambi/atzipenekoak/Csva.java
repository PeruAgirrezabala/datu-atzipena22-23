package dambi.atzipenekoak;

import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

import dambi.Mendia;
import dambi.Mendiak;

public class Csva {

    public String strFileIn;
    public String strFileOut;

    public Csva(String fileIn) {
        strFileIn = fileIn;
    }

    public Csva(String fileIn, String fileOut) {
        strFileIn = fileIn;
        strFileOut = fileOut;
    }

    public Mendiak irakurri() {
        Mendiak mendiak = null;
        try (BufferedReader inputStream = new BufferedReader(new FileReader(strFileIn))) {
            String banatzailea = ",";
            String l;
            mendiak = new Mendiak();
            while ((l = inputStream.readLine()) != null) {
                String[] eremuak = l.split(banatzailea);
                if (!eremuak[0].equals("MENDIA")) {
                    Mendia mendia = new Mendia(); 
                    mendia.setId(mendiak.getMendiak() == null ? 0 :mendiak.getMendiak().size());
                    mendia.setIzena(eremuak[0]);
                    mendia.setAltuera(Integer.parseInt(eremuak[1]));
                    mendia.setProbintzia(eremuak[2]);
                    mendiak.add(mendia);
                }
            }

        }
        // System.out.println(mendiak.getMendiak());
        catch (FileNotFoundException e) {
            System.out.println("Ez da " + strFileIn + " fitxategia aurkitu.");

        } catch (IOException e) {
            System.out.println("IOsalbuespena gertatu da.");
        }

        return mendiak;
    }

    public int idatzi(Mendiak mendiak) {
        int mendikopurua = 0;
        try (PrintWriter outputStream = new PrintWriter(new FileWriter(strFileOut))) 
        {
            for (Mendia m : mendiak.getMendiak()) 
            {
                if(mendikopurua==0)
                {
                        outputStream.println("MENDIA;ALTUERA;PROBINTZIA");
                }
                mendikopurua++;
                outputStream.println(m.getIzena()+";"+m.getAltuera()+"+"+m.getProbintzia());               
            }

        }
        catch (IOException e) {
            System.out.println(strFileOut + " fitxategiarekin arazoren bat egon da.");
        }

        return mendikopurua;
    }
}
