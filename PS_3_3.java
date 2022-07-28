public class CWH_Practice_Problems {

    public static void main(String[] args) {

        String original = "Dear <|name|>, We have decided to send you abroad for work so please give us the confirmation at the earliest.\nCongratulations Mr. <|name|>.";
        String modified = original.replace("<|name|>","Shlok");
      
      
       //Message Template
        System.out.println("The original string:\n"+original);
      
      //Customised message using replace
        System.out.println("\n\nThe modified string\n"+modified);

    }
}
