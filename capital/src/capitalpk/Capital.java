package capitalpk;
import java.util.Scanner;

public class Capital {
public static void main(String args[]) 
{
	char n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a character");
	n=sc.next().charAt(0);
	if(n>='A' && n<='Z')
	{
		System.out.println("capital");
		
	}
	else if(n>='a' && n<='z') {

	System.out.println("small letter");
	}
	else if(n>='0' && n<='9') {
		System.out.println("number");
	}
	else {
		System.out.println("special character");
	}
}
}
