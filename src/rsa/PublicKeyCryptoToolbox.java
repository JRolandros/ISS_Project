package rsa;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Vector;

public class PublicKeyCryptoToolbox {
	// / Secure pseudo random number generator
	SecureRandom prng;

	public PublicKeyCryptoToolbox() {
		// Create a new prng instance
		prng = new SecureRandom();
	}

	public static EEAResult extendedEuclideanAlgorithm(BigInteger a, BigInteger b) {

		/************************************************************
		 * Insert the code of Exercise 6a below this comment!
		 ************************************************************/
		EEAResult result;
		EEAResult result1;
		 BigInteger q=null;
		 BigInteger temp=null;
		 if(b.compareTo(BigInteger.ZERO)==0)
			{
			  result=new EEAResult(a, b ,a, BigInteger.ONE, BigInteger.ZERO);
			}
		 else
			{
			 	q=a.divide(b);
			 	
			 	result=extendedEuclideanAlgorithm(b,a.mod(b));
			 	
				temp=result.getX().subtract( (q.multiply( result.getY() ) ) );
				result.setX(result.getY());
				result.setY(temp);
				
			}
		 result1=new EEAResult(a, b ,result.getD(),result.getX() , result.getY());
		 return result1;
	}

	static public BigInteger modExp(BigInteger a, BigInteger b, BigInteger m) {

		/************************************************************
		 * Insert the code of Exercise 7a below this comment!
		 ************************************************************/
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
		return d;
	}

	public BigInteger randomInteger(int bit_length) {

		/************************************************************
		 * Insert the code of Exercise 7a below this comment!
		 ************************************************************/
		
		return new BigInteger(bit_length,prng);

	}

	public BigInteger randomInteger(BigInteger n) {

		/************************************************************
		 * Insert the code of Exercise 8a below this comment!
		 ************************************************************/
		BigInteger r=null;
		if(n.compareTo(new BigInteger("2"))>0)
		{
			do{
				r=randomInteger(n.bitLength());
			} while(r.compareTo(n)>0||r.compareTo(BigInteger.ONE)<0);
		}
		return r;
	}

	public boolean witness(BigInteger a, BigInteger n) {

		/************************************************************
		 * Insert the code of Exercise 9a below this comment!
		 ************************************************************/
		BigInteger oldModulo=BigInteger.ONE;
		BigInteger modulo=BigInteger.ONE;
		
			BigInteger n_1=n.subtract(BigInteger.ONE); //b=n-1
			for(int i=n_1.bitLength();i>=0;i--){
				oldModulo=modulo;
				modulo=(modulo.multiply(modulo)).mod(n);
				if( (modulo.compareTo(BigInteger.ONE)==0)&&(oldModulo.compareTo(BigInteger.ONE)!=0)&&(oldModulo.compareTo(n_1)!=0))
					return true;
				if(n_1.testBit(i)==true)
					modulo=(modulo.multiply(a)).mod(n);							
			}
			if(modulo.compareTo(BigInteger.ONE)!=0)
				return true;
			
		return false;
	}

	public boolean millerRabinTest(BigInteger n, int s) {

		/************************************************************
		 * Insert the code of Exercise 9b below this comment!s
		 ************************************************************/
		BigInteger randNum=BigInteger.ONE;//initialize randNum=1 no matter  for that value in the following
		boolean result = false;
		for(int i=1;i<=s;i++){
			randNum= randomInteger(n);
			result = witness(randNum, n);
			if(result)
				return !result;
		}
		return !result;
	}

	public BigInteger randomPrime(int bit_length, int s) {

		/************************************************************
		 * Insert the code of Exercise 9d below this comment!
		 ************************************************************/
		BigInteger randN=randomInteger(bit_length);
		while(!millerRabinTest(randN, s)){
			randN=randomInteger(bit_length);				
		}
		
		return randN;
	}
/*
	public static void main(String[] args) {

	
		BigInteger a= new BigInteger("17");
		BigInteger b= new BigInteger("1005");
		BigInteger c= new BigInteger("230");
		System.out.println("the result :" +modExp(a, b, c));
		BigInteger r=a.modPow(b, c);
		System.out.println(r);	
		
	}
*/
}
