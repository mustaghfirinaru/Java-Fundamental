/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class BounchBall{
    private float x;
    private float y;
    private int radius;
    private int direction;
    private float xDelta;
    private float yDelta;
    BounchBall(int x,int y,int radius,int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=(float)(speed * Math.cos(direction));
        this.xDelta=(float)(speed*Math.sin(direction));

    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return (int)this.x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return (int)this.y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    /**
     * @return the radius
     */
    public int getRadius() {
        return radius;
    }
    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta*=-1;
    }
    public void reflectVertical(){
        this.yDelta*=-1;
    }
    @Override
    public String toString() {
        return "Bola di ("+this.x+","+this.y+") dengan kecepatan ("+this.xDelta+","+this.yDelta+")";
    }
    public static void main(String[] args) {
        BounchBall ball = new BounchBall(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100); 
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball); // manual check the position of the ball } 
    }}
}