 public class Practice_Problems {

    public static void main(String[] args) {

        float [] physics = {81.1f,82.2f,83.4f,84.3f,85.5f,86.6f,87.7f,88.8f,89.9f,90.0f};

        float total=0;

        for (float i : physics){
            total+=i;
        }

        System.out.println("Total of physics marks is: "+total);

    }

}
