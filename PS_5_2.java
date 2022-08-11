 public class CWH_Practice_Problems {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        int total = 0;
        while(n!=0){
            total+=2*n;
            n--;
        }

        System.out.println(total);
    }
}
