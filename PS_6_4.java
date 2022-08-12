import java.util.Scanner;

 public class Practice_Problems {

     static int [][] add(int [][] a, int [][] b){

         int [][] arr = {{0,0,0},{0,0,0}};

         for (int i =0 ; i<2 ; i++){
             for (int j =0 ; j<3 ; j++){
                 arr[i][j] = a[i][j] + b[i][j];
             }
         }

         return arr;
     }

    public static void main(String[] args) {

         int [][] a = {{0,0,0},{0,0,0}}, b= {{0,0,0},{0,0,0}};

         Scanner sc = new Scanner(System.in);

        for (int i =0 ; i<2 ; i++){
            for (int j =0 ; j<3 ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for (int i =0 ; i<2 ; i++){
            for (int j =0 ; j<3 ; j++){
                b[i][j] = sc.nextInt();
            }
        }

        int [][] ans = add(a,b);

        for (int i=0 ; i<2 ; i++){
            System.out.printf("%d %d %d\n",ans[i][0],ans[i][1],ans[i][2]);
        }

    }

}
