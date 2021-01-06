
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x,int y,int xSpeed,int ySpeed, int radius){
        center=new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }
    @Override
    public void moveUp() {
        center.y+=center.ySpeed;
        
    }
    
    @Override
    public void moveDown() {
        center.y-=center.ySpeed;
    }
    
    @Override
    public void moveLeft() {
        center.x-=center.xSpeed;
    }
    
    @Override
    public void moveRight() {
        center.x+=center.xSpeed;
    }
    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
    /**
     * @return the radius
     */
    public int getRadius() {
        return this.radius;
    }
    @Override
    public String toString() {
        return "Circle pada Point("+center.x+","+center.y+") dengan radius "+this.getRadius();
    }
}