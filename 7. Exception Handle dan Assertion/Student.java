/**
* @author  Moh Mustaghfirin A11201811347
* @version 1.0
*/
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Student{
    public int rollNo;
    public String Nama;
    public int Usia;
    public String MataKuliah;
    Student(int rollNo,String Nama,int Usia,String MataKuliah){
        try{
            if(containsDigit(Nama)||containsSpecialCharacter(Nama))
                throw new NamaNotValidException(Nama);
            this.Nama=Nama;
        }
        catch(NamaNotValidException e){
            System.out.println("Format Nama Invalid");
        }
        try{
            if(Usia>=21||Usia<=15)
                throw new AgeNotWithinRangeException(Usia);
            this.Usia=Usia;
        }
        catch(AgeNotWithinRangeException e){
            System.out.println("Format Umur Invalid");
        }
        this.rollNo=rollNo;
        this.MataKuliah=MataKuliah;
    }
    public final boolean containsDigit(String s) {
        boolean containsDigit = false;
        if (s != null && !s.isEmpty()) {
            for (char c : s.toCharArray()) {
                if (containsDigit = Character.isDigit(c)) {
                    break;
                }
            }
        }
        return containsDigit;
    }
    public boolean containsSpecialCharacter(String s) {
        if (s == null || s.trim().isEmpty()) {
            return false;
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        boolean b = m.find();
        return b;
    }
    /**
     * @return the mataKuliah
     */
    public String getMataKuliah() {
        return MataKuliah;
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return Nama;
    }/**
     * @return the rollNo
     */
    public int getRollNo() {
        return rollNo;
    }/**
     * @return the usia
     */
    public int getUsia() {
        return Usia;
    }
    /**
     * @param mataKuliah the mataKuliah to set
     */
    public void setMataKuliah(String mataKuliah) {
        MataKuliah = mataKuliah;
    }/**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        Nama = nama;
    }/**
     * @param rollNo the rollNo to set
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }/**
     * @param usia the usia to set
     */
    public void setUsia(int usia) {
        Usia = usia;
    }
}