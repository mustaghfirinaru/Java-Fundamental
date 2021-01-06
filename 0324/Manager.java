class Manager extends Employee{
    private double bonus;
    /**
     * @return the bonus
     */
    public double getBonus() {
        return this.bonus;
    }
    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    Manager(){
        super();
        this.bonus=0;
    }
    Manager(int id, String nama, String departement, double gaji,double bonus){
        super(id,nama,departement,gaji);
        this.bonus=bonus;
    }
    public double computesal(){
        return (super.getGaji()+this.bonus);
    }
    @Override
    public String toString() {
        return "("+super.getId()+", "+super.getName()+", "+super.getDepartement()+", "+super.getGaji()+") Bonus : "+this.computesal()+" Total : "+(this.computesal());
    }
    public void accept(int id, String nama, String departement, double gaji,double bonus){
        this.setBonus(bonus);
        super.setName(nama);
        super.setDepartement(departement);
        super.setGaji(gaji);
        super.setId(id);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Bonus       : "+this.getBonus());
        System.out.println("Total       : "+this.computesal());
    }
}