import java.util.Scanner;
public class hex2dec{
    public static String toHex(int decimal){    
    int rem;  
    String hex="";   
    char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0){  
        rem=decimal%16;   
        hex=hexchars[rem]+hex;   
        decimal=decimal/16;  
        }  
        return hex;  
    } 
    public static void main(String[] args) {
        int n;
        Scanner num=new Scanner(System.in);
        System.out.print("Decimal = ");
        n=num.nextInt();
        System.out.print("Binary = "+toHex(n));
        num.close();

    }
}