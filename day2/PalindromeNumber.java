package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		    String str = "34343", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		   
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) 
		    {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }
		

	}


