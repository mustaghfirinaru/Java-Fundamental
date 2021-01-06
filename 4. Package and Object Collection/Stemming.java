import java.io.*;
public class Stemming {
    public static void main(String[] args) throws IOException {
        MyArrayList sword = new MyArrayList();
        sword.readFromFile("stopwords.txt");
        // sword.writeToFile(sword, "AA.txt");
        sword.removeStopWord("pidato.txt","stem.txt");
        //stem.txt adalah file yang tidak mengandung kata
        //dalam stopwords.txt  
    } 
} 