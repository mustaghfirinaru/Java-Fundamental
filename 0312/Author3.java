class Author3{
    private String name;
    private String email;
    private char gender;
    Author3(String name, String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return this.name;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return this.email;
    }
    /**
     * @return the gender
     */
    public char getGender() {
        return this.gender;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return this.name+" ("+this.gender+") at "+this.email;
    }
}