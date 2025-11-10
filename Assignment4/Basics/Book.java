
class Book {
    private String title;
    private String author;
    private String publisher;
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getPublisher(){
        return publisher;
    }

    public static void main(String args[]){
        Book b1=new Book();
        b1.setTitle("Learning Java");
        b1.setAuthor("Arumugam");
        b1.setPublisher("TechPress");

        System.out.println("Book Title: "+b1.getTitle());
        System.out.println("Author: "+b1.getAuthor());
        System.out.println("Publisher: "+b1.getPublisher());
    }
}
