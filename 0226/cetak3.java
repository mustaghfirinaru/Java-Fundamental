//Nama  : Moh Mustaghfirin Al Farizi
//NIM   : A11.2018.11347
//Kelas : A11.4413
import java.lang.*;
public class cetak3{
    public static void main(String[] args) {
        
      int i=0;
      int j=0;
      int k=0;
      int print=5;
      while(i<5){
        j=0;
        k=0;
        if(i==0){
            while(j<5){
                System.out.print(" *");  
                j++;
            }
        }
        else{
            while(k<i){
                System.out.print(" ");  
                k++;
            }
            System.out.print(" *");
            k=0;
            while(k<print){
                System.out.print(" ");  
                k++;
            }
            if(i!=4) System.out.print("*");
            print=print-2;
        }
        System.out.println("");
        i++;
      }
    }
}