public class HitungPI {
    public static double Hitung() {
        double pi=0;
        int i = 1;
        double sum = 0;
        while (i <= 10000000) {
            sum += 1/(double)i;
            i+=2;
            sum -= 1/(double)i;
            i+=2;
        }
        pi=sum*4;
        return pi;
    }

    public static void main(String[] args) {
        System.out.println("PI : " + Hitung());
    }
}