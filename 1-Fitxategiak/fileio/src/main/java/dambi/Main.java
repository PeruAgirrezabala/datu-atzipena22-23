package dambi;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
import java.nio.file.attribute.*;


/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int aukera = 0;
        do {
            System.out.println();
            System.out.println("MENUAREN IZENBURUA");
            System.out.println("====================================");
            System.out.println("1.- Karpetak aurkitu");
            System.out.println("2.- Fitxategi baten lehen mailako informazioa eskuratu");
            System.out.println("3.- ...");
            System.out.println("4.- ...");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = in.nextInt();
            switch (aukera) {
                case 1:
                    Scanner an = new Scanner(System.in);
                    System.out.println("Sartu ezazu egiaztatu nahi duzun karpetaren helbidea-->");
                    String g=an.next();
                    
                    fAurkitu(g);
                    break;
                case 2:
                    Scanner en = new Scanner(System.in);
                    System.out.println("Sartu ezazu egiaztatu nahi duzun karpetaren izena-->");
                    g=en.next();
                    basicFileAttributes(g);
                    break;

                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
        in.next();
}

public static void fAurkitu(String g){
    Path path =Paths.get(g);
    if(Files.exists(path)){
        System.out.println("existitzen da");

    }else{
        System.out.println("ez da existitzen");
    }
}

public static void basicFileAttributes(String g){
    File file = new File(g);
    Path path = Paths.get(file.getAbsolutePath());
    BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);

    System.out.println("creationTime: " + attr.creationTime());
    System.out.println("lastAccessTime: " + attr.lastAccessTime());
    System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

     System.out.println("isDirectory: " + attr.isDirectory());
     System.out.println("isOther: " + attr.isOther());
     System.out.println("isRegularFile: " + attr.isRegularFile());
     System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
     System.out.println("size: " + attr.size());

}
}
