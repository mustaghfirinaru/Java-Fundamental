/**
 * @author Moh. Mustaghfirin Al Farizi A11.2018.11347
 */
class MyComplex{
    private double real;
    private double imag;
    private final double EPSILON = 0.00000001;
    MyComplex(double real,double imag){
       this.real=real;
       this.imag=imag; 
    }
    public double getReal(){
        return this.real;
    }
    public void setReal(double real){
        this.real=real;
    }
    public double getImag(){
        return this.imag;
    }
    public void setImag(double imag){
        this.imag=imag;
    }
    public void setValue(double real,double imag){
        this.real=real;
        this.imag=imag;
    }
    @Override
    public String toString() {
        return "("+this.real+" + "+this.imag+"i)";
    }
    public boolean isReal(){
        return this.imag==0;
    }
    public boolean isImaginary(){
        return this.imag!=0;
    }
    public boolean equals(double real,double imag) {
        return this.imag+this.real==imag+real?true:Math.abs(this.imag+this.real-imag+real)<EPSILON;
    }
    public boolean equals(MyComplex another) {
        return this.imag+this.real==another.getImag()+another.getReal()?true:Math.abs(this.imag+this.real-another.getImag()+another.getReal())<EPSILON;
    }
    public double magnitude(){
        return Math.sqrt(this.real+this.imag);
    }
    public double argumentInRadians(){
        return Math.atan2(this.real, this.imag);
    }
    public double argumentInDegrees(){
        return Math.atan(this.real/this.imag);
    }
    public MyComplex conjugate(){
        return new MyComplex(this.real, this.imag);
    }
    public MyComplex add(MyComplex another){
        return new MyComplex(this.real+another.getReal(), this.imag+another.getImag());
    }
    public MyComplex subtract(MyComplex another){
        return new MyComplex(this.real-another.getReal(), this.imag-another.getImag()); 
    }
    public MyComplex multiplyWith(MyComplex another){
        return new MyComplex(this.real*another.getReal(), this.imag*another.getImag()); 
    }
    public MyComplex divideBy(MyComplex another){
        return new MyComplex(this.real/another.getReal(), this.imag/another.getImag()); 
    }
}