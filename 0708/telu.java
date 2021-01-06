import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

class telu {
    public static void main(String[] args) {
        User u = new User("11", "Noname", -6.190062, 110.155101);
        Warung w = new Warung("23", -6.975890, 110.692348); // items berisi : nama, harga, qty
        ArrayList<ArrayList<Object>> items = new ArrayList<ArrayList<Object>>();
        items.add(new ArrayList<Object>(Arrays.asList("Ayam Goreng", 141687.0, 10)));
        items.add(new ArrayList<Object>(Arrays.asList("Sayur Lodeh", 13466.0, 10)));
        items.add(new ArrayList<Object>(Arrays.asList("Nasi Merah", 10872.0, 2)));
        Transaksi t = new Transaksi(1, u, w, items, 50.0);
        // double hraga=items.get(1).get(1);
        // System.out.println(hraga);
        System.out.println(t);
    }
}