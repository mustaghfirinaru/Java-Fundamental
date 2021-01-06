
abstract public class NewShape {

    private String color;
    private boolean filled;
    NewShape(){
        this.color="red";
        this.filled=true;
    }
    NewShape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
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
    /**
     * @return the filled
     */
    public boolean isFilled() {
        return this.filled;
    }
    abstract public double calc_area();
    abstract public double calc_volume();
    public String toString() {
        return "NewShape : color = "+this.color+" and filled="+this.filled;
    }
}