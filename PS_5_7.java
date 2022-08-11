public class Practice_Problems {

    public static void main(String[] args) {
        for (int i=0;i<4;i++){
            System.out.print("*");
            for (int j=0;j<3-i;j++) {
                System.out.print(" *");
            }
            System.out.println("\n");
        }
    }
}
