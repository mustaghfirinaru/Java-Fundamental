/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
import java.util.Scanner;
class Test2CatchException {
    public static double exceptionalDivision(int widget,int defective){
        try {
            if(defective==0)
                throw new DivideByZeroException();
            return (double)widget/(double)defective;
        } catch (DivideByZeroException e) {
            System.out.println("Selamat! Sempurna!"); 
        }
        return (double)widget/(double)defective;
    }
    public static void main(String[] args) {
        int widget,defective;
        double ratio;
        try {
            Scanner in=new Scanner(System.in);
            System.out.println("Masukan jumlah widgets yang di hasilkan");
            widget=in.nextInt();
            if(widget<0)
                throw new NegativeNumberException("widgets");
            System.out.println("Berapa yang tidak efektif?");
            defective=in.nextInt();
            if(defective<0)
                throw new NegativeNumberException("widgets tidak efektif");
            if(defective==0)
                throw new DivideByZeroException("");
            ratio=exceptionalDivision(widget, defective);
            System.out.println("Satu dari  "+ratio+" widgets tidak efektif."); 
        }
        catch(DivideByZeroException e){
            System.out.println("Selamat! Sempurna !");
        }
        catch (NegativeNumberException e) {
            System.out.println("Tidak boleh bernilai negative "+e.getMessage()); 
        }
    }
}