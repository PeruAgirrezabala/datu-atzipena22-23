package dambi.Test;

import java.io.File;
import java.time.LocalDate;

import dambi.Classes.Mendia;
import dambi.Classes.Mendia;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

/**
 * Simple example of usage of jaxb marshaling functionalities
 * 
 * @author dgutierrez-diez
 */
public class MendiaTest {

    public static void main(String[] args)throws Exception {
        try {
            Mendia aketegi= new Mendia();
            aketegi.setIzena("Aketegi");
            aketegi.setAltuera(1548);
            aketegi.setProbintzia("Gipuzkoa");


                        /* init jaxb marshaler */
            JAXBContext jaxbContext = JAXBContext.newInstance(Mendia.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
             /* set this flag to true to format the output */
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            /* marshaling of java objects in xml (output to file and standard output) */
            jaxbMarshaller.marshal(aketegi, new File("mendia.xml"));
            jaxbMarshaller.marshal(aketegi, System.out);


        }catch (JAXBException e) {
            // TODO: handle exception
            e.printStackTrace();
        } 
    }  
    
}
