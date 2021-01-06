class Rectangle{
    public  int width;
    public int height;
    public int area;
    public void setDimensions(int newWidth,int newHeight){
        this.width=newWidth;
        this.height=newHeight;
        this.area=this.height*this.width;
    }
    /**
     * @return the area
     */
    public int getArea() {
        return this.area;
    }
    public static void main(String[] args) {
        Rectangle box =new Rectangle();
        box.setDimensions(10, 5);
        System.out.println("Luas persegi panjang "+box.getArea());
        box.width=6;
        System.out.println("Luas persegi panjang "+box.getArea());
    }
}