
class Cylinder extends Circle {
    private double height;
    Cylinder(){
        super();
        this.height=1.0;
    }
    Cylinder(double radius){
        super(radius);
        this.height=1.0;
    }
    Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    /**
     * @return the height
     */
    public double getHeight() {
        return this.height;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea()*this.height;
    }
    public double getCircleArea(){
        return super.getArea();
    }
    public double getArea(){
        return super.getArea()*2+2*3.141592*this.height;
    }
    @Override
    public String toString() {
        return "Cylinder dengan radius = "+super.getRadius()+", height = "+this.getHeight()+", Luas Circle = "+this.getCircleArea()+", Luas cylinder = "+this.getArea()+", Volume = "+this.getVolume();
    }
}