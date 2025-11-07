class Book1{
    private String title;
    private String author;
    private int publicationYear;
    
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public int getpublicationYear(){
        return publicationYear;
    }
    public void settitle(String title){
        this.title = title;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public void setpublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public void displayBookInfo() {
    	 System.out.println("Title : " + title);
         System.out.println("Author : " + author);
         System.out.println("Publication Year :  + " + publicationYear);
    }
}
public class ClassandObject2{
    public static void main(String args[]){
        Book1 book = new Book1();
        System.out.println("-------------Book - 1------------");
        book.setauthor("TechPublication");
        book.setpublicationYear(2003);
        book.settitle("Java Core");
        book.displayBookInfo();
        System.out.println("-------------Book - 2------------");
        Book1 book1 = new Book1();
        book1.setauthor("JRB Pub");
        book1.setpublicationYear(2004);
        book1.settitle("C++");
        book1.displayBookInfo();
    }
}

