/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class Container{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    Container(int x,int y,int with,int height){
        this.x1=x;
        this.y1=y;
        this.x2=x1+with-1;
        this.y2=y1+height-1;

    }
    /**
     * @param x1 the x1 to set
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }
    /**
     * @param x2 the x2 to set
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }/**
     * @param y1 the y1 to set
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }/**
     * @param y2 the y2 to set
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }
    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }/**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }/**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }/**
     * @return the y2
     */
    public int getY2() {
        return y2;
    }
    public boolean collidesWith(BounchBall ball){
        if (ball.getX() - ball.getRadius() <= this.x1 ||
        ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        else{
            ball.reflectVertical();
            return true;
        }
    }
    @Override
    public String toString() {
        return "Container pada ("+this.x1+","+this.y1+") hingga ("+this.x2+","+this.y2+")";
    }
}