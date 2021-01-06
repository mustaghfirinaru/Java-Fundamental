/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
import java.util.Scanner;
class TestMyComplex{
    public static void main(String[] args) {
        double imag,real;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter complex number 1 (real and imaginary part) : ");
        imag=in.nextDouble();
        real=in.nextDouble();
        MyComplex c1=new MyComplex(imag, real);
        System.out.print("Enter complex number 2 (real and imaginary part) : ");
        imag=in.nextDouble();
        real=in.nextDouble();
        MyComplex c2=new MyComplex(imag, real);
        in.close();
        System.out.println("Bil 1 : "+c1.toString());
        System.out.println(c1.toString()+" is real? = "+c1.isReal());
        System.out.println(c1.toString()+" is imaginary? = "+c1.isImaginary());
        System.out.println("Bil 2 : "+c2.toString());
        System.out.println(c2.toString()+" is real? = "+c2.isReal());
        System.out.println(c2.toString()+" is imaginary? = "+c2.isImaginary());
        System.out.println("Bil 1 == Bil 2? : "+c1.equals(c2));
        System.out.println(c1.toString()+" + "+c2.toString()+" = "+c1.add(c2));
        System.out.println(c1.toString()+" - "+c2.toString()+" = "+c1.subtract(c2));
        System.out.println(c1.toString()+" * "+c2.toString()+" = "+c1.multiplyWith(c2));
        System.out.println(c1.toString()+" / "+c2.toString()+" = "+c1.divideBy(c2));

        
    }
}