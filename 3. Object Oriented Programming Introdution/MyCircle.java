/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class MyCircle{
    private MyPoint center;
    private int radius;
    MyCircle(){
        this.center= new MyPoint();
        this.radius=1;
    }
    MyCircle(int x,int y,int radius){
        this.center= new MyPoint(x,y);
        this.radius=radius;
    }
    MyCircle(MyPoint center,int radius){
        this.center=center;
        this.radius=radius;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    /**
     * @return the center
     */
    public MyPoint getCenter() {
        return center;
    }
    /**
     * @param center the center to set
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterXY(int x,int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    @Override
    public String toString() {
        return "Circle @ "+this.center.toString()+"radius = "+this.radius;
    }
    public double getArea(){
        return 3.141592*this.radius*this.radius;
    }
}