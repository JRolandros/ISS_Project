package rsa;

import java.math.BigInteger;

public class EEAResult {
	/// Integer a
	private BigInteger a;
	/// Integer b
	private BigInteger b;
	/// Greatest common divisor of a and b
	private BigInteger d;
	/// Values of the linear combination of gcd(a,b)
	private BigInteger x;
	private BigInteger y;
	
	/// Constructor
	public EEAResult(BigInteger a, BigInteger b, BigInteger d, BigInteger x, BigInteger y) {
		this.a = a;
		this.b = b;
		this.d = d;
		this.x = x;
		this.y = y;
	}
		
	/*
	 * Getters.
	 */
	public BigInteger getA() {
		return a;
	}
	public BigInteger getB() {
		return b;
	}
	public BigInteger getD() {
		return d;
	}
	public BigInteger getX() {
		return x;
	}
	public BigInteger getY() {
		return y;
	}
	
	/*
	 * Setters.
	 */
	public void setA(BigInteger a) {
		this.a = a;
	}
	public void setB(BigInteger b) {
		this.b = b;
	}
	public void setX(BigInteger x) {
		this.x = x;
	}
	public void setY(BigInteger y) {
		this.y = y;
	}
	
	/**
	 *  Returns true, iff a is relatively prime to b, this is
	 *  gcd(a,b) = 1.
	 */
	public boolean isRelativlyPrime() {
		
		/************************************************************
		 * Insert the code of Exercise 5a below this comment!
		 ************************************************************/
		
		return (d.compareTo(BigInteger.ONE)==0);
	}
	
	/**
	 * Returns the inverse of a modulo b.
	 * 
	 * Note: this value is only correct, iff gcd(a,b) equals 1.
	 */
	public BigInteger getInverse() {

		/************************************************************
		 * Insert the code of Exercise 5b below this comment!
		 ************************************************************/

		return x.mod(b);

	}
	
}
