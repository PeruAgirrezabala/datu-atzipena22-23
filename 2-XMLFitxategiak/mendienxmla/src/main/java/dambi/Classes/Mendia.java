package dambi.Classes;


import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlType( propOrder = { "izena", "altuera", "probintzia"} )
@XmlRootElement( name = "Mendia" )
public class Mendia{

    String izena;
    int altuera;
    String probintzia;

    public String getIzena(){
        return izena;
    }
    public int getAltuera(){
        return altuera;
    }
    public String getProbintzia(){
        return probintzia;
    }

    @XmlElement(name = "Mendia_izena")
    public void setIzena(String izena){
        this.izena=izena;
    }
    @XmlElement(name= "Mendia_altuera")
    public void setAltuera(int altuera){
        this.altuera=altuera;
    }
    @XmlElement(name= "Mendia_probintzia")
    public void setProbintzia(String probintzia){
        this.probintzia= probintzia;
    }
    @Override
    public String toString(){
        StringBuffer str = new StringBuffer("Izena: "+ getIzena()+"/n");
        str.append("Altuera: "+ getAltuera()+"/n");

        if( getProbintzia() != null )
        {
            str.append( getProbintzia().toString() );
            str.append( "\n" );
        }
        return str.toString();
    }
}
