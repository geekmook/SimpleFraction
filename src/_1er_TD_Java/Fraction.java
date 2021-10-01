package _1er_TD_Java;

public class Fraction {
	private double numerateur;
	private double denominateur;
	
	public Fraction(double a, double b) {
		this.numerateur = a;
		this.denominateur = b;
	}
	public String toString() {
		return "Numerateur = "+this.numerateur+"\nDenominateur = "+this.denominateur;
	}
	
}
