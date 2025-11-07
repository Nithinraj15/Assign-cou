class Book2{
    private String title;
    private String author;
    private int publicationYear;
    
    Book2(String title, String author,int publicationYear){
    	this.title =title;
    	this.author = author;
    	this.publicationYear =publicationYear;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public int getpublicationYear(){
        return publicationYear;
    }
    public void displayBookInfo() {
    	 System.out.println(title +" " + author + " published in " + publicationYear);
    } 
}
public class Objects1{
    public static void main(String args[]){
        Book2 book = new Book2("A book by","Jane Austen,",1813);
        
        book.displayBookInfo();
      
        Book2 book1 = new Book2("A book by","George Orwell,",1949);
	    book1.displayBookInfo();
	    Book2 book2 = new Book2("A book by","J.K. Rowling,",1997);
	    book2.displayBookInfo();
    }
}

