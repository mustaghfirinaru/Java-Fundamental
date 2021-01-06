class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    Book(){
        this.qtyInStock=0;
    }
    Book(String name,Author author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    Book(String name,Author author,double price,int qtyInStock){
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
    public Author getAuthor() {
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
    /**
     * @param qtyInStock the qtyInStock to set
     */
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    @Override
    public String toString() {
        return "Buku "+this.name+" oleh "+this.author.getName()+" "+this.qtyInStock+" pcs seharga "+this.price;
    }
    
}