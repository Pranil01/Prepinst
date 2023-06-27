public class ReverseString{
  public static void main(String[]args){
        
    String p ="ruturaj";
       String rev ="";
       for(int i=p.length()-1;i>=0;i--){
            rev = rev+p.charAt(i);   }
         
    System.out.println("Given String in to reverse Format as:"+rev);
}
}
          