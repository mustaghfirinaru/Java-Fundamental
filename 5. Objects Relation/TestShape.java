class TestShape{
    public static void main(String[] args) {
        System.out.println("Class Shape----");
        Shape s1=new Shape();
        Shape s2=new Shape("biru",true);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s2.getColor());
        s1.setColor("polkadot");
        System.out.println(s1.isFilled());
        System.out.println(s1.toString());
        System.out.println("Class Circle----");
        Circle2 c1=new Circle2(); 
        Circle2 c2=new Circle2(9.0); 
        Circle2 c3=new Circle2(8.0,"azure",false);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        c3.setRadius(21);
        System.out.println(c3.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c3.getPerimeter());
        System.out.println("Class Rectangle----");
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(7.5,5.8);
        Rectangle r3=new Rectangle(5.9,10.4,"indigo",true);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        r3.setWidth(15.1);
        r3.setLength(3.9);
        System.out.println(r3.getWidth());
        System.out.println(r3.getLength());
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());
        System.out.println("Class Square----");
        Square sq1=new Square();
        Square sq2=new Square(5.7);
        Square sq3=new Square(9.9,"tarzanite",true);
        System.out.println(sq1.toString());
        System.out.println(sq2.toString());
        System.out.println(sq3.toString());
        sq3.setSide(10.8);
        System.out.println(sq3.getSide());
        sq3.setLength(8.0);
        sq3.setWidth(7.0);
        System.out.println(sq3.toString());
        sq3.setSide(3.141592);
        System.out.println(sq3.toString());
        

    }
}