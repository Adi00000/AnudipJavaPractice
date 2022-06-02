import java.util.Scanner;

public class PalindromeAndArmstrong {

    //Method for palindrome
  
    public static void Palindrome(String str){
    String rev = "";
    for(int i=str.length()-1;i>=0;i--){
        rev = rev + str.charAt(i);
    }
      
       if(str.equals(rev)){
           System.out.println(str+" is a palindrome number");
       }
       else{
           System.out.println(str+" is not a palindrome number");
       }
    }
  
    //Method for Armstrong
  
    public static void Armstrong(int n){
        int m = n;
      int rem = 0;
      int sum = 0;

      while(m!=0){
          rem = m % 10;
          sum = sum + rem*rem*rem;
          m = m / 10;
      }
      
      if(sum==n){
          System.out.println(n+" is a armstrong number");
      }
      else{
          System.out.println(n+" is not a armstrong number");
      }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Taking input to check palindrome and armstrong
        System.out.println("Enter string to check palindrome");
        String str = input.nextLine();
        System.out.println("Enter number to check Armstrong");
        int n = input.nextInt();
        Palindrome(str);
        Armstrong(n);

    }
}
