class Employee{
    private int id;
    private String name;
    private String departement;
    private double gaji;
    /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
    /**
     * @return the departement
     */
    public String getDepartement() {
        return this.departement;
    }
    /**
     * @param departement the departement to set
     */
    public void setDepartement(String departement) {
        this.departement = departement;
    }
    /**
     * @return the gaji
     */
    public double getGaji() {
        return this.gaji;
    }
    /**
     * @param gaji the gaji to set
     */
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    Employee(){
        this.id=0;
        this.departement="";
        this.name="";
        this.gaji=0.0;
    }
    Employee(int id, String nama, String departement, double gaji){
        this.id=id;
        this.departement=departement;
        this.name=nama;
        this.gaji=gaji;
    }
    public void display(){
        System.out.println("Id          : "+this.id);
        System.out.println("Name        : "+this.name);
        System.out.println("Department  : "+this.departement);
        System.out.println("Gaji        : "+this.gaji);
    }
}