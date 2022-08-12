public class Practice_Problems {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};

        int min = 100000;

        for (int i:arr) {
            if (i<min){
                min=i;
            }
        }

        System.out.println("The minimum values is: "+min);
    }

}
