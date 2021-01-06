class StudentGrade{
    private String studentID;
    private double grade;
    StudentGrade(String studentID,double grade){
        this.studentID=studentID;
        this.grade=grade;
    }
    /**
     * @return the studentID
     */
    public String getStudentID() {
        return this.studentID;
    }
    /**
     * @return the grade
     */
    public double getGrade() {
        return this.grade;
    }
    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "ID : "+this.studentID+" Grade "+this.grade;
    }
    public static void main(String[] args) {
        
    }
}