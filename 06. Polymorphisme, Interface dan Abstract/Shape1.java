abstract public class Shape1{
    protected String color;
    protected boolean filled;
    public String getColor() {
        return this.color;
    }
    Shape1(){
        this.color="";
        this.filled=false;
    }
    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * @return the filled
     */
    public boolean isFilled() {
        return this.filled;
    }
    /**
     * @param filled the filled to set
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
    public double getRadius(){
        return 0.0;
    }
    public double getLength(){
        return 0.0;
    }
    public double getSide(){
        return 0.0;
    }
    @Override
    public String toString() {
        if(isFilled()) return "Suatu Shape dengan warna "+this.color+" dan filled";
        return "Suatu Shape dengan warna "+this.color+" dan not filled";
    }
}