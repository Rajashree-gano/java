package reversepk;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	   {
		   int n,m,a=0,x,sum=0,nt;
		   Scanner input=new Scanner(System.in);
		   System.out.println("enter a number");
		   n=input.nextInt();
		   m=n;
		   while(n>0)
		   {
		   	   x=n%10;
		   	   a=a*10+x;
		   	   n=n/10 ;
		   }
		   
		   	 if(m==a)
		   	 {
		   		 while(a>0)
		   	 {
		   		 nt=a%10;
		   		 if(nt%2==0)
		   		 {
		   			 sum=sum+nt;
		   		 }
		   	 a=a/10;
		   	 }
		   	 
		   		 if(sum>25) {
		   			 System.out.println("Given number "+m+" is Palindrome sum is greater than 25 ");
		   		 }else {
		   			System.out.println("Given number "+m+" is Palindrome sum is less than 25 ");
		   		 }
		   	 }
		   	 	
	 else
		 System.out.println("given number "+m+"not a palindrome");
	   }		  	  
		   	  
	   }



