public class Checking{
    public static void Check(int data) {
        if (data >= 50)
            System.out.println("LULUS");
        else
            System.out.println("GAGAL");
    }

    public static void main(String[] args) {
        int nilai = Integer.parseInt(args[0]);
        Check(nilai);
    }
}