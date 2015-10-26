package rsa;

import java.math.BigInteger;
import java.util.Vector;

public class RSAExercise {

	PublicKeyCryptoToolbox pkct = new PublicKeyCryptoToolbox();
	
	public void rsaParamsExercise() {
		
		System.out.println("\nExercise 10:");
		System.out.println("============\n");

		/************************************************************
		 * Use the following variables in your implementation!
		 ************************************************************/
		
		BigInteger p = BigInteger.ZERO;
		BigInteger q = BigInteger.ZERO;
		BigInteger n = BigInteger.ZERO;
		BigInteger phin = BigInteger.ZERO;
		BigInteger d = BigInteger.ZERO;;
		BigInteger e = BigInteger.ZERO;;
		
		int bit_length=128;
		int s=50;

		/************************************************************
		 * Insert the code of Exercise 10 below this comment!
		 ************************************************************/
		
				
		/************************************************************
		 * Do NOT change anyting below this line!
		 ************************************************************/
		
		System.out.println("BigInteger p = new BigInteger(\"" + p + "\");");
		System.out.println("BigInteger q = new BigInteger(\"" + q + "\");");
		System.out.println("BigInteger n = p.multiply(q);");
		System.out.println("BigInteger d = new BigInteger(\"" + d + "\");");
		System.out.println("BigInteger e = new BigInteger(\"" + e + "\");");
		System.out.println("Check: " + e.multiply(d).mod(phin));
	}
	
	public void rsaExercise() {
		System.out.println("\nExercise 11 and 12:");
		System.out.println("===================\n");

		/************************************************************
		 * Insert the code of Exercise 11c+d+e below this comment!
		 ************************************************************/
		

		/************************************************************
		 * Insert the code of Exercise 12c+d+e below this comment!
		 ************************************************************/

	}
	
	public void finalTestPreparation() {
		BigInteger p = new BigInteger("292634146651759944677438112396289238593");
		BigInteger q = new BigInteger("259951719401515993224438940898363904593");
		BigInteger n = p.multiply(q);
		BigInteger d = new BigInteger("19230821527409863624078497539913356864126656509482952467658625658635184671529");
		BigInteger e = new BigInteger("27475944712397552787445445104954180296036650677717137281603953463917489674521");

		BigInteger phin = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
		System.out.println("Check: " + e.multiply(d).mod(phin));

		
		RSAEncryptor rsaenc = new RSAEncryptor(n, e);
		RSADecryptor rsadec = new RSADecryptor(p, q, d);
		Vector<BigInteger> cipher;
		
		String plain = "Congratulations!\nYou have successfuly completed the programming exercise!!\nWell done!!!\n";
		
		cipher = rsaenc.encrypt(plain);
		
		String result = rsadec.decrypt(cipher);
		
		System.out.println(result+ "\n\n");
		
		System.out.println("Vector<BigInteger> cipher = new Vector<BigInteger>();\n");
		for (BigInteger i : cipher) {
			System.out.println("cipher.add(new BigInteger(\"" + i + "\"));");
		}
		
	}
	
	public void finalTest() {
		
		System.out.println("\nThe final test:");
		System.out.println("===============\n");
		
		BigInteger p = new BigInteger("292634146651759944677438112396289238593");
		BigInteger q = new BigInteger("259951719401515993224438940898363904593");
		BigInteger n = p.multiply(q);
		BigInteger d = new BigInteger("19230821527409863624078497539913356864126656509482952467658625658635184671529");
		BigInteger e = new BigInteger("27475944712397552787445445104954180296036650677717137281603953463917489674521");
		
		Vector<BigInteger> cipher = new Vector<BigInteger>();

		cipher.add(new BigInteger("14629346227596862423134514698856796162921320928472791311232414400674399390681"));
		cipher.add(new BigInteger("10445983349218311277626536358147031860002940669942458153492625290570929096809"));
		cipher.add(new BigInteger("75533276122278485923796944074726153505748851498182175821033127969158817468483"));
	
		RSADecryptor rsadec = new RSADecryptor(p, q, d);
		
		String message = rsadec.decrypt(cipher);
		
		System.out.println(message);
		
	}

	public void run() {		
	
		/*
		 * Uncomment the methods after the implementation
		 */
		//rsaParamsExercise();
		//rsaExercise();
		//finalTestPreparation();
		//finalTest();
	}
	
	
	public static void main(String[] args) {
		RSAExercise r = new RSAExercise();
		r.run();
	}
}
