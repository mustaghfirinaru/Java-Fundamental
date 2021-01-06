/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class TestMyPoint{
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        p1.setX(1);
        System.out.println(p1.getX());
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5,6));
    }
}