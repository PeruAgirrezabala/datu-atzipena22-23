package dambi.Test;

import java.io.File;
import java.time.LocalDate;

import dambi.Classes.Mendia;
import dambi.Classes.Mendiak;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class MendiakTest {
    public static void main(String[] args){
        try{



            Mendia albertia= new Mendia();
            albertia.setIzena("Albertia");
            albertia.setAltuera(868);
            albertia.setProbintzia("Araba");

            Mendia alluitz = new Mendia();
            alluitz.setIzena("Alluitz");
            alluitz.setAltuera(1034);
            alluitz.setProbintzia("Bizkaia");


            Mendia anboto = new Mendia();
            anboto.setIzena("Anboto");
            anboto.setAltuera(1331);
            anboto.setProbintzia("Bizkaia");

            Mendiak mendiak = new Mendiak();
            mendiak.add(anboto);
            mendiak.add(alluitz);
            mendiak.add(albertia);

                        /* init jaxb marshaler */
                        JAXBContext jaxbContext = JAXBContext.newInstance( Mendiak.class );
                        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
                        /* set this flag to true to format the output */
                        jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
            
                        /* marshaling of java objects in xml (output to file and standard output) */
                        jaxbMarshaller.marshal( mendiak, new File( "list_mendiak.xml" ) );
                        jaxbMarshaller.marshal( mendiak, System.out );

        }catch(JAXBException e){
            e.printStackTrace();
        }
    }
}
