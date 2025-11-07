class Book{
    private String title;
    private String author;
    private long ISBN;
    Book(String title,String author,long ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public long getISBN(){
        return ISBN;
    }
}
public class ClassandObject1{
    public static void main(String args[]){
        Book book = new Book("OOP's","Publication",1234564);
        System.out.println(book.gettitle());
        System.out.println(book.getauthor());
        System.out.println(book.getISBN());
    }
}

