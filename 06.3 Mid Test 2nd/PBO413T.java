import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class PBO413T{
    public static void cetakArrayList(ArrayList<int[]> data){
        if(data.isEmpty()){
            System.out.println("[]");
            return;
        }System.out.print("[");
        int x=0;
        for(int[] items:data){
            if(x<data.size()-1){
                System.out.print("[");
                for(int i=0;i<items.length;i++){
                    if(i<items.length-1) System.out.print(items[i]+",");
                    else System.out.print(items[i]);
                }
                System.out.print("]");
            }
            else{
                System.out.print("[");
                for(int i=0;i<items.length;i++){
                    if(i<items.length-1) System.out.print(items[i]+",");
                    else System.out.print(items[i]);
                }
                System.out.print("]");
            }x++;
            System.out.print("]");
        }
    }
    public static int[] toIntArray(String [] sArray){
        if(sArray==null) return null;
        int [] data_int=new int[sArray.length];
        for(int i=0;i<sArray.length;i++){
            data_int[i]=Integer.parseInt(sArray[i]);
        }
        return data_int;
    }
    public static ArrayList<int[]> sum3(int[] data){
        int n=data.length;
        ArrayList<int[]> result=new ArrayList<int[]>();
        int j=0,k=0,l=0;
        if(data.length==1){
            if(data[0]==0) result.add(0, new int[]{0});
            return result;
        }
        else if(data.length==2){
            if(data[0]+data[1]==0) result.add(0, new int[]{data[0],data[1]});
            return result;
        }
        else{
            j=0;
            while(j<n-2){k=j+1;
                while(k<n-1){l=k+1;
                    while(l<n){
                        if((data[j]+data[k]+data[l])==0){
                            result.add(new int[]{data[j],data[k],data[l]});
                        }
                        l++;}
                    k++;}
                j++;}
        }
        return result;
    }
    public static void main(String[] args) {
        try(Scanner reader=new Scanner(System.in)){
            while(reader.hasNext()){
                String in=reader.next();
                String [] data_str=null;
                if(in.isEmpty()) data_str=new String[data_str.length];
                else if(in.indexOf(',')==-1) data_str=in.split("\n");
                else data_str=in.split(",",-1);
                int [] data_int=toIntArray(data_str);
                ArrayList<int[]> hasil=sum3(data_int);
                cetakArrayList(hasil);
                System.out.println();
            }
        }
    }
}