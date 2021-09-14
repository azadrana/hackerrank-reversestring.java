// reverse string and check it it is palindrome or not
import java.util.*;
class Solution2
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
	  String rev="";
	  String str=sc.nextLine();
	  int L=str.length();
	  for(int i=L-1;i>=0;i--)
	  {
	     rev=rev+str.charAt(i);
		 
	  }
	  if(str.equals(rev))
	  {
	     System.out.println("Yes");
	  }
	  else
	  {
	      System.out.println("No");
	  }
	  
   }
}