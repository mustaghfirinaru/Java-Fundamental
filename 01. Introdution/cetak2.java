//Nama  : Moh Mustaghfirin Al Farizi
//NIM   : A11.2018.11347
//Kelas : A11.4413
import java.lang.*;
public class cetak2{
    public static void main(String[] args) {
        
      int i=0;
      int j=0;
      while(i<5){
        j=0;
        if(i==0||i==4){
            while(j<5){
                System.out.print(" *");  
                j++;
            }
        }
        else{
            System.out.print(" *       *");
        }
        System.out.println("");
        i++;
      }
      System.out.println("");
    }
}