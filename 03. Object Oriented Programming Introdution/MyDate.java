/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
import java.time.DayOfWeek;
import java.time.*;

class MyDate {
    private int year;
    private int month;
    private int day;
    private String strMonths[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Agu","Sep","Oct","Nov","Dec"};
    private String strDays[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    private int daysInMonths[]={31,28,31,30,31,30,31,31,30,31,30,31};
    public boolean isLeapYear(int year){
        if(year%4!=0) return false;
        if(year%400==0) return true;
        if(year%100==0) return false;
        return true;
    }
    public boolean isValidDate(int year,int month,int day){
        if(year>9999||month>12) return false;
        if(month==2&&isLeapYear(year)&&day>29) return false;
        if(this.daysInMonths[month-1]<day&&!isLeapYear(year)) return false;
        return true;

    }
    public int getDayOfWeek(int year,int month,int day){// Set a local date whose day is found 
       LocalDate localDate = LocalDate.of(year,month, day); 
            
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate); 

        int val = dayOfWeek.getValue(); 
        return val;
    }
    MyDate(int year,int month,int day){
        if(isValidDate(year, month, day)){
            this.year=year;
            this.month=month;
            this.day=day;
        }
        else{
            System.out.println("Invalid year, month, or day!");
        }
    }
    public void setDate(int year,int month,int day){
        if(isValidDate(year, month, day)){
            this.year=year;
            this.month=month;
            this.day=day;
        }
        else{
            System.out.println("Invalid year, month, or day!");
        }
    }
    public int getYear(){
        return this.year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setMonth(int month){
        this.month=month;
    }
    public void setDay(int day){
        this.day=day;
    }
    @Override
    public String toString() {
        return this.strDays[this.getDayOfWeek(this.year, this.month, this.day)-1]+" "+this.day+" "+this.strMonths[this.month-1]+" "+this.year;
    }
    public MyDate nextDay(){
        this.day++;
        if(isLeapYear(this.year)&&this.month==2){
            if(this.day>29){this.month++;this.day=1;}
        }
        else{
            if(this.day>this.daysInMonths[this.month-1]){this.month++;this.day=1;}
        }
        if(this.month==13){this.year++;this.month=1;}
        if(this.year>9999){System.out.println("Year out of range!");this.year=9999;}
        return new MyDate(this.year, this.month, this.day);
    }
    public MyDate nextMonth(){
        this.month++;
        if(this.month==13){this.year++;this.month=1;}
        if(this.year>9999){System.out.println("Year out of range!");this.year=9999;}
        return new MyDate(this.year, this.month, this.day);
    }
    public MyDate nextYear(){
        this.year++;
        if(!isLeapYear(this.year)&&this.month==2) this.day=28;
        if(this.year>9999){System.out.println("Year out of range!");this.year=9999;}
        return new MyDate(this.year, this.month, this.day);
        
    }
    public MyDate previousDay(){
        this.day--;
        if(isLeapYear(this.year)&&this.month==3){
            if(this.day==0){this.month--;this.day=29;}
        }
        else{
            if(this.day==0){this.month--;this.day=this.daysInMonths[month-1];}
        }
        if(this.month==0){this.year--;this.month=12;}
        this.day=this.daysInMonths[this.month-1];
        if(this.year==0){System.out.println("Year out of range!");this.year=1;}
        return new MyDate(this.year, this.month, this.day);
    }
    public MyDate previousMonth(){
        int temp=this.month;
        this.month--;
        if(this.month==0){this.year--;this.month=12;}
        if(this.day==this.daysInMonths[temp]) this.day=this.daysInMonths[this.month];
        if(this.year==0){System.out.println("Year out of range!");this.year=1;}
        return new MyDate(this.year, this.month, this.day);
    }
    public MyDate previousYear(){
        this.year--;
        if(!isLeapYear(this.year)&&this.month==2) this.day=28;
        if(this.year==0){System.out.println("Year out of range!");this.year=0;}
        return new MyDate(this.year, this.month, this.day);
    }

}