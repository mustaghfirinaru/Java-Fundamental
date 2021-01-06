import java.lang.*;

public class siji {
    static int count = 0;

    public static long s(long m, long n) {
        count++;
        // System.out.println("o "+count);
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return s(m - 1, 1);
        }
        return s(m - 1, s(m, n - 1));
    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println("i " + count);
        System.out.println(s(m, n));
    }
}