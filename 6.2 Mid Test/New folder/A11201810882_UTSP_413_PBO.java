
/*
NAMA    :   NATHANAEL FREDERICKO WIBAWANTO
NIM     :   A11.2018.10882
KELOMPOK:   A11.4413
*/
import java.io.*;
import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;
@SuppressWarnings("unchecked")
abstract class AClass{
    public static void cetakArrayList(ArrayList<int[]> data){
        if (data.isEmpty()) {System.out.println("[]");return;}
        System.out.print("[");
        int x=0;
        for (int[] items : data ) {
                if(x<data.size()-1){
                    System.out.print("[");
                    for(int i=0;i<items.length;i++){
                        if (i<items.length-1) System.out.print(items[i]+",");
                        else System.out.print(items[i]);
                    }
                    System.out.print("],");
                }
                else{
                    System.out.print("[");
                    for(int i=0;i<items.length;i++){
                        if (i<items.length-1) System.out.print(items[i]+",");
                        else System.out.print(items[i]);
                        }
                    System.out.print("]");
                }
                x++;
            }
            System.out.println("]");
        }
        public static int [] toIntArray(String [] sArray){
            int [] data_int=new int[sArray.length];
            for (int i=0;i<sArray.length ;i++ ) {
                data_int[i]=Integer.parseInt(sArray[i]);
            }
            return data_int;
        }
        public abstract ArrayList sum_pair_max_diff(int [] data);
    }
    @SuppressWarnings("unchecked")
public class A11201810882_UTSP_413_PBO extends AClass{
    public ArrayList sum_pair_max_diff(int[] data) {
        int n = data.length;
        ArrayList <int[]> result = new ArrayList <int[]>();
        int i, j;
        int a = 0, b = 0;
        int x = 0, z = 0;
        int depan = 0, belakang = 1;
        float m =-99;
        float d = -99;

        // PENCARIAN M DAN D
        i = 0;
        while (i < n) {
            if(n==1) { // JIKA ARRAY INPUT HANYA 1 ELEMENT
                int[] array = new int[3];
                array[0] = 0;
                array[1] = 0;
                array[2] = data[0];
                result.add(0,array);
                return result;
            } else if (n==2) { // JIKA ARRAY INPUT HANYA 2 ELEMENT
                m = data[0]+data[1];
                d = data[0]-data[1];
                int[] array = new int[3];
                array[0] = 0;
                array[1] = 1;
                if (m>d) {
                    array[2] = (int)m;
                } else {
                    array[2] = (int)d;
                }
                result.add(0,array);
                return result;
            } else { // JIKA ARRAY INPUT LEBIH DARI 2 ELEMNT
                j = i+1;
                while (j < n) {
                    if(m < data[i]+data[j]) {
                        m = data[i]+data[j];
                        a = i;
                        b = j;
                    }
                    if(d < data[i]-data[j]) {
                        d = data[i]-data[j];
                        x = i;
                        z = j;
                    }
                    j++;
                }
                i++;
            }
            
        }

        int[] arrayDepan = new int[3];
        int[] arrayBelakang = new int[3];
        arrayDepan[0] = a;
        arrayDepan[1] = b;
        arrayDepan[2] = (int)m;
        arrayBelakang[0] = x;
        arrayBelakang[1] = z;
        arrayBelakang[2] = (int)d;
        if(m > d) {
            result.add(0, arrayDepan);
        } else if (m == d) {
            result.add(0, arrayDepan);
            result.add(1, arrayBelakang);
        } else {
            result.add(0, arrayBelakang);
        }
        return result;
    }
    
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)){
            A11201810882_UTSP_413_PBO a = new A11201810882_UTSP_413_PBO();
            while(reader.hasNext()){
                String in=reader.next();
                String[] data_str=null;
                if(in.isEmpty()) data_str=new String[data_str.length];
                else if(in.indexOf(',')==-1) data_str=in.split("\n");
                else data_str=in.split(",",-1);
                int[] data_int = a.toIntArray(data_str);
                ArrayList<int[]> hasil = a.sum_pair_max_diff(data_int);
                a.cetakArrayList(hasil);
                System.out.println();
            }
        }
    }

}
