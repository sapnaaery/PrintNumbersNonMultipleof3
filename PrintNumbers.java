package day6;

public class PrintNumbers {

	public static void main(String[] args) {
		// program to print all numbers from 1 to 20, skipping multiples of 3.

		for (int num = 1; num <= 20; num++) {
			if (num % 3 == 0)// skipping num multiple of 3
			{
				continue;
			} 
				
			System.out.println(num);// printing num not multiple of 3
			
		}

	}

}
