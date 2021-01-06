// import java.lang.*;
import java.util.Scanner;
public class HitungGravitasi1{
    public static void main(String[] args) {
        double a=9.8;
        double t=10;
        int v1=0,x1=0;
        double xt;
        Scanner in = new Scanner(System.in);
        System.out.print("Input V1 = ");
        v1=in.nextInt();
        System.out.print("Input X1 = ");
        x1=in.nextInt();
        in.close();
        xt=0.5*(a*t*t)+(v1*t)+x1;
        System.out.print("xt = ");
        System.out.print(xt);
        System.out.println(" meters");
    }
}