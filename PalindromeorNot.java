public class PalindromeorNot{
  public static void main(String[]args){
        
    String p ="ratar";
       String rev ="";
       for(int i=p.length()-1;i>=0;i--){
            rev = rev+charAt(p);   }
         if(rev==p){
    System.out.println("Given String "+p+"is Palindrome.");
            }
         else {
        System.out.println("Given String "+p+"is not Palindrome.");}
}}