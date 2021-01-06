class Square1 extends Rectangle1{
    Square1(){
        super();
    }
    Square1(double side){
        super(side, side);
    }
    Square1(double side ,String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public String toString() {
        if(super.getLength()>super.getWidth()) return "Suatu  Square  dengan  side="+super.getWidth()+",  subclass  dari  "+super.toString();
        return "Suatu  Square  dengan  side="+super.getLength()+",  subclass  dari  "+super.toString();
    }
}