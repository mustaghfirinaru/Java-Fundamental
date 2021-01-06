public class DeretHarmoniLR{
    public static void main(String[] args) {
        int i=1,n=1000;
        double sum=0;
        while(i<=n){
            sum=sum+(double)1/(double)i;
            // System.out.println(sum);
            i++;
        }
        System.out.println("Jumlah = "+sum);

    }
}