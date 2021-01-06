public class Pegawai {
    int id;     
    String name,departement;     
    double gaji;               
    public Pegawai(int id, String name, String departement, double gaji){        
        this.id=id;        
        this.name=name;         
        this.departement=departement;         
        this.gaji=gaji;
    }     
    public int getid(){         
        return id;
    }     
    public void setid(int id){         
        this.id=id;
    }     
    public String getname(){         
        return name;
    }     
    public void setname(String name){       
        this.name=name;
    }     
    public String getdepartement(){         
        return departement;
    }     
    public void setdepartement(String departement){        
        this.departement=departement;
    }     
    public double getgaji(){         
        return gaji;
    }     
    public void setgaji(double gaji){         
        this.gaji=gaji;     
    }     
    public void display(){         
        System.out.println("Id = "+id);         
        System.out.println("Name = "+name);         
        System.out.println("Departement = "+departement);         
        System.out.println("Gaji = "+gaji);    
    }
}