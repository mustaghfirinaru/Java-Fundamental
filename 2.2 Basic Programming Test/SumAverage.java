
public class SumAverage {
    public static void Cetak(int data) {
        int sum=0;
        for(int i=0;i<=data;i++){
            sum+=i;
        }
        System.out.println("Jumlah : "+sum);
        System.out.println("Rerata : "+(double)sum/(double)data);
    }
    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        Cetak(nilai);
    }
}