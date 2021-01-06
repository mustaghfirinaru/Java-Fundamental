class Person{
    private String name;
    Person(){
        this.name="Undefined";
    }
    Person(String initialName){
        this.name=initialName;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    public void writeOutput(){
        System.out.println(this.getName());
    }
    public boolean hasSameName(Person otherPerson){
        return this.getName().equalsIgnoreCase(otherPerson.getName());
    }
}