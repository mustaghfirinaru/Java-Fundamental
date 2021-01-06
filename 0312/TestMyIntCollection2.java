
/*
Keuntungan MyIntCollection
1. method dapat ubah tanpa perlu membuka library 
2. class child tidak perlu menambahkan public method dan attribute yang sudah dimiliki parrent
3. data lebih mudah dikelola

Keuntungan MyIntCollection2
1. dapat mengetahui keseluruhan method dan attribute yang ada dalam class
2. tidak perlu memahami method dari class/library lainnya
*/
class TestMyIntCollection2{
    public static void main(String[] args) {
        MyIntCollection i=new MyIntCollection();
        i.add(3);
        i.add(6);
        i.add(1);
        i.add(9);
        System.out.println(i.toString());
    }
}