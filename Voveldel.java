import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        String s = "pranil";
        String s1 = "";
        s1 = s.replaceAll("[aeiou]", ""); 
        System.out.println("String after removing vowel : "+s1); 
	}

}
