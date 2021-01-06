class TestEmployee{
    public static double max2(double a,double b){
        if(a>b) return a;
        return b;
    }
    public static void main(String[] args) {
        Manager e[]=new Manager[5];
        e[0]=new Manager();
        e[1]=new Manager(2,"widodo","IS",1300.50,300.00);
        e[2]=new Manager(3,"Joko","Accounting",1250.00,100.50);
        e[0].accept(1,"Bambang","R/D",1250.0,20.5);
        e[0].display();
        System.out.println("\n");
        e[1].display();
        System.out.println("\n");
        e[2].display();
        System.out.println("\n");
        if (e[0].computesal()>max2(e[1].computesal(),e[2].computesal()))
            System.out.println("Maximum Salary :"+e[0].computesal());
        else if (e[1].computesal()>max2(e[0].computesal(),e[2].computesal()))
            System.out.println("Maximum Salary :"+e[1].computesal());
        else System.out.println("Maximum Salary :"+e[2].computesal());

    }
}