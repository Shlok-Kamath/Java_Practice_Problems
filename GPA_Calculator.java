public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double total=0;

        System.out.println("NOTE: Enter 10 for 'S', 9 for 'A' .... and so on.");
        System.out.println("Please enter Java grade: ");
        total+= sc.nextInt()*3;

        System.out.println("Please enter DSD theory grade: ");
        total+= sc.nextInt()*3;

        System.out.println("Please enter DSA theory grade: ");
        total+= sc.nextInt()*3;

        System.out.println("Please enter TOC grade: ");
        total+= sc.nextInt()*3;

        System.out.println("Please enter Math grade: ");
        total+= sc.nextInt()*4;

        System.out.println("Please enter DSA Lab grade: ");
        total+= sc.nextInt();

        System.out.println("Please enter DSD Lab grade: ");
        total+= sc.nextInt();

        System.out.println("Please enter Eng Lab grade: ");
        total+= sc.nextInt();

        System.out.println("Please enter STS grade: ");
        total+= sc.nextInt()*1.5;

        System.out.println("Please enter Spanish grade: ");
        total+= sc.nextInt()*2;

        System.out.println("GPA = "+total/22.5);

    }

}
