public class Practice_Problems {

    static void multiplication(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", n,i,n*i);
        }

    }

    static void diagram1(int n){
        for (int i=0; i<n ; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int add(int n){
        if (n ==1 ){
            return 1;
        }
         return n + add( n-1);
    }

    static void diagram2(int n){
        for (int i=0; i<n ; i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fibonacci(int n){
        if (n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    static float avg(int [] arr){
        float total = 0;

        for (int i: arr) {
            total+=i;
        }

        return total / arr.length;
    }

    static void diagram1_rec(int n){
        if(n>0){
            diagram1_rec(n-1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void diagram2_rec(int n){

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        if(n>0){
            diagram2_rec(n-1);
        }
    }

    static float converter(float n){
        return n*9/5+32;
    }

    static int add_iterative(int n){
        int total = 0;

        for (int i = 0; i <= n; i++) {
            total+=i;
        }

        return total;
    }


    public static void main(String args[]){

        diagram1(4);
        multiplication(4);
        System.out.println(add(5));
        diagram2(4);
        System.out.println(fibonacci(5));
        System.out.println(avg(new int[]{1, 2, 3, 4, 5, 6}));
        diagram1_rec(4);
        diagram2_rec(4);
        System.out.println(converter(0));
        System.out.println(add_iterative(5));

        

    }
}
