public class Complex implements Number {

    private double realpart, imagpart;

    public Complex(double realpart, double imaginarypart) {

	this.realpart = realpart;
	this.imagpart = imaginarypart;
    }

    public Complex add(Complex other) {
	
	return new Complex(realpart + other.realpart, imagpart + other.imagpart);
    }
    
    public String toString() {

	return (new Double(this.realpart)).toString() + "+" + (new Double(this.imagpart)).toString() + "i";

    }
    
}