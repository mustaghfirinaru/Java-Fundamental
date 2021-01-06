class TestBook{
    public static void main(String[] args) {
        Author anAuthor=new Author("Al Fa", "feleventen@gmail.com", 'L');
        Book aBook=new Book("Java for noob",anAuthor,20.19,1000);
        Book anotherBook=new Book("Java for legend",new Author("Far","schestalker@gmail.com",'L'),44.44,999);
        System.out.println(aBook.toString());
        System.out.println(anotherBook.toString());
    }
}