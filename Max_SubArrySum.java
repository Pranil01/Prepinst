package Arrays;

import java.util.Scanner;

public class Max_SubArrySum {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert array size");
           int n= sc.nextInt();
           int arr[]=new int[n];
           System.out.println("Insert array elements");
           
           for(int i=0;i<n;i++)
           {
        	   arr[i]=sc.nextInt();
           }
           
           int sum=0;
           int end=0;
           int start=0;
           int tempstart=0;
           int max=Integer.MIN_VALUE;
           
           for(int i=0;i<n;i++)
           {
        	   sum+=arr[i];
        	   if(sum>max)
        	   {
        		   max=sum;
        		   end=i;
        		   start=tempstart;
        	   }
        	   
        	   if(sum<0)
        	   {
        		   sum=0;
        		   tempstart=i+1;
        	   }
           }
           
           System.out.println("Max sum of sub array "+ sum);
           
           for(int i=start;i<=end;i++)
           {
        	   System.out.print(arr[i]+" ");
           }
           
		
	}

}
