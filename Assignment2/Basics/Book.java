public class Book {
    private String title;
    private String author;
    private String publisher;
    public void settitle(String title){
        this.title = title;
    }
    public String gettitle(){
        return title;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public String getauthor(){
        return author;
    }
    public void setpublisher(String publisher){
        this.publisher = publisher;
    }
    public String getpublisher(){
        return publisher;
    }
    
    public static void main(String[] args) {
        Book b = new Book();
        b.settitle("PS-1");
        System.out.println("Updated Title Name : "+b.gettitle());
        b.setauthor("Kalki");
        System.out.println("Updated Author Name : "+b.getauthor());
        b.setpublisher("India Today");
        System.out.println("Updated Publisher Name : "+b.getpublisher());

        
    }
    
}
