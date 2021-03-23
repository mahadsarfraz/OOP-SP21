
public class Runner {
	public static void main(String[] args) {
		Fraction fr = new Fraction(12,24);
		fr.display();
		fr.ratio();
		fr.equals(12,18);
		
		
		Fraction fr2 = new Fraction(5,20);
		fr2.display();
		fr2.ratio();
		fr2.equals(5,15);
		
		Fraction fr3 = new Fraction(3,7);
		fr3.display();
		fr3.ratio();
		fr3.equals(3,7);
	}
}
