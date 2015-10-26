package bigint;

import java.lang.Character.Subset;
import java.math.BigInteger;
import java.security.SecureRandom;

public class BigIntegerExercise {

	public BigIntegerExercise() {
	}

	public static void expression() {

		System.out.println("\nExercise 2:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 2 below this comment!
		 ************************************************************/
		BigInteger a = new BigInteger("512");
		BigInteger b = new BigInteger("102");
		BigInteger c = new BigInteger("3");
		BigInteger d = new BigInteger("761");
		BigInteger anobymous = new BigInteger("4");		
		
		System.out.println("The result is " + (a.multiply(b).subtract(anobymous)).divide(c).add((d.multiply(d)).subtract(a.subtract(b))));

	}

	public static void comparison() {
		System.out.println("\nExercise 3:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 3 below this comment!
		 ************************************************************/
		BigInteger a = new BigInteger("781");
		BigInteger b = new BigInteger("12891");
		
		if(a.compareTo(b) < 0)
			System.out.println(a + " is strictly less than " + b);
		if(a.compareTo(b) <= 0)
			System.out.println(a + " is less than or equal to " + b);
		if(	a.compareTo(b) == 0)
			System.out.println(a + " is equal to " + b);
		if(	a.compareTo(b) >= 0)
			System.out.println(a + " is greater than or equal to " + b);
		if(	a.compareTo(b) > 0)
			System.out.println(a + " is strictly greater than " + b);
		if(a.compareTo(b) != 0)
			System.out.println(a + " is different from " + b);		
		
	}

	public static void randomNumbers() {
		System.out.println("\nExercise 4:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 4 below this comment!
		 ************************************************************/

		SecureRandom prng = new SecureRandom();
		BigInteger Num64 = new BigInteger(64, prng);
		BigInteger Num128 = new BigInteger(128, prng);
		BigInteger Num256 = new BigInteger(256, prng);
		BigInteger Num512 = new BigInteger(512, prng);
		BigInteger Num1024 = new BigInteger(1024, prng);
		BigInteger Num2048 = new BigInteger(2048, prng);  

		
		
		System.out.println("Random 64: " + Num64);
		System.out.println("Random 128: " + Num128);
		System.out.println("Random 256: " + Num256);
		System.out.println("Random 512: " + Num512);
		System.out.println("Random 1024: " + Num1024);
		System.out.println("Random 2048: " + Num2048);
	}

	public void run() {
		/*
		 * Uncomment the method after the implementation!
		 */
		expression();
		comparison();
		randomNumbers();
	}

	public static void main(String[] args) {
		BigIntegerExercise m = new BigIntegerExercise();
		
		m.run();
	}

}
