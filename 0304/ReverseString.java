import java.util.Scanner; 
public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan String: ");
        inStr = in.next();
        inStrLen = inStr.length();
        in.close();
        int i=0;
        inStrLen--;
        System.out.print("String terbalik: ");
        while(i<=inStrLen){
            System.out.print(inStr.charAt(inStrLen));
            inStrLen--;
        }
        System.out.println();
    }
}