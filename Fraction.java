

public class Fraction {
	private int numerator;
	private int denominator;
	private int newNumerator;
	private int newDenominator;
	
	Fraction (){
		this.numerator = 2;
		this.denominator = 3;
	}
	Fraction(int numerator ,int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	void setNumerator  (int numerator){
		this.numerator = numerator;
	}
	void setDenominator  (int denominator){
		this.denominator = denominator;
	}
	int getNumerator() {
		return this.numerator;
	}
	int getDenominator() {
		return this.denominator;
	}
	
	void ratio() {
		int count = 2;
		while (count <= numerator && count <= denominator) {
			if(numerator % count == 0 && denominator % count == 0) {
				numerator = numerator / count;
				denominator = denominator / count;
			}
			else {
				count++;
			}
		}
		System.out.println("Ratio of two integers are  " + numerator + " : " +denominator);
	}
	void display() {
		System.out.println("Numerator : " + this.numerator + " Denominator : " + this.denominator);
	}
	public boolean equals(int newNumerator ,int newDenominator ) {
		this.newNumerator = newNumerator;
		this.newDenominator = newDenominator;
		

		if(this.numerator == newNumerator && this.denominator == newDenominator) {
			System.out.println("Both fractions are identical");
			return true;
		}
		else {
			System.out.println("Fractions are not identical");
			return false;
		}
	}
	
	
	
	
	
}
