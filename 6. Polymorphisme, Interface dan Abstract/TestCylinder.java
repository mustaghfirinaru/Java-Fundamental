class TestCylinder {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Circle c2=new Circle(10.0);
        System.out.println("c1 : "+c1);
        System.out.println("c2 : "+c2);
        Cylinder cy1=new Cylinder();
        Cylinder cy2=new Cylinder(1.0,10.0);
        Cylinder cy3=new Cylinder(2.0,10.0);
        System.out.println("cy1 : "+cy1);
        System.out.println("cy2 : "+cy2);
        System.out.println("cy3 : "+cy3);
        System.out.println("Pemanggilan getArea() dari Circle c2 : "+c2.getArea());
        System.out.println("Pemanggilan getArea() dari Cylinder cy3 : "+cy3.getArea());
    }   
}