import java.util.Scanner;

public class CWH_Practice_Problems {

    public static void main(String[] args) {

        String website =" ";

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease your website domain: ");
        website = scanner.nextLine();

        if (website.endsWith(".com")){
            System.out.println(website+" is a commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println(website+" is an Indian website");
        }
        else if (website.endsWith(".org")){
            System.out.println(website+" is a organization website");
        }

    }
}
