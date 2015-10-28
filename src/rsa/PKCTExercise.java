package rsa;

import java.math.BigInteger;
import java.util.Vector;

public class PKCTExercise {
	 
	 void eeaResultExercise() {
		
		System.out.println("\nExercise 5:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 5a+b below this comment!
		 ************************************************************/
		
		EEAResult result=new EEAResult(new BigInteger("8002109"), new BigInteger("7186131"),new BigInteger("1"),new BigInteger("2996671").negate(),new BigInteger("3336940"));
		if(result.isRelativlyPrime())
		{
			System.out.println("both number a and b are relativelly prime !");
			System.out.println("And the multiplicative inverse is :"+result.getInverse());
		}
		else
			System.out.println("both number a and b are not relativelly prime so there is no relative inverse of a!");
	}

	void euclidExercise() {

		System.out.println("\nExercise 6:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 6b+c below this comment!
		 ************************************************************/
		
		/*****************************************************
		 *   6b
		 */
		System.out.println("\n Partie 6b:\n");
		BigInteger a1 = new BigInteger("7019544");
		BigInteger b1 = new BigInteger("8135112"); 
		
		EEAResult result=PublicKeyCryptoToolbox.extendedEuclideanAlgorithm(a1,b1);
		
		if(result.isRelativlyPrime())
		{
			System.out.println("both number a="+result.getA()+" and b="+result.getB()+" are relativelly prime !\n");
			System.out.println("And the multiplicative inverse is x="+ result.getInverse() +"\n x="+result.getX()+"\ny="+result.getY()+"\n");
		}
		else
			System.out.println("both number a="+result.getA()+" and b="+result.getB()+" are not relativelly prime so there is no relative inverse of a!\n");
		
		/***************************************************************************
		 *           6C
		 */
		System.out.println("\n Partie 6c:\n");
		BigInteger a2 = new BigInteger("7186131");		
		BigInteger b2 = new BigInteger("8002109");
		
		EEAResult result1=PublicKeyCryptoToolbox.extendedEuclideanAlgorithm(a2,b2);
		
		if(result1.isRelativlyPrime())
		{
			System.out.println("both number a="+result1.getA()+" and b="+result1.getB()+" are relativelly prime !\n");
			System.out.println("And the multiplicative inverse is x="+ result1.getInverse()+"\n x="+result1.getX()+"\ny="+result1.getY());
		}
		else
			System.out.println("both number a="+result1.getA()+" and b="+result1.getB()+" are not relativelly prime so there is no relative inverse of a!\n");
		
	}
	
	void modExpExercise() {
		System.out.println("\nExercise 7:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 7b+c below this comment!
		 ************************************************************/

		
	}
	
	void randomNumbers() {
		System.out.println("\nExercise 8:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 8c below this comment!
		 ************************************************************/
		PublicKeyCryptoToolbox pkc=new PublicKeyCryptoToolbox();
		BigInteger n=new BigInteger("102030405060708090");
		int i=20;
		while(i>0)
		{
			System.out.println("\n random "+(20-i+1)+"="+pkc.randomInteger(n));
			i--;
		}

	}

	void primalityTest() {
		System.out.println("\nExercise 9:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 9c+e below this comment!
		 ************************************************************/
		PublicKeyCryptoToolbox pkc=new PublicKeyCryptoToolbox();
		BigInteger a=new BigInteger("100");
		BigInteger n=new BigInteger("902857742149935096180418505174605673479122931367283811478172");
		System.out.println("Witness ? "+pkc.witness(a,n));

	}
	
	void run() {
		/*
		 * Uncomment the method after completion of the
                 * respective exercise!
		 */
		

		eeaResultExercise();
		euclidExercise();
		//modExpExercise();
		randomNumbers();
		primalityTest();
	}
	
	private static void cal(BigInteger b){
		System.out.print("\nBinary representation of " + b + ": ");
		for (int i=b.bitLength()-1; i>=0; i--) {
		if (b.testBit(i)==true) {
		System.out.print("1");
		} else {
		System.out.print("0");
		}
		}
		System.out.println("");
	}
	
	
	public static void main(String[] args) {

		PKCTExercise m = new PKCTExercise();
		m.run();
	}

}
