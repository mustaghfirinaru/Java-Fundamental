
public class SumAverageWhile {
    public static void Cetak(int data) {
        int i=0,sum=0;
        while(i<=data){
            sum+=i;
            i++;
        }
        System.out.println("Jumlah : "+sum);
        System.out.println("Rerata : "+(double)sum/(double)data);
    }
    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        Cetak(nilai);
    }
}