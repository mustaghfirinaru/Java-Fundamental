class Student{
    protected int NUM_OF_TESTS=3;
    protected String name;
    protected int[] test;
    protected String courseGrade;
    Student(){
        this.name="";
        this.courseGrade="";
        this.test=new int[NUM_OF_TESTS];
    }
    Student(String studentName){
        this.name=studentName;
        this.courseGrade="";
        this.test=new int[NUM_OF_TESTS];
    }
    /**
     * @return the courseGrade
     */
    public String getCourseGrade() {
        return this.courseGrade;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    public int getTestScore(){
        int sum=0;
        for(int i:this.test){
            sum+=i;
        }
        return (int) ((double) sum / (double) this.NUM_OF_TESTS);
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setTestScore(int testNumber,int testScore){
        this.test[testNumber-1]=testScore;
    }
}