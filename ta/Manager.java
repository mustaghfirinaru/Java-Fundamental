public class Manager extends Pegawai{
    double bonus;
    public Manager(int id, String name, String departement, double gaji, double bonus){         
        super(id, name, departement, gaji);         
        this.bonus=bonus;
    }     
    public double getbonus(){         
        return bonus;
    }     
    public void setbonus(double bonus){         
        this.bonus=bonus;
    }     
    public double computeSal(){         
        return super.getgaji()+bonus;
    }     
    public void accept(int id, String name, String departement, double gaji, double bonus){
        super.setid(id);         
        super.setname(name);         
        super.setdepartement(departement);        
        super.setgaji(gaji);         
        this.bonus=bonus;
    }     
    public void display(){         
        super.display();         
        System.out.println("Bonus = "+bonus);     
    }
}