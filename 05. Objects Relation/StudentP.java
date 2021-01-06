class StudentP extends Person{
    private int studentNumber;
    /**
     * @return the studentNumber
     */
    public int getStudentNumber() {
        return this.studentNumber;
    }
    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    StudentP(){
        super();
        this.studentNumber=0;
    }
    StudentP(String initialName, int initialStudentNumber){
        super(initialName);
        this.studentNumber=initialStudentNumber;
    }
    public void reset(String newName,int newStudentNumber){
        super.setName(newName);
    }
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Student Number: "+this.getStudentNumber());
    }
    public boolean equals(StudentP otherStudent){
        return this.hasSameName(otherStudent)&&this.studentNumber==otherStudent.studentNumber;
    }
}