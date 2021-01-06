import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    public String iduser;
    public String nama;
    public double lat;
    public double lon;
    User(String id, String nama,double lat,double lon){
        this.iduser=id;
        this.nama=nama;
        this.lat=lat;
        this.lon=lon;
    }
}