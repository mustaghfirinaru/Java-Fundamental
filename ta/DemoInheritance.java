import java.util.ArrayList;
// import java.util.Scanner;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.Set;

public class DemoInheritance {
    public static void main(String[] args) {
        
        ArrayList<Manager> mng1 = new ArrayList<Manager>();
        double max=0;
        // int sum=0;
        
       mng1.add(new Manager(1, "Fikri", "R/D", 1250.0, 20.5));
       mng1.add(new Manager(1, "Latief", "R/D", 1300.5, 300.0));
       mng1.add(new Manager(2, "Fariz", "R/D", 1250.0, 100.5));
       
       // mencetak nilai
       for(Manager m : mng1){
        m.display();
        System.out.println("");
    }
       
       
       // mencari id yang sama
       int sumsame=0;
       int i=0,j=0;
       while(i<mng1.size()-1){
           j=i+1;
           while(j<mng1.size()){
                if(mng1.get(i).getid()==mng1.get(j).getid()){
                    sumsame++;
                } 
                j++;
            }
            i++;
        }
        System.out.println("YANG SAMA : "+ sumsame);
       
       // mencari nilai gaji maksimum
       for(Manager m : mng1){
           if(m.gaji+m.bonus>max){
               max = m.gaji+m.bonus;
           }
       }
       
        System.out.println("Nilai Max : "+max);
        
        
    }
}