public class Fibonacci{
    public static void main(final String[] args) {
        int i=0,n1=0,n2=0,n3=0;
        double rata;
        int sum=0;
        System.out.println("bilangan pertama dari deret Fibonacci adalah ");
        while(i<20){
            if(i==0) {
                n1=0;
                n2=1;
                n3=n1+n2;
            }
            else{
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            sum+=n3;
            System.out.print(n3+", ");
            i++;
        }
        rata=(double)sum/(double)i;
        System.out.println("\nRata-rata = "+rata);
    }
}