package dambi;


import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlType(propOrder = {"izena","altuera","probintzia"})
@XmlRootElement(name="Mendia")
public class Mendia {
    int id=0;
    String izena;
    int altuera;
    String probintzia;
    String mendia;

    public int getId(){
        return id;
    }
    public String getIzena(){
        return izena;
    }
    public int getAltuera(){
        return altuera;
    }
    public String getProbintzia(){
        return probintzia;
    }
    @XmlAttribute(name="Mendia_Id")
    public void setId(int id){
        this.id=id;
    }
    @XmlElement(name="Mendia_Izena")
    public void setIzena(String izena){
        this.izena=izena;
    }
    @XmlElement(name = "Mendia_Altuera")
    public void setAltuera(int altuera){
        this.altuera=altuera;
    }
    @XmlElement(name = "Mendia_Probintzia")
    public void setProbintzia(String probintzia){
        this.probintzia=probintzia;
    }
    @XmlElement(name = "Mendia")
    public void setMendia(String mendia) {
        this.mendia = mendia;
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
