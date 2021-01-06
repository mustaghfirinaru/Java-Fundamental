// import java.lang.ArrayIndexOutOfBoundsException;
// import java.lang.*;
/** 
* 
* @author Mustaghfirin 
*/
class MyNumber{
    private int data;
    MyNumber(int n){
        this.data=n;
    }
    private boolean isNegative() {
        return this.data<0;
    }
    private boolean isPositive(){
        return this.data>0;
    }
    private boolean isZero(){
        return this.data==0;
    }
    private boolean isOdd(){
        return this.data%2!=0;
    }
    private boolean isEven(){
        return this.data%2==0;
    }
    public static void main(String[] args) {
        // int nilai=10;
        int nilai=Integer.parseInt(args[0]);
        MyNumber bil=new MyNumber(nilai);
        System.out.println(nilai +" IsNegative : "+bil.isNegative());
        System.out.println(nilai +" IsPositive : "+bil.isPositive());
        System.out.println(nilai +" IsZero : "+bil.isZero());
        System.out.println(nilai +" IsOdd : "+bil.isOdd());
        System.out.println(nilai +" IsEven : "+bil.isEven());
    }
}