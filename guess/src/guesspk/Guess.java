package guesspk;
import java.util.Scanner;

public class Guess {
	public static void main(String args[])
	{
		int n=50,a;
		Scanner sc=new Scanner(System.in);
		System.out.println("guess a number");
	a=sc.nextInt();
	if(a==n)
	{
		System.out.println("number matches the original number");
	}
	else if(a>=n)
	{
		System.out.println("number guessed is morethan the original number");
	}
	else
	{
		System.out.println("number guessed is lessthan the original number");
		
	}
	}

}
