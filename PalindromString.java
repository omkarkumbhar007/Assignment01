package StringPrograms;
import java.util.*;

public class PalindromString {

	public static void main(String args[])
	{
		 String str1="mada34m";
		 String str=str1.toLowerCase();
		 System.out.println("String is: "+str);
		 StringBuffer sb=new StringBuffer();
		 
		 for(int i=str.length()-1;i>=0;i--)
		 {
			 char ch=str.charAt(i);
			 sb.append(ch);
		 }
		 
		System.out.println("Sb string is: "+sb);
		 if(str.compareTo(sb.toString())==0)
		 {
			 System.out.println("String is Palindrome");
			 
		 }
		 else
		 {
			 System.out.println("String is Not Palindrome.");
		 }
	}
}
