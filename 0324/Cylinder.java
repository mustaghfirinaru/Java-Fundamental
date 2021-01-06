class Cylinder extends Circle{
    private double height;
    Cylinder(){
        super();
        this.height=1.0;
    }
    Cylinder(double radius){
        super();
        this.setRadius(radius);
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
    public double getVolume() {
        return super.getArea()*this.height;
    }
}