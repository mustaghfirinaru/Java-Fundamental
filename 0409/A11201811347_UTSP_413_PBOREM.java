import java.io.*;
import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;
// Nama    : Mustaghfirin Al Farizi
// NIM     : A11201811347
// Kel     : 413
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
class A11201811347_UTSP_413_PBOREM extends AClass {
    public ArrayList sum_pair_max_diff(int [] data){
        int maxjum=0,maxd=0,ijum=0,jjum=0,id=0,jd=0;
        int n=data.length;
        ArrayList<int []> result = new ArrayList<int []>();
        int i=0,j=0;
        if(n==1){
            result.add(0, new int[]{ijum,jjum,data[0]});
        }
        else{
            while(i<n-1){
                j=i+1;
                while(j<n){
                    if(Math.abs(data[i]-data[j])>maxd){
                        maxd=Math.abs(data[i]-data[j]);
                        id=i;
                        jd=j;
                    }
                    if(data[i]+data[j]>maxjum){
                        maxjum=data[i]+data[j];
                        ijum=i;
                        jjum=j;
                    }
                    j++;
                }
                i++;
            }
            if(maxjum>maxd){
                result.add(0, new int[]{ijum,jjum,maxjum});
                // result.add(0, new int[]{id,jd,maxjum});
            }
            else if(maxjum==maxd){
                result.add(0, new int[]{ijum,jjum,maxjum});
                result.add(1, new int[]{id,jd,maxd});
                // result.add(1, new int[]{id,jd,maxd});
            }
            else{ 
                result.add(0, new int[]{id,jd,maxd});
            }
        }
        return result;    
    }
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)){
            A11201811347_UTSP_413_PBOREM a = new A11201811347_UTSP_413_PBOREM();
            while(reader.hasNext()){
                String in=reader.next();
                String [] data_str=null;
                if(in.isEmpty()) data_str=new String[data_str.length];
                else if(in.indexOf(',')==-1) data_str=in.split("\n");
                else data_str=in.split(",",-1);
                int [] data_int=a.toIntArray(data_str);
                ArrayList<int[]> hasil=a.sum_pair_max_diff(data_int);
                a.cetakArrayList(hasil);
                System.out.println();
            }
        }
    }
}