package strrevpk;
import java.util.Scanner;
public class Revstr {
	public static void main(String args[])
{
	String str,rev="";
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	str=sc.nextLine();
	
	 for(int i = str.length() - 1; i >= 0; i--)
     {
         rev = rev + str.charAt(i);
     }
	System.out.println(rev);
	

}
}

