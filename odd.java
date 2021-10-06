import java.io.*;
import java.util.*;
class odd{
      public static void main(String args[])
 {
   int sum=0;
   int num[]=new int[5];
   Scanner sc = new Scanner();
   System.out.println("Enter the numbers:");
   for(int i=0;i<=5;i++)
   {
   System.out.println("The Numbers are:");
   num=sc.nextInt();
   }
   for(i=0;i<=5;i++)
   {
   if(num[i] %2!= 0)
   {
    System.out.println("The given number is odd:"+num[i]);
    sum=sum+num[i]; 
    System.out.println("The sum is:"+sum);
   else
   {
   System.out.println("wrong input");
   }
 }
 }
    
   
        
