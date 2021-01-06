/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class TestMyTriangle{ 
    public static void main(String[] args) {
        MyTriangle t1=new MyTriangle(0, 0, 0, 4, 3, 0);
        System.out.println(t1.toString());
        System.out.println(t1.getPerimeter());
        MyPoint p1=new MyPoint(0,1);
        MyPoint p2=new MyPoint(12,1);
        MyPoint p3=new MyPoint(0,6);
        MyTriangle t2=new MyTriangle(p1,p2,p3);
        System.out.println(t2.toString());
        System.out.println(t2.getPerimeter());
        t2.printType();
        
    }
}