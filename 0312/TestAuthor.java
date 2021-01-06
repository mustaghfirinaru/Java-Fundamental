class TestAuthor{
    public static void main(String[] args) {
        Author anAuthor=new Author("Al Fa", "feleventen@gmail.com", 'L');
        System.out.println(anAuthor);
        anAuthor.setEmail("feleventen@yahoo.com");
        System.out.println(anAuthor);
    }
}