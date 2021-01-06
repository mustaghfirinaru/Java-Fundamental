import java.util.ArrayList;
import java.util.Scanner;

class TestStuff {
    public static void main(String[] args) {
        // mendifinisikan arraylist
        ArrayList<Stuff> barang = new ArrayList<>();

        // buat objek scanner
        Scanner scan = new Scanner(System.in);
        // input jumlah data yg diinginkan user
        System.out.print("input Jumlah Data : ");
        int jml_data = scan.nextInt();

        // mendefinisikan input array list
        Scanner input = new Scanner(System.in);

        // input tiap nilai dan masukan dalam arraylist
        System.out.println("\nInput nilai data");
        for (int a = 0; a < jml_data; a++) {
            System.out.println("Data ke-" + (a + 1) + " : ");
            System.out.print("Kode barang : ");
            String kode = input.next();
            System.out.print("Nama barang : ");
            String nama = scan.next();
            nama += scan.nextLine();
            System.out.print("Satuan barang : ");
            String satuan = input.next();
            System.out.print("Jumlah barang : ");
            int jumlah = input.nextInt();
            System.out.print("Harga barang : ");
            int harga = input.nextInt();

            Stuff barang1 = new Stuff(kode, nama, satuan, jumlah, harga);
            barang.add(barang1);
        }

        // tampilkan data hasil dari inputan
        System.out.println("\nData yang didalam array list : ");
        int posisi = 1;
        for (Stuff a : barang) {
            System.out.println("-->Data ke-" + posisi);
            System.out.println("Kode Barang : " + a.kode);
            System.out.println("Nama Barang : " + a.namabarang);
            System.out.println("Satuan Barang : " + a.satuan);
            System.out.println("Jumlah Barang : " + a.jumlah);
            System.out.println("Harga Barang : " + a.harga);
            posisi++;
        }

        // input data yang akan dicari
        System.out.print("\n\nInput data yang ingin dicari : \n");
        System.out.println("1. Kode barang");
        System.out.println("2. Nama Barang");
        System.out.println("3. Satuan Barang");
        System.out.println("4. Jumlah Barang");
        System.out.println("5. Harga Barang");
        System.out.print("Masukan input yg ingin dicari : ");
        int serching = scan.nextInt();

        int iterasi = 1;

        // jika ingin mencari kode barang
        boolean ketemu = false;
        if (1 == serching) {
            System.out.print("Kode barang apa yang kamu cari : ");
            String carikodebarang = scan.next();
            for (Stuff kodebarang : barang) {
                if (carikodebarang.equalsIgnoreCase(kodebarang.kode)) {
                    System.out.println("Ketemu");
                    System.out.println("iterasi ke-" + iterasi);
                    System.out.println(kodebarang.kode + "==" + carikodebarang);
                    ketemu = true;
                    break;
                } else {
                    System.out.println("iterasi ke-" + iterasi);
                    System.out.println(kodebarang.kode + "!=" + carikodebarang);
                }
                iterasi++;
                System.out.println();
            }

        }
        System.out.println(barang.get(0).getNamabarang());
        if (ketemu == true) {
            System.out.println("Data ditemukan pada iterasi ke-" + iterasi);
        } else {
            System.out.println("Data tidak ditemukan");
        }
        scan.close();
        input.close();

    }
}