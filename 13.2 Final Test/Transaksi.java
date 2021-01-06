import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Transaksi {
    public int idtrans;
    public User user;
    public Warung warung;
    public ArrayList<ArrayList<Object>> items;
    public double total;
    public double fee;
    public double tax;
    public double paid;
    final double HRG_STD=5500.0;
    Transaksi(int id, User user,Warung warung,ArrayList<ArrayList<Object>> items,double n){
        this.idtrans=id;
        this.user=user;
        this.warung=warung;
        this.items=items;
        // this.items = new ArrayList<ArrayList<Object>>(items);
        // this.items = new ArrayList<ArrayList<Object>>();
        // items.add(new ArrayList<Object>(Arrays.asList("Ayam Goreng", 141587.0, 10)));
        // items.add(new ArrayList<Object>(Arrays.asList("Sayur Lodeh", 13466.0, 10)));
        // items.add(new ArrayList<Object>(Arrays.asList("Nasi Merah", 10872.0, 2)));
        this.tax=n;
    }
    public double countTotal(){
        int i=0;
        double sum=0;
        double harga;
        while(i<items.size()){
            harga=Double.parseDouble(items.get(i).get(1).toString());
        // System.out.println("aaa");
        sum=sum+harga*Integer.parseInt(items.get(i).get(2).toString());
        i++;
    } 
    return sum;
}
public double countDistance(){
    double lat1=user.lat;
    double lon1=user.lon;
    double lat2=warung.lat;
    double lon2=warung.lon;
    final int R = 6371; // Radius of the earth
    double latDistance = Math.toRadians(lat2 - lat1);
    double lonDistance = Math.toRadians(lon2 - lon1);
    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
    + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
    * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double distance = R * c ; // convert to meters
    
    // double height = el1 - el2;
    
    // distance = Math.pow(distance, 2) + Math.pow(height, 2);
    
    System.out.println(distance);
    return distance;
}
public double countFee(){
    double d=countDistance();
    if(d<5.0) return HRG_STD;
    if(5.0<=d&&d<10.0) return HRG_STD*1.25;
    if(10.0<=d&&d<25.0) return HRG_STD*1.35;
    if(15.0<=d&&d<20.0) return HRG_STD*1.45;
        if(20.0<=d&&d<25.0) return HRG_STD*1.55;
        if(25.0<=d&&d<30.0) return HRG_STD*1.65;
        else return HRG_STD*1.75;
    }
    public double countTax(){
        return countTotal()*(tax/100);
    }

    public double countPaid(){
        return countTotal()+countFee()+countTax();
        
    }
    
    public String toString(){
        return user.nama+", "+countTotal()+", "+countDistance()+", "+countFee()+", "+countTax()+", "+countPaid();
    }
    
}