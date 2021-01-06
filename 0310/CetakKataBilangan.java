
public class CetakKataBilangan{
    public static void Cetak(int data) {
        if (data==0) System.out.println("Nol");
        else if (data==1) System.out.println("Satu");
        else if (data==2) System.out.println("Dua");
        else if (data==3) System.out.println("Tiga");
        else if (data==4) System.out.println("Empat");
        else if (data==5) System.out.println("Lima");
        else if (data==6) System.out.println("Enam");
        else if (data==7) System.out.println("Tujuh");
        else if (data==8) System.out.println("Delapan");
        else if (data==9) System.out.println("Sembilan");
        else System.out.println("Lainnya");
    }
    public static void Cetak2(int data) {
        switch (data){
            case 0: System.out.println("Nol");break;
            case 1: System.out.println("Satu");break; 
            case 2: System.out.println("Dua");break; 
            case 3: System.out.println("Tiga");break; 
            case 4: System.out.println("Empat");break; 
            case 5: System.out.println("Lima");break; 
            case 6: System.out.println("Enam");break; 
            case 7: System.out.println("Tujuh");break; 
            case 8: System.out.println("Delapan");break; 
            case 9: System.out.println("Sembilan");
            default: System.out.println("Lainnya");
        }
    }

    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        Cetak(nilai);
        Cetak2(nilai);
    }
}