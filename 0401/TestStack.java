
import java.util.Scanner;
class TestStack {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Input Jumlah Stack : ");
        int n=in.nextInt();
        MyStack s=new MyStack(n);
        System.out.println("Size: "+s.getSize()+" TOP:"+s.getTop());
        int loop=1,data;
        do{
            System.out.println("Menu Operasi Stack");
            System.out.println("0. Keluar");
            System.out.println("1. TOS (Top Of Stack) Index");
            System.out.println("2. TOS (Top Of Stack) Value");
            System.out.println("3. Push");
            System.out.println("4. Pop");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Display Stack");
            System.out.print("Pilih Operasi : ");
            loop=in.nextInt();
            switch (loop){
                case 0:break;
                case 1:System.out.println(s.getTop());break;
                case 2:System.out.println(s.getTopValue());break;
                case 3:System.out.print("Push Value : ");data=in.nextInt();s.push(data);break;
                case 4:s.pop();System.out.println("Pop value : "+s.getTemp());break;
                case 5:System.out.println(s.isEmpty());break;
                case 6:System.out.println(s.isFull());break;
                case 7:s.dislpay();break;
                default:System.out.println("Pilihan salah");break;
            }
        }
        while(loop!=0);
        in.close();
    }
}