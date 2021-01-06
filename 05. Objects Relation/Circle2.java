class Circle2 extends Shape{
    private double radius;
    Circle2(){
        this.radius=0.0;
    }
    Circle2(double radius){
        this.radius=radius;
    }
    Circle2(double radius,String color,boolean filled){
        super(color,filled);
        this.radius=radius;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return this.radius;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius*this.radius*3.141592;
    }
    public double getPerimeter(){
        return this.radius*2*3.141592;
    }
    @Override
    public String toString() {
        return "Suatu Circle dengan radius="+this.radius+", subclass dari "+super.toString();
    }
}