class Rectangle1 extends Shape1{
    protected double width;
    protected double length;
    Rectangle1(){
        this.length=1.0;
        this.width=1.0;
    }
    Rectangle1(double width,double length){
        this.length=width;
        this.width=length;
    }
    Rectangle1(double width,double length,String color,boolean filled){
        super.setFilled(filled);
        super.setColor(color);
        this.length=width;
        this.width=length;
    }
    /**
     * @return the width
     */
    public double getWidth() {
        return this.width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * @return the length
     */
    public double getLength() {
        return this.length;
    }
    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return this.width*this.length;
    }
    @Override
    public double getPerimeter(){
        return 2*(this.length+this.width);
    }
    @Override
    public String toString() {
        return "Suatu  Rectangle  dengan  width="+this.width+"  dan  length="+this.length+",  subclass  dari  "+super.toString();
    }
}