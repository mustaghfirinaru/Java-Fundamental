import java.util.Scanner;
class TestNumber {
    public static void displayMenu(MyNumber n1){
        Scanner in=new Scanner(System.in);
        int loop=1;
        do{
            System.out.println("Bilangan : "+n1.getNumber());
            System.out.println("Menu Operasi Bilangan");
            System.out.println("0. Keluar");
            System.out.println("1. Check Positive");
            System.out.println("2. Check Negative");
            System.out.println("3. Check Ganjil");
            System.out.println("4. Check Genap");
            System.out.println("5. Check Prime");
            System.out.println("6. Hitung Faktorial");
            System.out.println("7. Hitung Jumlahan");
            System.out.print("Pilih Operasi : ");
            loop=in.nextInt();
            switch (loop){
                case 0:break;
                case 1:System.out.println(n1.positive());break;
                case 2:System.out.println(n1.negative());break;
                case 3:System.out.println(n1.isOdd());break;
                case 4:System.out.println(n1.isEven());break;
                case 5:System.out.println(n1.isPrime());break;
                case 6:System.out.println("Factorial "+n1.getNumber()+" is "+n1.factorial());break;
                case 7:System.out.println("Sum of digits "+n1.getNumber()+" is "+n1.sum());break;
                default:System.out.println("Pilihan salah");break;
            }
        }
        while(loop!=0);
        in.close();
    }
    public static void main(String[] args) {
        int number=Integer.parseInt(args[0]);
        MyNumber n1=new MyNumber(number);
        displayMenu(n1);
        
    }
}