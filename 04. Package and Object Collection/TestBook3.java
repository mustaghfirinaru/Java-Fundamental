class TestBook3{ 
    public static void main(String[] args){
        Book3 javaDummy = new Book3("Java for Dummy", 19.99, 99); System.out.println(javaDummy);// toString()
        System.out.print("The authors are: ");
        javaDummy.printAuthors();
        javaDummy.addAuthor(new Author3("Wijanarto","mazwied@dodol.com", 'm'));
        javaDummy.addAuthor(new Author3("Raihan", "Rai@bedol.com", 'm'));
        System.out.println(javaDummy);  // toString() 
        System.out.print("The authors are: "); 
        javaDummy.printAuthors(); 
        if (javaDummy.removeAuthorByName("Wijanarto")){
            System.out.println("\nWijanarto was removed");
            System.out.print("The new authors are: ");
            javaDummy.printAuthors();
            System.out.println("\n");
        }else{
            System.out.println("\nError remove ! ");
        }
        if (javaDummy.removeAuthorByName("Wijanarto")){
            System.out.println("\nWijanarto was removed");
            System.out.print("The new authors are: ");
            javaDummy.printAuthors();
            System.out.println("\n");
        }else{
            System.out.println("\nError remove ! ");
        }
    }
}