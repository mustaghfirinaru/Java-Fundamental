
class NewCylinder extends NewShape{

    private double radius;
    private double height;
    NewCylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    NewCylinder(double radius,double height,String color, boolean filled){
        super(color,filled);
        this.height=height;
        this.radius=radius;
    }
    /**
     * @return the radius
     */
    public double getRadius() {
        return this.radius;
    }
    /**
     * @return the height
     */
    public double getHeight() {
        return this.height;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
    @Override
    public boolean isFilled() {
        return super.isFilled();
    }
    @Override
    public double calc_area() {
        return 2*3.141592*this.radius*(this.radius+this.height) ;
    }
    @Override
    public double calc_volume() {
        return 3.141592*this.radius*this.radius*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder : r ="+this.radius+", Height= "+this.height+", "+super.toString();
    }
    
}