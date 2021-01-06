class UndergraduateStudent extends Student{
    public void computeCourseGrade(){
        if(super.getTestScore()>=70)
            System.out.println("LULUS");
        else 
            System.out.println("TIDAK LULUS");
    }
    @Override
    public String getCourseGrade() {
        return super.getCourseGrade();
    }
    @Override
    public String toString() {
        if(super.getTestScore()>=80)
            return "Undergraduate Student : "+super.getName()+" dinyatakan Lulus";
            return "Undergraduate Student : "+super.getName()+" dinyatakan Tidak Lulus";
    }
}