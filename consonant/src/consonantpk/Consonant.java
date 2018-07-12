package consonantpk;
import java.util.Scanner;
public class Consonant {
public static void main(String args[]) {
	String str,rev;
	char ch;
	System.out.println("enter a string");
	Scanner sc=new Scanner(System.in);
	str=sc.nextLine();
	try {
		Integer.parseInt(str);
		System.out.println("invalid");
	}
	catch(NumberFormatException e)
	{
	for(int i=0;i<str.length();i++)
	{
	ch=str.charAt(i);

	
	 if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
			    ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
			    ch=='u' || ch=='U')
			    {
			        System.out.print(ch+" is a Vowel");
			    }
			    else
			    {
			        System.out.print(ch+" is a consonant");
			    }

}
	}
	}}
