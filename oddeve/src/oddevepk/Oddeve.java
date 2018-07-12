package oddevepk;
import java.util.Scanner;

public class Oddeve {
public static void main(String args[])

{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	n=sc.nextInt();
	
	
	if((n%2==0)&&(n>20)&&(n<30)){ 
			System.out.println("jerry");
		
	}
	else if(((n%2!=0)&&(n>20)&&(n<30)))
	{
		System.out.println("tom");
	}
	else {
		System.out.println("not defined");
	}
	
}
}
