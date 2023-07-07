package CalContfrequency;

import java.util.Scanner;

public class CalNoofChar 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
		 int[] freq = new int[str.length()]; 
		 char st[] = str.toCharArray();
		 for(int i = 0;i<str.length();i++) 
		 {
			 freq[i]=1;
			 for(int j = i+1;j<str.length();j++) 
			 {
				 if(st[i]==st[j])
				 {
					 freq[i]++;
					 freq[j]='0';
				 } 
			 }
		 }
		 for(int i = 0; i <freq.length; i++) 
		 { 
		       if(st[i] != ' ' && st[i] != '0') 
		          System.out.println(st[i] + "-" + freq[i]); 
		       } 
		}

	}
