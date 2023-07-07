package CalContfrequency;

import java.util.Scanner;

public class CalContfrequencyofWords {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String:");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		//System.out.println(arr);
		int count =0;
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i]=='k') {
				
				
				count++;
				
			}
			
		}System.out.println(count);
		
  	}

}
