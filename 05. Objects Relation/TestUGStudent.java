class TestUGStudent{
    public static void compareNumbers(StudentP s1,StudentP s2){
        if(s1.getStudentNumber()==s2.getStudentNumber()) 
        System.out.println(s1.getName()+" mempunyai nomer yang sama dengan "+s2.getName());
        else
        System.out.println(s1.getName()+" mempunyai nomer yang berbeda dengan "+s2.getName());
    }
    public static void main(String[] args) {
        StudentP s1=new StudentP("Joko",900);
        StudentP s2=new StudentP("Jono",900);
        compareNumbers(s1, s2);
    }
}