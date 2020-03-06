package casualwrbooksystem;

public class Catalogue {
    private static int currentUnusedBookNo;
    private int maxBooks;
    private int numBooks;
    private Book[] booksList;
    
    public Catalogue(int bookNoSeed, int maxBooks){
        currentUnusedBookNo = bookNoSeed;
        this.maxBooks = maxBooks;
        numBooks = 0;
        booksList = new Book[maxBooks];
    }
    public boolean addBook(String title, String mainAuthor, 
            String genre, int year){
        if(numBooks < maxBooks){
            Book temp = new Book(currentUnusedBookNo, title, mainAuthor, 
                genre, year);
            booksList[numBooks] = temp;
            currentUnusedBookNo++;
            numBooks++;
            return true;
        }
        return false;
    }
    private int findBook(int bNum){
        for(int x = 0; x < numBooks; x++){
            if(booksList[x].getBookNum() == bNum){
                return x;
            } 
        }
        return -1;
    }
    public String viewBook(int bNum){
        int location = findBook(bNum);
        if(location > -1){
            return booksList[location].toString();
        }
        return "Book not found.";
    }
    public boolean deleteBook(int bNum){
        int location = findBook(bNum);
            if(location > -1){
                booksList[location] = booksList[numBooks-1];
                numBooks--;
                return true;
            }
            return false;
    }
    public String getBookList(){
        String s = "**** Casual Book Writers - Book List ****";
        for(int x = 0; x < numBooks; x++){
            s += booksList[x].toString();
        }
        return s;
    }
}
