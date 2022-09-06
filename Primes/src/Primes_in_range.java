
public class Primes_in_range {
	public static void main(String[] args) {
		int r1 = 100;															// Lower Range Limit
		int r2 = 200;															// Maximum Range Limit
		for(int i =r1; i < r2 ;i++) {											// checking the prime no. from 100 to 200
			int count =0;
			for(int j=2 ;j < i/2 ;j++ ) {
				if(i%j == 0)													// if number is composite then the loop breaks
				{	count++;
					break;
				}
			}
			if(count == 0) {													// Printing prime numbers.
				System.out.println(i);
			}
		}

	}


}
