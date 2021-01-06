/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class TestMyPointArray{
    public static void main(String[] args) {
        MyPoint[] points=new MyPoint[10];
        for(int i=0;i<10;i++){
            points[i]=new MyPoint(i+1,i+1);
        }
        for(int i=0;i<points.length;i++){
            System.out.println(points[i].toString());
        }
    }
}