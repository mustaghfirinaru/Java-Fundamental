
class MyStack implements StackOperation {
    private int maxSize;
    private int []data;
    private int TOP;
    private int temp;
    private int tempsize;
    MyStack(){
        this.maxSize=15;
        this.data=new int[15];
        this.TOP=0;
        this.temp=0;
        this.tempsize=0;
    }
    MyStack(int size){
        this.maxSize=size;
        this.data=new int[size];
        this.TOP=-1;
        this.temp=-1;
        this.tempsize=size;
    }
    @Override
    public void push(int data) {
        if(!this.isFull()){
            this.TOP++;
            this.data[this.TOP]=data;
            System.out.println("push : "+this.data[this.TOP]+" posisi:"+getTop());
        }
        else{
            System.out.println("Stack Penuh !");
        }
    }

    @Override
    public void pop() {
        if(this.TOP>-1){
            System.out.println("pop : "+this.data[this.TOP]+" posisi:"+getTop());
            this.temp=this.data[this.TOP];
            this.TOP--;
        }
        else{
            System.out.println("Stack Empty !");
        }
    }

    @Override
    public void dislpay() {
        if(this.TOP!=-1){
            int i=0;
            while(i<=this.TOP){
                System.out.println("["+this.data[i]+"] ");
                i++;
            }
        }
        else{
            System.out.println("Stack Empty !");
        }      
    }

    @Override
    public int getTop() {
        return this.TOP;
    }

    @Override
    public int getTopValue() {
        if(this.TOP!=-1) return this.data[this.TOP];
        return -1;
    }
    /**
     * @return the temp
     */
    public int getTemp() {
        return this.temp;
    }
    /**
     * @return the tempsize
     */
    public int getSize() {
        if(this.tempsize!=0) return this.tempsize;
        return -1;
    }
    public boolean isEmpty(){
        return this.TOP==-1;
    }
    public boolean isFull(){
        return this.TOP==maxSize-1;
    }

}