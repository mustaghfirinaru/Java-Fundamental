import java.util.ArrayList;

class ClassList2{
    private String courseTitle;
    private String discipline;
    private String semester;
    private String instructor;
    private ArrayList<StudentGrade> studentList;
    private int classSize;
    ClassList2(String title, String disc,String sem,String ins){
        this.courseTitle=title;
        this.discipline=disc;
        this.semester=sem;
        this.instructor=ins;
        this.studentList=new ArrayList<StudentGrade>();
        this.classSize=0;
    }
    public void add(StudentGrade s){
        this.studentList.set(this.classSize, s);
        this.classSize++;
    }
    public void remove(String ID){
        int i=find(ID);
        if(i!=-1){
            this.studentList.set(i, this.studentList.get(this.classSize));
            this.classSize--;
        }
    }
    public int find(String studentID){
        int i=0;
        while(i<this.classSize){
            if(this.studentList.get(i).getStudentID().equals(studentID)) return i;
            i++;
        }
        return -1;
    }
    public void resize(){
        ArrayList<StudentGrade> temp=new ArrayList<StudentGrade>();
        int i=0;
        while(i<this.classSize){
            temp.set(i, this.studentList.get(i));
            i++;
        }
        this.studentList=temp;
    }
    public double getAverageGrade(){
        int i=0;
        double sum=0;
        while(i<this.classSize){
            sum+=this.studentList.get(i).getGrade();
            i++;
        }
        return sum/(double)this.classSize;
    }
    public double getMaxGrade(){
        int i=0;
        double max=this.studentList.get(0).getGrade();
        while(i<this.classSize){
            if(max<this.studentList.get(i).getGrade()) max=this.studentList.get(i).getGrade();
            i++;
        }
        return max;
    }
    public double getMinGrade(){
        int i=0;
        double min=this.studentList.get(0).getGrade();
        while(i<this.classSize){
            if(min<this.studentList.get(i).getGrade()) min=this.studentList.get(i).getGrade();
            i++;
        }
        return min;
    }
    @Override
    public String toString() {
        StringBuffer buf=new StringBuffer(getClass().getName() +"[title="+this.courseTitle+",discipline="+this.discipline+",semester="+this.semester+",instructor="+this.instructor+"]");
        for(int i=0;i<this.classSize;i++){
            buf.append("\n"+this.studentList.get(i));
        }
        return buf.toString();
    }
    public void setGrade(String studentID,double grade){
        int position=find(studentID);
        if(position!=-1) this.studentList.get(position).setGrade(grade);
    }
    /**
     * @return the courseTitle
     */
    public String getTitle() {
        return this.courseTitle;
    }
    public StudentGrade getStudent(String ID){
        int position=find(ID);
        if(position!=-1) return this.studentList.get(position);
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
        if(position!=-1) return this.studentList.get(position).getGrade();
        return -1;
    }
    /**
     * @return the discipline
     */
    public String getDiscipline() {
        return this.discipline;
    }
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