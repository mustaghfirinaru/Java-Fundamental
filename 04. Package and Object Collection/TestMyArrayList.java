import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class TestMyArrayList {
    
    public static void main(String[] args) throws IOException {
        MyArrayList dataIn=new MyArrayList();
        MyArrayList dataOut=new MyArrayList();
        dataIn.readFromFile("testIn.txt");
        System.out.println(dataIn);
        System.out.println("size of dataIn : "+dataIn.getSize());
        System.out.println("index of 2, containt : "+dataIn.getData(2));
        System.out.println("is Exist value \"lebih tahu\" : "+ dataIn.isExist("lebih tahu"));
        System.out.println("index value \"lebih tahu\" : "+dataIn.idxPos("lebih tahu"));
        dataIn.writeToFile(dataOut,"testOut.txt");
        Scanner input = new Scanner(new File("testOut.txt"));
        while (input.hasNext()) { 
            String line = input.nextLine();
            System.out.println(line);
        } 
        System.out.println(dataOut);
    }
}