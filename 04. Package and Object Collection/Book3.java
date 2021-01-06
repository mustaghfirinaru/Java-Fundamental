class Book3{
    private String name;
    private Author3[] authors = new Author3[5];
    private double price;
    private int qtyInStock;
    private int numAuthors;
    Book3(){
        this.qtyInStock=0;
        this.numAuthors=0;
    }
    Book3(String name, double price){
        this.name=name;
        this.price=price;
        this.numAuthors=0;
    }
    Book3(String name,double price,int qtyInStock){
        this.name=name;
        this.price=price;
        this.qtyInStock=qtyInStock;
        this.numAuthors=0;
    }
    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }
    /**
     * @return the author
     */
    public Author3[] getAuthor() {
        return this.authors;
    }
    /**
     * @return the price
     */
    public double getPrice() {
        return this.price;
    }
    /**
     * @return the qtyInStock
     */
    public int getQtyInStock() {
        return this.qtyInStock;
    }
    public void printAuthors(){
        int i=0;
        if(this.numAuthors!=0){
            while(i<this.numAuthors){
                System.out.print(this.authors[i].getName()+", ");
                i++;
            }
        }
        System.out.println();
    }
    /**
     * @param qtyInStock the qtyInStock to set
     */
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "Buku "+this.name+" oleh "+this.numAuthors+" penulis "+this.qtyInStock+" pcs seharga "+this.price;
    }
    public void addAuthor(Author3 author){
        this.authors[numAuthors]=author;
        this.numAuthors++;

    }
    public boolean removeAuthorByName(String authorname){
        int i=0;
        int flag=0;
        while(i<this.numAuthors){
            if(this.authors[i].getName()==authorname){
                flag=1;
                this.numAuthors--;
                break;
            }
            i++;
        }
        while(i<this.numAuthors){
            this.authors[i].setName(this.authors[i+1].getName());
            this.authors[i].setEmail(this.authors[i+1].getEmail());
            this.authors[i].setGender(this.authors[i+1].getGender());
            i++;
        }
        if(flag==1) return true;
        return false;
    }
}