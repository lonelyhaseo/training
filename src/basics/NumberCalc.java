package basics;

public class NumberCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is Starting");
		printName();
		int numA = 10;
		int numB =20;	
		addNumber(numA, numB);
		System.out.println(multiplyNumber(numA, numB));
	}
	
	static void printName(){
		System.out.println("My Name Is BLABLABLA");
	}
	
	static void addNumber(int A, int B){
		// This Function will add number
		int sum = A + B;
		System.out.println("he Sum of number " + A+" and "+B+" is "+sum);
	}
	
	
	static int multiplyNumber(int numA, int numB){
		int mult = numA * numB;
		return mult;
	}

}
