class Undergraduate extends StudentP{
    private int level;
    /**
     * @return the level
     */
    public int getLevel() {
        return this.level;
    }
    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        if(level<0&&level<5) this.level = level;
    }
    Undergraduate(){
        super();
        this.level=1;
    }
    Undergraduate(String initialName, int initialStudentNumber, int initialLevel){
        super(initialName,initialStudentNumber);
        this.level=initialLevel;
    }
    public void reset(String newName, int newStudentNumber,int newLevel) {
        super.reset(newName, newStudentNumber);
        this.level=newLevel;
    }
    public boolean equals(Undergraduate otherUndergraduate){
        return super.equals((StudentP)otherUndergraduate)&&this.level == otherUndergraduate.level;
    }
    @Override
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Student Level : "+this.getLevel());
    }
}