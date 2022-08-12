public class Practice_Problems {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};

        int max = 0;

        for (int i:arr) {
            if (i>max){
                max=i;
            }
        }

        System.out.println("The maximum values is: "+max);
    }

}
