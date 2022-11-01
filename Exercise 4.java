class Library{

    String [] arr = new String[100];
    int [] num = new int[100];
    int i=0;

    void addBook(String s, int n){
        arr[i] = s;
        num[i] = n;
        i++;
    }

    void issueBook(String s){
        int a=0;
        for(int j=0; j<i; j++){
            if(arr[j] == s){
                a++;
                if(num[j]!=0){
                    num[j]--;
                    System.out.println("Issued: "+s);
                    System.out.println("Total quantity remaining: "+num[j]);
                }
                else {
                    System.out.println("Sorry out of stock!!");
                }
            }
        }
        if(a==0) System.out.println("No such book available");
    }

    void returnBook(String s){
        for(int j=0; j<i; j++){
            if(arr[j] == s){
                num[j]++;
                System.out.println("Returned: "+s);
                System.out.println("Total quantity: "+num[j]);
            }
        }
    }

    void showAvailableBooks(){
        for (int j = 0; j < i; j++) {
            System.out.println("Book: "+arr[j]+" Quantity: "+num[j]);
        }
    }
}

public class Main {
    public static void main(String[] args){
        Library l =new Library();
        l.addBook("Psychology of Money",5);
        l.addBook("Rich Dad Poor Dad",3);
        l.addBook("Secret of Investing",2);
        l.addBook("Cash-flow Quadrant",1);
        l.showAvailableBooks();
        l.issueBook("Psychology of Money");
        l.issueBook("Cash-flow Quadrant");
        l.issueBook("Cash-flow Quadrant");
    }

}
