
class TestNewShape {
    public static void main(String[] args) {
        Sphere s=new Sphere(5.0);
        Cone c= new Cone(4.0,3.5);
        NewCylinder nc=new NewCylinder(6.0,4.5);
        Box b=new Box(3.0,2.0,4.0); 
        System.out.println(s);
        System.out.println(s.calc_area());
        System.out.println(s.calc_volume());
        System.out.println(c);
        System.out.println(c.calc_area());
        System.out.println(c.calc_volume());
        System.out.println(nc);
        System.out.println(nc.calc_area());
        System.out.println(nc.calc_volume());
        System.out.println(b);
        System.out.println(b.calc_area());
        System.out.println(b.calc_volume());
    }
}