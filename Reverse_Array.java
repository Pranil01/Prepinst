package Arrays;

import java.util.Scanner;

public class Reverse_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert size of array");
		int n= sc.nextInt();
		int []	arr=new int [n];
		System.out.println("Insert array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		 System.out.print("Revesrsed array as:");
		for(int i=arr.length-1;i>=0;i--)
		{
		  System.out.print(arr[i]+" ");  
		}


	}

}
