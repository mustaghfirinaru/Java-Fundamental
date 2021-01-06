import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class MyArrayList {
    private ArrayList<String> list;
    private int size;

    MyArrayList() {
        this.list = new ArrayList<>();
        this.size = this.list.size();
    }

    /**
     * @return the size
     */
    public int getSize() {
        return this.size;
    }

    public String getData(int i) {
        return this.list.get(i);
    }

    public void delAll() {
        this.list.clear();
    }

    public void delPos(int i) {
        this.list.remove(i);
    }

    @Override
    public String toString() {
        return this.list.toString();
    }

    public void add(int i, String item) {
        this.list.add(i, item);
    }

    public void set(int i, String item) {
        this.list.set(i, item);
    }

    public boolean isExist(String value) {
        return this.list.contains(value);
    }

    public int idxPos(String value) {
        return this.list.indexOf(value);
    }

    public int lastIdx(String value) {
        return this.list.lastIndexOf(value);
    }

    public void readFromFile(String fileName) throws FileNotFoundException{
        Scanner inFile=new Scanner(new File(fileName));
        while(inFile.hasNext()){

            String line=inFile.nextLine();
            this.list.add(line);
        }
    }
    public void writeToFile(MyArrayList outList,String outFile) throws IOException {
        File file=new File(outFile);
        BufferedWriter out=new BufferedWriter(new FileWriter(file));
        for(String s:this.list){
            out.write(s);
            out.newLine();
        }
        out.close();
    }
    public void removeStopWord(String inFile, String stemFile) throws IOException {
        Scanner input=new Scanner(new File(inFile));
        File file=new File(stemFile);
        BufferedWriter out=new BufferedWriter(new FileWriter(file));
        while(input.hasNext()){
            String next=input.next();
            if(!this.isExist(next.toLowerCase())){
                out.write(next+" ");
            }
        }
        input.close();
        out.close();
    }
}