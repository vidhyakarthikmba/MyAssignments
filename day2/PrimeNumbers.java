package week1.day2;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=13;
		boolean isPrime=true;
		
		if (number == 1) {
		   
			System.out.println("1 is neither prime nor composite number.");
		}

		// check if number is greater than 1
		else if (number > 1) {

		    // looping through 2 to number-1
		    for (int i = 2; i < number; i++) {
		        if (number % i == 0) {
		            isPrime = false;
		          
		            break;
		        }
		    }

		   	if (isPrime == true) {
		    	System.out.println(number + " is a prime number");
		    } else {
		    	System.out.println(number+ " is a not prime number");
		    }
	}

	}
}