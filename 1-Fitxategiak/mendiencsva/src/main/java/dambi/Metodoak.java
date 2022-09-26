package dambi;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

public class Metodoak {


    public List<String[]> readData() throws IOException { 
        int count = 0;
        String file = "Mendiak.csv";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
          //Some error logging
        }
        return content;
    }
    }

