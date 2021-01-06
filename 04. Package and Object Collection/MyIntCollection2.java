import java.util.ArrayList;
/*
Keuntungan MyIntCollection
1. method dapat ubah tanpa perlu membuka library 
2. class child tidak perlu menambahkan public method dan attribute yang sudah dimiliki parrent
3. data lebih mudah dikelola

Keuntungan MyIntCollection2
1. dapat mengetahui keseluruhan method dan attribute yang ada dalam class
2. tidak perlu memahami method dari class/library lainnya
*/
class MyIntCollection2{
    /**
     *
     */
    private int smallestInt;
    private int largestInt;
    private int total=0;
    private ArrayList<Integer> numbers;
    MyIntCollection2(){
        this.numbers=new ArrayList<Integer>();
        this.total=0;
    }
    public boolean add(int i){
        if(numbers.isEmpty()){
            this.smallestInt=i;
            this.largestInt=i;
        }
        else{
            if(i<this.smallestInt) this.smallestInt=i;
            if(i>this.largestInt) this.largestInt=i;
        }
        this.total+=i;
        return numbers.add(i);
    }
    public double getAverage(){
        return (double)this.total/(double)this.size();
    }
    @Override
    public String toString() {
        return "Isi collection : "+this.size()+" nilai integer\n"+"Nilai Terkecil : "+this.smallestInt+"\nNilai Terbesar : "+this.largestInt+"\nRerata : "+this.getAverage();
    }
    public int size(){
        return this.numbers.size();
    }
}