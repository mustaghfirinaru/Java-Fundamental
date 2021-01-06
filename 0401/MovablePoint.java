
class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    @Override
    public void moveUp() {
        this.y+=this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y-=this.ySpeed;

    }

    @Override
    public void moveLeft() {
        this.x-=this.xSpeed;

    }

    @Override
    public void moveRight() {
        this.x+=this.xSpeed;

    }
    /**
     * @return the x
     */
    public int getX() {
        return this.x;
    }
    /**
     * @return the y
     */
    public int getY() {
        return this.y;
    }
    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }/**
     * @param xSpeed the xSpeed to set
     */
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }/**
     * @param ySpeed the ySpeed to set
     */
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    /**
     * @return the xSpeed
     */
    public int getxSpeed() {
        return this.xSpeed;
    }
    /**
     * @return the ySpeed
     */
    public int getySpeed() {
        return this.ySpeed;
    }
    @Override
    public String toString() {
        return "Point ("+this.x+","+this.y+")";
    }
    
}