package rsa;

import java.math.BigInteger;
import java.util.Vector;

public class PKCTExercise {
	 
	 void eeaResultExercise() {
		
		System.out.println("\nExercise 5:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 5c below this comment!
		 ************************************************************/
		
		EEAResult result=new EEAResult(new BigInteger("8002109"), new BigInteger("7186131"),new BigInteger("1"),new BigInteger("2996671").negate(),new BigInteger("3336940"));
		if(result.isRelativlyPrime())
		{
			System.out.println("\nboth number a=8002109 and b=7186131 are relativelly prime ! ");
			System.out.println("And the multiplicative inverse is :"+result.getInverse()+"\n");
		}
		else
			System.out.println("\nboth number a=8002109 and b=7186131 are not relativelly prime so there is no relative inverse of a!\n");
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
			System.out.println("\nboth number a="+result.getA()+" and b="+result.getB()+" are relativelly prime ! ");
			System.out.println("And the multiplicative inverse is x="+ result.getInverse() +"\n x="+result.getX()+"\ny="+result.getY()+"\n");
		}
		else
			System.out.println("\nboth number a="+result.getA()+" and b="+result.getB()+" are not relativelly prime so there is no relative inverse of a!\n");
		
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
		BigInteger a= new BigInteger("17");
		BigInteger b= new BigInteger("1005");
		BigInteger m= new BigInteger("230");
		BigInteger c=BigInteger.ONE;		
		BigInteger d= new BigInteger("1");		
		
		for (int i = b.bitLength(); i>=0; i--){
			 c=c.add(c);
			 d=(d.multiply(d)).mod(m);
			if(b.testBit(i)==true){
			c=c.add(BigInteger.ONE);	
			d=(d.multiply(a)).mod(m);	
		  }
		}
		
		
		System.out.println("the result with modular exponentiation is: "+d);
		BigInteger r=a.modPow(b, m);
		System.out.println("the result with method modPow() is: "+r);
		
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
		
		System.out.println("\nExercise 9c:\n");
		
		BigInteger n1=new BigInteger("343232674978653231166402657365997144371953839307928119227511");
		BigInteger n2=new BigInteger("667984267564412673929015509827448340743034959781814076053617");
		BigInteger n3=new BigInteger("902857742149935096180418505174605673479122931367283811478172");
		
		// here are some tests of your results
		System.out.println("n1 is Witness ? "+pkc.millerRabinTest(n2, 100));
		System.out.println("n2 is Witness ? "+pkc.millerRabinTest(n2, 100));
		System.out.println("n3 is Witness ? "+pkc.millerRabinTest(n2, 100));
		
		System.out.println("\nExercise 9e:\n");
		
		System.out.println("random integer 128 bit length: "+pkc.randomPrime(128, 100));
		System.out.println("random integer 256 bit length: "+pkc.randomPrime(256, 100));
		System.out.println("random integer 1024 bit length: "+pkc.randomPrime(1024, 100));
		
	}
	
	void run() {
		/*
		 * Uncomment the method after completion of the
                 * respective exercise!
		 */
		
		eeaResultExercise();
		euclidExercise();
		modExpExercise();
		randomNumbers();
		primalityTest();
	}
	
	
	public static void main(String[] args) {

		PKCTExercise m = new PKCTExercise();
		m.run();
	}

}
