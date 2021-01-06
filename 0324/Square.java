class Square extends Rectangle{
    Square(){
        super();
    }
    Square(double side){
        super(side, side);
    }
    Square(double side ,String color, boolean filled){
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