package dambi;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement( name = "Mendiak" )
public class Mendiak {



    List<Mendia> mendiak;

    public List<Mendia> getMendiak(){
        return mendiak;
    }
    

    @XmlElement( name="Country")
    public void setMendiak(List<Mendia> mendiak){

        this.mendiak=mendiak;
    }

    public void add(Mendia mendia){
        if(this.mendiak== null){
            this.mendiak=new ArrayList<Mendia>();
        }
        this.mendiak.add(mendia);
    }
    public String toString(){
        StringBuffer str = new StringBuffer();
        for(Mendia mendia : this.mendiak){
            str.append(mendia.toString());

        }
        return str.toString();
    }
}