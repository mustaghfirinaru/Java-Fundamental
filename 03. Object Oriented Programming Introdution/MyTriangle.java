/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class MyTriangle{
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    MyTriangle(int x1, int y1,int x2,int y2,int x3, int y3){
        this.v1=new MyPoint(x1,y1);
        this.v2=new MyPoint(x2,y2);
        this.v3=new MyPoint(x3,y3);
    }
    MyTriangle(MyPoint v1,MyPoint v2,MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    @Override
    public String toString() {
        return "Triangle @ "+this.v1.toString()+","+this.v2.toString()+","+this.v3.toString();
    }
    public double getPerimeter(){
        return v1.distance(v2)+v1.distance(v3)+v2.distance(v3);
    }
    public void printType(){
        if(v1.distance(v2)==v1.distance(v3)&&v1.distance(v3)==v2.distance(v3)) System.out.println("qeuilateral");
        else if(v1.distance(v2)==v1.distance(v3)||v2.distance(v1)==v2.distance(v3)||v3.distance(v1)==v3.distance(v2)) System.out.println("isoceles");
        else System.out.println("scalene");
    }
}