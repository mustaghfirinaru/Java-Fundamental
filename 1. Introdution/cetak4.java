//Nama  : Moh Mustaghfirin Al Farizi
//NIM   : A11.2018.11347
//Kelas : A11.4413
import java.lang.*;
public class cetak4{
    public static void main(String[] args) {
        
      int i=1;
      int j=0;
      while(i<=3){
        j=3;
        while(j>i){
            System.out.print("  ");
            j--;
        }
        j=0;
        while(j<i){
            System.out.print(" \\");
            j++;
        }
        j=0;
        while(j<i){
            System.out.print("/ ");
            j++;
        }
        j=3;
        while(j>i){
            System.out.print("  ");
            j--;
        }
        System.out.println();
        i++;
      }
      i--;
      while(i>=1){
        j=3;
        while(j>i){
            System.out.print("  ");
            j--;
        }
        j=0;
        while(j<i){
            System.out.print(" /");
            j++;
        }
        j=0;
        while(j<i){
            System.out.print("\\ ");
            j++;
        }
        j=3;
        while(j>i){
            System.out.print("  ");
            j--;
        }
        System.out.println();
        i--;
      }
    }
}