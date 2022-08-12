public class Practice_Problems {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,70,9};
        Boolean is_sorted = true ;

        for (int i = 0 ; i< arr.length - 1 ; i++) {
            if (arr[i]>arr[i+1]){
                is_sorted = false;
                System.out.println("No the given array is not sorted");
                break;
            }
        }

        if (is_sorted){
            System.out.println("Yes the given array is sorted");
        }
    }

}
