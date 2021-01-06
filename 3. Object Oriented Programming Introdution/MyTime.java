/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class MyTime{
    private int hour;
    private int minute;
    private int second;
    MyTime(){
        this.hour=0;
        this.minute=0;
        this.second=0;
    }
    MyTime(int hour,int minute,int second){
        if(hour>23) System.out.println("Invalid hour, minute, atau second!");
        else if(minute>59) System.out.println("Invalid hour, minute, atau second!");
        else if(second>59) System.out.println("Invalid hour, minute, atau second!");
        else{
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
    }
    public void setTime(int hour,int minute,int second){
        if(hour>23||minute>59||second>59){
            System.out.println("Invalid hour, minute, atau second!");
        }
        else{
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    @Override
    public String toString() {
        return this.hour+":"+this.minute+":"+this.second;
    }
    public MyTime nextSecond(){
        this.second++;
        if(this.second==60){this.minute++;this.second=0;}
        if(this.minute==60){this.hour++;this.minute=0;}
        if(this.hour==24) this.hour=0;
        return new MyTime(this.hour,this.minute,this.second);
    }
    public MyTime nextMinute(){
        this.minute++;
        if(this.minute==60){this.hour++;this.minute=0;}
        if(this.hour==24) this.hour=0;
        return new MyTime(this.hour,this.minute,this.second);
    }
    public MyTime nextHour(){
        this.hour++;
        if(this.hour==24) this.hour=0;
        return new MyTime(this.hour,this.minute,this.second);
    }
    public MyTime previousSecond(){
        this.second--;
        if(this.second==-1){this.minute--;this.second=59;}
        if(this.minute==-1){this.hour--;this.minute=59;}
        if(this.hour==-1) this.hour=23;
        return new MyTime(this.hour,this.minute,this.second);
    }
    public MyTime previousMinute(){
        this.minute--;
        if(this.minute==-1){this.hour--;this.minute=59;}
        if(this.hour==-1) this.hour=23;
        return new MyTime(this.hour,this.minute,this.second);
    }
    public MyTime previousHour(){
        this.hour--;
        if(this.hour==-1) this.hour=23;
        return new MyTime(this.hour,this.minute,this.second);
    }
}