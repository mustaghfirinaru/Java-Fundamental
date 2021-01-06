
class Box extends NewShape{

    private double length;
    private double breadth;
    private double height;
    Box(double length, double breadth,double height){
        this.breadth=breadth;
        this.height=height;
        this.length=length;
    }
    Box(double length, double breadth,double height,String color, boolean filled){
        super(color,filled);
        this.breadth=breadth;
        this.height=height;
        this.length=length;
    }
    /**
     * @return the breadth
     */
    public double getBreadth() {
        return this.breadth;
    }
    /**
     * @return the length
     */
    public double getLength() {
        return this.length;
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
    /**
     * @param breadth the breadth to set
     */
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
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
        return 2*((this.length*this.breadth)+(this.length*this.height)+(this.height*this.breadth)) ;
    }
    @Override
    public double calc_volume() {
        return this.length*this.breadth*this.height;
    }

    @Override
    public String toString() {
        return "Box : breadth ="+this.breadth+", Height= "+this.height+", Length = "+this.length+", "+super.toString();
    }
    
}