import java.util.Scanner;
public class bin2dec {
    public static int getDecimal(int binary){  
        int decimal = 0;  
        int n = 0;  
        while(true){  
          if(binary == 0){  
            break;  
          } else {  
              int temp = binary%10;  
              decimal += temp*Math.pow(2, n);  
              binary = binary/10;  
              n++;  
           }  
        }  
        return decimal;  
    }  
    public static void main(String[] args) {
        int n;
        Scanner num=new Scanner(System.in);
        System.out.print("Binary = ");
        n=num.nextInt();
        System.out.println("Decimal = "+getDecimal(n));
        num.close();

    }
}