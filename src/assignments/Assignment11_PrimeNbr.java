package assignments;

public class Assignment11_PrimeNbr {

	public static void main(String[] args) {
		
		int inputnbr =10;
		boolean  prime =true;
		
//Given a number n, determine whether it is a prime number or not. A prime number is a
//number greater than 1 that has no positive divisors other than 1 and itself.
		
		if (inputnbr <=1 )
		{
			System.out.println(inputnbr +" Its not a Prime number as its <= 1");
			prime =false;
		}
		
//		Check if any other divisors ther other than the number itself
		for (int i =2; i< inputnbr; i++) 
		{
			if (inputnbr % 2 ==0) {
				System.out.println("Not a Prime");
				prime = false;
			}
		}
		
		if (prime) {
			System.out.println("This is a Prime Number " + inputnbr);
		}
			
	}

}
