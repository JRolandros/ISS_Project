package rsa;

import java.math.BigInteger;
import java.util.Vector;

public class PKCTExercise {
	
	 private EEAResult EEA(BigInteger a,BigInteger b){
		 EEAResult result;
		 BigInteger q=null;
		 BigInteger temp=null;
		 BigInteger bigInt0=new BigInteger("0");
		 if(b.compareTo(bigInt0)==0)
			{
			 result=new EEAResult(a, b ,a, new BigInteger("1"), new BigInteger("0"));
			 //System.out.println(" first step:\nD="+result.getD()+"\nX="+result.getX()+"\nY="+result.getY());
			}
		 else
			{
			 	q=a.divide(b);
			 	result=EEA(b,a.mod(b));
			 	temp=result.getX().subtract( (q.multiply( result.getY() ) ) );
				result.setX(result.getY());
				result.setY(temp);	
				//System.out.println("D="+result.getD()+"\nX="+result.getX()+"\nY="+result.getY());
			}
		 		 
		 return result;
	 }
	 
	 void eeaResultExercise(BigInteger a,BigInteger b) {
		
		System.out.println("\nExercise 5:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 5a+b below this comment!
		 ************************************************************/
		//first party
		EEAResult eeaResult=EEA(a,b);	
		System.out.println("D="+eeaResult.getD()+"\nX="+eeaResult.getX()+"\nY="+eeaResult.getY()+"\n a-1="+eeaResult.getX().mod(b));
	}

	void euclidExercise() {

		System.out.println("\nExercise 6:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 6b+c below this comment!
		 ************************************************************/
		
	}
	
	void modExpExercise() {
		System.out.println("\nExercise 7:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 6b+c below this comment!
		 ************************************************************/

		
	}
	
	void randomNumbers() {
		System.out.println("\nExercise 8:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 8c below this comment!
		 ************************************************************/

	}

	void primalityTest() {
		System.out.println("\nExercise 9:");
		System.out.println("===========\n");

		/************************************************************
		 * Insert the code of Exercise 9c+e below this comment!
		 ************************************************************/

	}
	
	void run() {
		/*
		 * Uncomment the method after completion of the
                 * respective exercise!
		 */
		BigInteger a = new BigInteger("8002109");
		BigInteger b = new BigInteger("7186131");

		eeaResultExercise(a,b);
		//euclidExercise();
		//modExpExercise();
		//randomNumbers();
		//primalityTest();
	}
	
	public static void main(String[] args) {

		PKCTExercise m = new PKCTExercise();
		m.run();
	}

}
