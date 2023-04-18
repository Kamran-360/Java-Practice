// import java.util.ArrayList; --> Remember we can also implement it through ArrayList but to give regular array intuition is as follows
class Library{
    private  String[] books,issuedBooks;
    private int indexBook=0,indexIssuedBook=0;

    public Library() {
        //Assuming we have a library of capacity 50 , you could customize it according to the need
       this.books = new String[50];
       this.issuedBooks = new String[50];
    }

    public void addBook(String book){
        //first check whether the book has already been added for the availability or not then we are moving to add the book
        boolean check = false;
        for (String i : books){
            if(i == book ){
                System.out.println("Book already Exists! ");
                check=true;
                break;
            }
        }
        if(check==false){
            books[indexBook]=book;
            indexBook++;
            System.out.println("Book has successfully been added! ");
        }
    }
    public void issueBook(String issuedBook){
        //first check whether that book has added by someone already or not in the book list
        boolean exist = false;
        for (String book : books){
            if(issuedBook == book){
                exist = true;
            }
        }
        if(exist == true){
            boolean check = false;
            for(String i : issuedBooks){
                if (i == issuedBook){
                    check = true;
                    System.out.println(issuedBook + " has Already been issued");
                    break;
                }
            }
            if(check==false){
                issuedBooks[indexIssuedBook]=issuedBook;
                indexIssuedBook++;
                System.out.println("Issued successfully!\nNOTE: Please return the book one day before the due date.Thank You!");
            }
        }
        else{
            System.out.println("That book has not been added to issue!");
        }

    }
    public void returnBook(String returnBook){
        //check whether the book exists or not to return
        boolean check = false;
        for (int i = 0; i < issuedBooks.length ; i++) {
            if(returnBook == issuedBooks[i]){
                issuedBooks[i]=null;
                check = true;
                System.out.println("Placed to the shelf successfully.Thanku Sir/Mam!");
                break;
            }
        }
        if (check == false){
            System.out.println("Book Does'nt Exist!\n");
        }
    }
    public void showAvailableBooks(){
        //showing the available books after some checks
        int countBooks = 0;
        System.out.println("BOOKS AVAILABLE : ");
       for(String b : books){
           boolean a =false;
           if(books[0]==null){
               System.out.println( "No book available yet.");
               break;
           }
           if(b == null){break;}
           else {
               for(String next : issuedBooks){
                   if(b == next){
                       a =true;
                       break;}
               }
             if(a != true){
                 countBooks ++;
                 System.out.println(b);
             }
           }
       }
       if(countBooks == 0){
           System.out.println("No books Available to show! ");
       }
    }

}

public class Main {
    public static void main(String[] args) {
        //creating a library Assistant
        Library obj = new Library();
        obj.issueBook("hundred Ideas");
        obj.addBook("hundred Ideas");
        obj.showAvailableBooks();
        obj.issueBook("hundred Ideas");
        obj.showAvailableBooks();
        obj.returnBook("hundred Ideas");
        obj.showAvailableBooks();
        obj.addBook("Harry Potter and the Philosopher's Stone");
        obj.addBook("The Lord of the Rings");
        obj.showAvailableBooks();
        //would love to have your contibutions!
    }
}

