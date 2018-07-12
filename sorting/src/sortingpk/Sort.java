package sortingpk;
import java. util. Arrays;
import java.util.Scanner;

public class Sort {
                   public static void main(String args[])
                   {
            
                    	   int n,i=0;
                    	   int sum=0,temp=0;
                    	   Scanner sc=new Scanner(System.in);
                    	   System.out.println("enter the number");
                           n=sc.nextInt();
                                int j = 0;
                                int len = String.valueOf(n).length();
                                int[] a= new int[len];
                                temp=n;
                                do {
                                	a[i]=temp%10;
                                	temp/=10;
                                	i=i+1;
                                }
                                while(temp!=0);
                         for(int x=0;x<len;x++)
                         {
                        	 for(int y=x+1;y<len;y++)
                        	 {
                        		 if(a[x]<a[y])
                        		 {
                        			 temp = a[x];
                                     a[x] = a[y];
                                     a[y] = temp;
                                 }
                             }
                         }
                         for (int x = 0; x < len; x++) {
                             if (a[x] % 2 == 0) {
                                 sum += a[x];
                             }
                         }
                         System.out.print("Sorted number in non-increasing order : ");
                         for (int x = 0; x < len; x++) {
                             System.out.print(a[x]);
                         }
                         System.out.println("\nSum of even numbers: " + sum);
                         if (sum > 15) {
                             System.out.println("True");
                         } else {
                             System.out.println("False");

                         }

                     }
                        			 
                        	
                         
                       }  

                  

