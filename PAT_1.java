import java.util.Scanner;

class Book{
    int id;
    String name;
  
    Book(String name, int id){
        this.name = name;
        this.id = id;
    }
}

class BookNotFoundException extends Exception{
    BookNotFoundException(String s){

    }
    @Override
    public String toString() {
        return "Book with the given id is not present";
    }

    @Override
    public String getMessage() {
        return "Book with the given id is not present";
    }
}

class Test{
    void findByID(Book[] books , int id) throws BookNotFoundException {
        int ans=0;
      
        for (Book b: books) {
            if(b.id == id){
                ans++;
                System.out.println("Book Found");
                break;
            }
        }
      
        if(ans==0){
            throw new BookNotFoundException("YES");
        }
    }
}

public class Main{
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      
        int n= sc.nextInt();
        Book books[] = new Book[n];
      
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            String s = sc.nextLine();

            books[i] = new Book(s,a);
        }
      
        Test test = new Test();
        int id = sc.nextInt();
      
        try {
            test.findByID(books, id);
        }
      
        catch (BookNotFoundException e){
            System.out.println(e);
        }
    }
}
