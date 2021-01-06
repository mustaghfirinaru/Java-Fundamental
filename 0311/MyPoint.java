/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class MyPoint{
    private int x;
    private int y;
    MyPoint(){
        this.x=0;
        this.y=0;
    }
    MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double distance(int x, int y){
        double xDiff=this.x-x;
        double yDiff=this.y-y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(MyPoint another){
        double xDiff=this.x-another.x;
        double yDiff=this.y-another.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
}