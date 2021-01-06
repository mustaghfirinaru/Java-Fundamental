class Circle1 extends Shape1{
    protected double radius;
    Circle1(){
        this.color="red";
        this.radius=1.0;
    }
    Circle1(double radius){
        this.radius=radius;
    }
    Circle1(double radius, String color, boolean filled){
        super.setFilled(filled);
        super.setColor(color);
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
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }
    /**
     * @return the area
     */
    @Override
    public double getArea() {
        return this.radius*this.radius*3.141592;
    }
    @Override
    public double getPerimeter() {
        return this.radius*2*3.141592;
    }
    @Override
    public String toString() {
        return "Radius : "+this.radius+" Area : "+this.getArea();
    }
}