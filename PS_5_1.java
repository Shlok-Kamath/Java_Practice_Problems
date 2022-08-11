public class Practice_Problems {

    public static void main(String[] args) {
        int i=0;
      
      // Used while loop.
      
      // This problem can also be solved using for loop.
        while (i<4){
            System.out.print("*");
            i++;
            int j=0;
            while (j<4-i) {
                System.out.print(" *");
                j++;
            }System.out.println("\n");
        }
    }
}
