class MyInversi{
    private int B[];
    MyInversi(int A[]){
        this.B=A;
    }
    public boolean isinversi(int i,int j,int A[]){
        if(i<j&&A[i]>A[j]) return true;
        return false;
    }
    public int inversion(){
        int i=0,j=0;
        int count=0;
        while(i<this.B.length-1){
            j=i;
            while(j<this.B.length-1){
                if(isinversi(i, j+1, B)) count++;
                j++;
            }
            i++;
        }
        return count;
    }
    /**
     * @param b the b to set
     */
    public static void main(String[] args) {
        int A[]={1, 9, 6, 4, 5};
        MyInversi array=new MyInversi(A);
        System.out.println("Jumlah inversi : "+array.inversion());
    }
}