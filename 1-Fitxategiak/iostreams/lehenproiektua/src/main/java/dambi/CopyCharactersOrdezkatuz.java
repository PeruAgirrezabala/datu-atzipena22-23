package dambi;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharactersOrdezkatuz {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
                if(c==65){
                    c=79;
                }
                if(c==97){
                    c=111;
                }
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}