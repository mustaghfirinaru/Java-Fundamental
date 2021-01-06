
class Sphere extends NewShape {
    private double radius;
    Sphere(double radius){
        this.radius=radius;
    }
    Sphere(double radius,String color, boolean filled){
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
        return 4*3.141592*this.radius*this.radius;
    }
    
    @Override
    public double calc_volume() {
        return 0.75*3.141592*this.radius*this.radius*this.radius;
    }

    @Override
    public String toString() {
        return "Sphere : r ="+this.radius+", "+super.toString();
    }
    

}