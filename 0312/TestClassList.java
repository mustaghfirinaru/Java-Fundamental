class TestClassList{
    
    public static void main(String[] args) {
        ClassList cs1713 = new ClassList("PBO", "TI","Genap2004", "Wijanarto");
        System.out.println("\nClass :\n"   + cs1713);
        cs1713.add(new StudentGrade("S3142", 95));
        System.out.println("\nSetelah menambah 1:\n" + cs1713);
        cs1713.add(new StudentGrade("U5823", 95));
        System.out.println("\nSetelah menambah 2:\n" + cs1713);
        cs1713.add(new StudentGrade("R7893", 80));
        System.out.println("\nSetelah menambah 3:\n" + cs1713);
        cs1713.add(new StudentGrade("V1492", 35));
        System.out.println("\nSetelah menambah 4:\n" + cs1713);
    } 
}