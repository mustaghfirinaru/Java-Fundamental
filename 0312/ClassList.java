class ClassList{
    private int DEFAULT_SIZE=2;
    private String courseTitle;
    private String discipline;
    private String semester;
    private String instructor;
    private StudentGrade studentList[];
    private int classSize;
    ClassList(String title, String disc,String sem,String ins){
        this.courseTitle=title;
        this.discipline=disc;
        this.semester=sem;
        this.instructor=ins;
        this.studentList=new StudentGrade[DEFAULT_SIZE];
        this.classSize=0;
    }
    public void add(StudentGrade s){
        this.studentList[classSize]=s;
        this.classSize++;
        if(this.studentList.length==this.classSize) resize(); 
    }
    public void remove(String ID){
        int i=find(ID);
        if(i!=-1){
            this.studentList[i]=this.studentList[classSize];
            this.classSize--;
        }
    }
    public int find(String studentID){
        int i=0;
        while(i<this.classSize){
            if(this.studentList[i].getStudentID().equals(studentID)) return i;
            i++;
        }
        return -1;
    }
    public void resize(){
        StudentGrade temp[]=new StudentGrade[2*this.studentList.length];
        int i=0;
        while(i<this.classSize){
            temp[i]=this.studentList[i];
            i++;
        }
        this.studentList=temp;
    }
    public double getAverageGrade(){
        int i=0;
        double sum=0;
        while(i<this.classSize){
            sum+=this.studentList[i].getGrade();
            i++;
        }
        return sum/(double)this.classSize;
    }
    public double getMaxGrade(){
        int i=0;
        double max=this.studentList[0].getGrade();
        while(i<this.classSize){
            if(max<this.studentList[i].getGrade()) max=this.studentList[i].getGrade();
            i++;
        }
        return max;
    }
    public double getMinGrade(){
        int i=0;
        double min=this.studentList[0].getGrade();
        while(i<this.classSize){
            if(min<this.studentList[i].getGrade()) min=this.studentList[i].getGrade();
            i++;
        }
        return min;
    }
    @Override
    public String toString() {
        StringBuffer buf=new StringBuffer(getClass().getName() +"[title="+this.courseTitle+",discipline="+this.discipline+",semester="+this.semester+",instructor="+this.instructor+"]");
        for(int i=0;i<this.classSize;i++){
            buf.append("\n"+this.studentList[i]);
        }
        return buf.toString();
    }
    public void setGrade(String studentID,double grade){
        int position=find(studentID);
        if(position!=-1) this.studentList[position].setGrade(grade);
    }
    /**
     * @return the courseTitle
     */
    public String getTitle() {
        return this.courseTitle;
    }
    public StudentGrade getStudent(String ID){
        int position=find(ID);
        if(position!=-1) return this.studentList[position];
        return null;
    }
    /**
     * @return the semester
     */
    public String getSemester() {
        return this.semester;
    }
    /**
     * @return the instructor
     */
    public String getInstructor() {
        return this.instructor;
    }
    public double getGrade(String studentID){
        int position=find(studentID);
        if(position!=-1) return this.studentList[position].getGrade();
        return -1;
    }
    /**
     * @return the discipline
     */
    public String getDiscipline() {
        return this.discipline;
    }
}