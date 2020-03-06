package casualwrbooksystem;
import java.util.*;

public class CasualWrBookSystem {

    public static void main(String[] args) {
        Catalogue a = new Catalogue(10000, 99999);
        
        String initialScreen = "\n\n********************************************\n"
                + "Welcome to the CASUAL WRITERS BOOK CLUB\n"
                + "Please select an option from the list below.\n"
                + "1. Add Book\n2. Delete Book\n3. View All books\n"
                + "4. View Book Details\n5. Exit\n"
                + "********************************************\n";
        System.out.println(initialScreen);  
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        
        while (!(option >= 1) && !(option <= 5)){
            System.out.println(initialScreen);  
            option = sc.nextInt();
        }   
            while(option != 5){
            switch (option){
            case 1:
                String bTitle, mAuthor, gen;
                int y;
                Scanner input1 = new Scanner(System.in);
                System.out.print("Enter the book's title: ");
                bTitle = input1.nextLine();
                System.out.print("Enter the book's main author: ");
                mAuthor = input1.nextLine();
                System.out.print("Enter the book's genre: ");
                gen = input1.nextLine();
                System.out.print("Enter the book's year: ");
                y = input1.nextInt();
                if(a.addBook(bTitle, mAuthor, gen, y)){
                    System.out.println("\nTHE CATALOGUE SAYS: \nThe book was successfully added to the "
                        + "catalogue");
                }
                else{
                    System.out.println("\nTHE CATALOGUE SAYS: \nOne or more invalid data was entered as "
                        + "part of the book's information. Please try again.");
                }
                System.out.println(initialScreen);
                option = sc.nextInt();
                break;
            case 2:
                int bNum;
                Scanner input2 = new Scanner(System.in);
                System.out.println(a.getBookList());
                System.out.println("\nTHE CATALOGUE SAYS: \nPlease enter the Book Number from the list"
                        + "above that you want to delete: ");
                bNum = input2.nextInt();
                if(a.deleteBook(bNum)){
                    System.out.println("\nTHE CATALOGUE SAYS: \nBook "+bNum+" deleted successfully");
                }
                else{
                    System.out.println("\nTHE CATALOGUE SAYS: \nThe book number entered is not valid. "
                    + "No book has been deleted from the catalogue.");   
                }
                System.out.println(initialScreen);
                option = sc.nextInt();
                break;
            case 3:
                System.out.println(a.getBookList());
                System.out.println(initialScreen);
                option = sc.nextInt();
                break;
            case 4:
                Scanner input4 = new Scanner(System.in);
                System.out.println("\nTHE CATALOGUE SAYS: \nPlease enter the book number: ");
                bNum = input4.nextInt();
                if(a.viewBook(bNum) == "Book not found."){
                    System.out.println("\nCATALOGUE SAYS: \nThe book number "+bNum
                            + " was not found in the catalog. Please try again.");
                }
                else{
                    System.out.println("\nCATALOGUE SAYS: \n"
                            + "Here are the book details:"+a.viewBook(bNum));
                }
                System.out.println(initialScreen);
                option = sc.nextInt();
                break;
            default:
                break;
            }
        }
        System.out.println("*********************************"
                        + "\nExiting the program.\n"
                        + "Thank you for using The Casual Writers "
                        + "Book Club Catalogue. \nSee you next time!\n"
                        + "*********************************");
        
        
        
                                 
    }   
}
