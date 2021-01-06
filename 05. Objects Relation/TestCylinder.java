class TestCylinder{
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        Cylinder c2=new Cylinder(10,0);
        Cylinder c3=new Cylinder(2.0,10.0);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}