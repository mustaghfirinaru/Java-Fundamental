import java.io.*;
import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;
@SuppressWarnings("unchecked")
abstract class Aclass{
    public static void cetakArrayList(ArrayList<int[]> data){
        if (data.isEmpty()) {System.out.println("[]");return;}
        System.out.print("[");
        int x=0;
        for (int[] items : data ) {
            if(x<data.size()-1){
                System.out.print("[");
                for(int i=0;i<items.length;i++){
                    if (i<items.length-1) System.out.print(items[i]+",");
                    else   System.out.print(items[i]);
                }
                System.out.print("],");
            }else{
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
class A11201811368_UTSP_413_PBO extends Aclass {//file sesuaikan dengan format yg disepakati
    public ArrayList sum_pair_max_diff(int [] data){
        int n=data.length;
        ArrayList<int []> result = new ArrayList<int []>();
        //...//jawaban soal ditulis dibagian ini


        int max = data[0];
        int max_diff = 0;
        int arr1[] = {0, 0, 0};
        int arr2[] = {0, 0, 0};

        if(n == 1){
          arr1[2] = data[0];
          result.add(arr1);
          return result;
        }else{
          for (int i = 0; i<n-1; i++) {
            for (int j = i + 1; j<n; j++) {
              if (max < (data[i] + data[j])) {
                max = (data[i] + data[j]);
                arr1[0] = i;
                arr1[1] = j;
              }
              if (max_diff < (Math.abs(data[i]) - Math.abs(data[j]))) {
                max_diff = (Math.abs(data[i]) - Math.abs(data[j]));
                arr2[0] = i;
                arr2[1] = j;
              }
              arr1[2] = max;
              arr2[2] = max_diff;
            }
          }
        }

        if(max> max_diff)
           result.add(arr1);
        else if(max_diff == max){
          result.add(arr1);
          result.add(arr2);
        }else if(max<max_diff)
         result.add(arr2);
        return result;
}
public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)){
        A11201811368_UTSP_413_PBO a = new A11201811368_UTSP_413_PBO();
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
