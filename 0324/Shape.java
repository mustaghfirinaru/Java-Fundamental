class Shape{
    private String color;
    private boolean filled;
    Shape(){
        this.color="red";
        this.filled=true;
    }
    Shape(String color, boolean filled){
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
    @Override
    public String toString() {
        if(isFilled()) return "Suatu Shape dengan warna "+this.color+" dan filled";
        return "Suatu Shape dengan warna "+this.color+" dan not filled";
    }
}