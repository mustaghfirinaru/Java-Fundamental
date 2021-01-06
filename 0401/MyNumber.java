
class MyNumber implements IntOperation{
    private int number;
    MyNumber(){
        this.number=0;
    }
    MyNumber(int number){
        this.number=number;
    }
    /**
     * @return the number
     */
    public int getNumber() {
        return this.number;
    }
    @Override
    public boolean positive() {
        return this.number>=0;
    }

    @Override
    public boolean negative() {
        return this.number<0;
    }

    @Override
    public boolean isEven() {
        return this.number%2==0;
    }

    @Override
    public boolean isOdd() {
        return this.number%2!=0;
    }

    @Override
    public boolean isPrime() {
        int i=1,n=0;
        while(i<=this.number){
            if(this.number%i==0) n++;
            i++;
        }
        return n==2;
    }

    @Override
    public int factorial() {
        int i=1,fac=1;
        while(i<this.number){
            fac*=i;
            i++;
        }
        return fac;
    }

    @Override
    public int sum() {
        int n=this.number,count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }

}