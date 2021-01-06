import java.util.Scanner;
import java.lang.String;
public class dec2hex{
    public static int getDecimal(String hex){  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             }  
             return val;  
    } 
    public static void main(String[] args) {
        String n;
        Scanner num=new Scanner(System.in);
        System.out.print("Decimal = ");
        n=num.next();
        System.out.print("Binary = "+getDecimal(n));
        num.close();
    }
}