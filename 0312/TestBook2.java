class TestBook2{
    
    public static void main(String[] args) {
        Author2[] authors = new Author2[2]; 
        authors[0] = new Author2("Wijanarto", "mazwied@dodol.com", 'm'); 
        authors[1] = new Author2("Raihan", "Rai@bedol.com", 'm'); 
        // Deklarasikan dan alokasikan instance Book
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString() 
        System.out.print("Penulisnya : "); javaDummy.printAuthors();
    }
}