class TestStudent{
    public static void main(String[] args) {
        UndergraduateStudent ugs=new UndergraduateStudent();
        ugs.setName("Wijanarto");
        ugs.setTestScore(1, 69);
        ugs.setTestScore(2, 70);
        ugs.setTestScore(3, 71);
        System.out.println(ugs.toString());
        GraduateStudent gs=new GraduateStudent();
        gs.setName("Joko");
        gs.setTestScore(1, 65);
        gs.setTestScore(2, 60);
        gs.setTestScore(3, 73);
        System.out.println(gs.toString());
    }
}