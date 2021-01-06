/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class TestMyTime{
    
    public static void main(String[] args) {
        MyTime t1=new MyTime(23,59,59);
        System.out.println(t1.toString());
        t1=t1.nextSecond();
        System.out.println(t1.toString());
        t1=t1.nextSecond();
        System.out.println(t1.toString());
        t1=t1.nextHour();
        System.out.println(t1.toString());
        t1.setTime(23, 59, 59);
        System.out.println(t1.toString());
        t1=t1.nextMinute();
        System.out.println(t1.toString());
        t1=t1.previousSecond();
        System.out.println(t1.toString());
        t1=t1.previousMinute();
        System.out.println(t1.toString());
        t1=t1.previousHour();
        System.out.println(t1.toString());
    }
}