
package casualwrbooksystem;

public class Book {
    private int bookNumber;
    private String title;
    private String mainAuthor;
    private String genre;
    private int year;
    
    public Book(int bn, String title, String author, String genre, int year){
        bookNumber = bn;
        this.title = title;
        mainAuthor = author;
        this.genre = genre;
        this.year = year;
    }
    public int getBookNum(){
        return bookNumber;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return mainAuthor;
    }
    public String getGenre(){
        return genre;
    }
    public String toString(){
        String s = "\n==================";
        s += "\nBook Number: "+bookNumber+"\nTitle: "+title+
                "\nMain author: "+mainAuthor+"\nGenre: "+genre+"\nYear: "+year;
        return s;
    }
}
