/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
import java.util.Scanner;

class UseOfDividedByZero {
    public void doMethod1()  {
        Scanner in=new Scanner(System.in);
        System.out.println("Masukkan numerator :");
        double num=in.nextDouble();
        System.out.println("Masukkan denominator :");
        double den=in.nextDouble();
        // in.close();
        try{
            if(den==0)
            throw new DivideByZeroException();
            double quotient=num/den;
            System.out.println(num+"/"+den+" = "+quotient);
            System.out.println("Bye.");
        }
        catch(DivideByZeroException e){
            e.getMessage();
            doMethod2();
        }
    }
    public void doMethod2() {
        Scanner a=new Scanner(System.in);
        System.out.println("Coba lagi!");
        System.out.println("Masukkan numerator :");
        double num=a.nextDouble();
        System.out.println("Masukkan denominator :");
        double den=a.nextDouble();
        a.close();
        if(den==0){
            System.out.println("Tidak dapat membagi dengan nol.");
            System.out.println("Program akan selesai.");
        }
        else{
            System.out.println("Denominator bukan nol");
            double quotient=num/den;
            System.out.println(num+"/"+den+" = "+quotient);
            System.out.println("Bye.");
        }
    }
}