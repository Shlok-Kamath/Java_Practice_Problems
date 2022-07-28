public class CWH_Practice_Problems {

    public static void main(String[] args) {

        int income =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter your annual income:  ");
        income= scanner.nextInt();
      
      

       //You may note that java ignores underscores used for better understanding of numbers by programmer
        if (income < 2_50_000 ){
            System.out.println("There is no need for you to pay income tax");
        }
      
        else if( income >=2_50_000 && income < 5_00_000){
            System.out.println("Your income tax is: "+income/20.0);
        }
      
        else if( income >=5_00_000 && income < 10_00_000){
            System.out.println("Your income tax is: "+income/5.0);
        }
      
        else{
            System.out.println("Your income tax is: "+income*3/10.0);
        }
    }
}
