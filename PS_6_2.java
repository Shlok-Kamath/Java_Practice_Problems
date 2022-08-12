public class Practice_Problems {

    public static void main(String[] args) {

        int [] arr ={1,2,3,4,50,5,6,7,9,8,9,34,546,657,435,56,34};

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number: ");
        n = sc.nextInt();

        Boolean ans = false;

        for (int i : arr){
            if (i == n){
                ans= true;
                break;
            }
        }

        if (ans){
            System.out.println("Yes, "+n+" is in given array.");
        }
        else {
            System.out.println("No, "+n+" is not in given array.");
        }

    }

}
