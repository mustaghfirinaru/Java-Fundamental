import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileScanner{
    public static void main(String[] args) {
        int n1;
		double n2;
		String n3;
		try {  
			Scanner in = new Scanner(new File("in.txt"));
			n1 = in.nextInt(); 
			n2 = in.nextDouble(); 
            n3 = in.next(); 
            in.close();
            System.out.println("Nilai integer yang di baca adalah "+n1);
            System.out.println("Nilai floating point yang di baca adalah "+n2);
            System.out.println("Nilai String yang di baca adalaah "+n3);
        }
        catch (FileNotFoundException ex) { // catch dan handle exception 
            ex.printStackTrace(); // print stack trace
        }
    }
}