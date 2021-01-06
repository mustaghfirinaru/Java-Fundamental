import java.io.*;
import java.util.*;
import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.Math;

@SuppressWarnings("unchecked")
public class no3new {
    public static void cetakArrayList(ArrayList<int[]> data) {
        if (data.isEmpty()) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        int x = 0;
        for (int[] items : data) {
            if (x < data.size() - 1) {
                System.out.print("[");
                for (int i = 0; i < items.length; i++) {
                    if (i < items.length - 1)
                        System.out.print(items[i] + ",");
                    else
                        System.out.print(items[i]);
                }
                System.out.print("],");
            } else {
                System.out.print("[");
                for (int i = 0; i < items.length; i++) {
                    if (i < items.length - 1)
                        System.out.print(items[i] + ",");
                    else
                        System.out.print(items[i]);
                }
                System.out.print("]");
            }
            x++;
        }
        System.out.println("]");
    }

    public static int[] toIntArray(String[] sArray) {// dipakai di prg utama
        if (sArray == null)
            return null;
        int[] data_int = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++) {
            data_int[i] = Integer.parseInt(sArray[i]);
        }
        return data_int;
    }

    public static int[] convertIntegers(List<Integer> integers) {// dipakai di subset
        int[] ret = new int[integers.size()];
        Iterator<Integer> iterator = integers.iterator();
        for (int i = 0; i < ret.length; i++) {
            ret[i] = iterator.next().intValue();
        }
        return ret;
    }

    public static ArrayList<int[]> subset(int[] data) {
        int n = data.length;
        ArrayList<int[]> result = new ArrayList<int[]>();
        result.add(new int[] {});
        for (int i = 0; i < Math.pow(2, n); i++) {
            ArrayList<Integer> elmt = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0)
                    elmt.add(data[j]);
            }
            int[] elmt_int = convertIntegers(elmt);
            if (!(result.contains(elmt_int)) && elmt_int.length > 0) {
                result.add(elmt_int);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            while (reader.hasNext()) {
                String in = reader.next();
                String[] data_str = null;
                if (in.isEmpty())
                    data_str = new String[data_str.length];
                else if (in.indexOf(',') == -1)
                    data_str = in.split("\n");
                else
                    data_str = in.split(",", -1);
                int[] data_int = toIntArray(data_str);
                ArrayList<int[]> hasil = subset(data_int);
                cetakArrayList(hasil);
                System.out.println();
            }
        }
    }
}