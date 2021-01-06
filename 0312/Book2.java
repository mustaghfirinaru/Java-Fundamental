class Book2{
    private String name;
    private Author2 author[];
    private double price;
    private int qtyInStock;
    Book2(){
        this.qtyInStock=0;
    }
    Book2(String name,Author2 author[],double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    Book2(String name,Author2 author[],double price,int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
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
    public Author2[] getAuthor() {
        return this.author;
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
        while(i<author.length){
            System.out.print(this.author[i].getName()+", ");
            i++;
        }
    }
    /**
     * @param qtyInStock the qtyInStock to set
     */
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "Buku "+this.name+" oleh "+this.author.length+" penulis "+this.qtyInStock+" pcs seharga "+this.price;
    }
}