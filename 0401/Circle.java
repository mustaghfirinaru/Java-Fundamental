class Circle{
    public static final double DEFAULT_RADIUS=1.0;
    public static final String DEFAULT_COLOR="red";
    private double radius;
    private String color;
    Circle(){
        this.radius=DEFAULT_RADIUS;
        this.color=DEFAULT_COLOR;
    }
    Circle(double radius){
        this.radius=radius;
        this.color=DEFAULT_COLOR;
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
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return this.color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Circle dengan radius= "+getRadius()+" dan Luas "+getArea();
    }
    public double getArea(){
        return 3.141592*this.radius*this.radius;
    }
}