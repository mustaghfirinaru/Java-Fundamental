class Circle{
    private double radius;
    private String color;
    Circle(){
        this.color="red";
        this.radius=1.0;
    }
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return this.radius;
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
    public double getArea() {
        return this.radius*this.radius*3.141592;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Radius : "+this.radius+" Area : "+this.getArea();
    }
}