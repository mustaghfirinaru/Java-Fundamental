/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class TestMyCircle{
    public static void main(String[] args) {  
        MyCircle c1=new MyCircle();
        MyCircle c2=new MyCircle(1,2,7);
        System.out.println(c2.toString());
        System.out.println(c2.getArea());
        System.out.println(c2.getCenter());
    }
}