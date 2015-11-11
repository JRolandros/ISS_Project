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
		
		System.out.println("\nThe result of the computation is " + (a.multiply(b).subtract(anobymous)).divide(c).add((d.multiply(d)).subtract(a.subtract(b)))+"\n");

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
			System.out.println("\n"+a + " is strictly less than " + b);
		if(a.compareTo(b) <= 0)
			System.out.println("\n"+a + " is less than or equal to " + b);
		if(	a.compareTo(b) == 0)
			System.out.println("\n"+a + " is equal to " + b);
		if(	a.compareTo(b) >= 0)
			System.out.println("\n"+a + " is greater than or equal to " + b);
		if(	a.compareTo(b) > 0)
			System.out.println("\n"+a + " is strictly greater than " + b);
		if(a.compareTo(b) != 0)
			System.out.println("\n"+a + " is different from " + b);		
		
	}

	public static void randomNumbers() {
		System.out.println("\nExercise 4:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 4 below this comment!
		 ************************************************************/

		SecureRandom prng = new SecureRandom();
		BigInteger Num64_bit = new BigInteger(64, prng);
		BigInteger Num128_bit = new BigInteger(128, prng);
		BigInteger Num256_bit = new BigInteger(256, prng);
		BigInteger Num512_bit = new BigInteger(512, prng);
		BigInteger Num1024_bit = new BigInteger(1024, prng);
		BigInteger Num2048_bit = new BigInteger(2048, prng);  

		
		
		System.out.println("\nRandom 64 bits: " + Num64_bit);
		System.out.println("\nRandom 128 bits: " + Num128_bit);
		System.out.println("\nRandom 256 bits: " + Num256_bit);
		System.out.println("\nRandom 512 bits: " + Num512_bit);
		System.out.println("\nRandom 1024 bits: " + Num1024_bit);
		System.out.println("\nRandom 2048 bits: " + Num2048_bit);
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
