 public class Practice_Problems {

    public static void main(String[] args) {

        float [] marks ={98.5f,77.9f,98.4f,94.6f,96.5f};

        float total = 0;
        for(float element:marks){
            total += element;
        }

        System.out.println("Total is: "+total);
    }

}
