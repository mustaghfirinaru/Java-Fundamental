
public class GenapGanjil{
    public static void Check(int data) {
        if (data%2==0)
            System.out.println("Genap");
        else
            System.out.println("Ganjil");
    }

    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        Check(nilai);
    }
}