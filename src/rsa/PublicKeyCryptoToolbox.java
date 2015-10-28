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
		
		// Remove this line!
		return new BigInteger("0");
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
			} while(r.compareTo(n)>=0||r.compareTo(BigInteger.ONE)<0);
		}
		return r;
	}

	public boolean witness(BigInteger a, BigInteger n) {

		/************************************************************
		 * Insert the code of Exercise 9a below this comment!
		 ************************************************************/
		
		if(n.compareTo(new BigInteger("2"))>0 &&a.compareTo(n.subtract(BigInteger.ONE))<=0&&a.compareTo(BigInteger.ONE)>=0){
			
		}
		EEAResult result= extendedEuclideanAlgorithm(a,n);
		if(result.isRelativlyPrime())
			return true;
		else
			return false;
	}

	public boolean millerRabinTest(BigInteger n, int s) {

		/************************************************************
		 * Insert the code of Exercise 9b below this comment!
		 ************************************************************/
		
		// Remove this line!
		return false;
	}

	public BigInteger randomPrime(int bit_length, int s) {

		/************************************************************
		 * Insert the code of Exercise 9d below this comment!
		 ************************************************************/
		
		// Remove this line!
		return new BigInteger("0");
	}

}
