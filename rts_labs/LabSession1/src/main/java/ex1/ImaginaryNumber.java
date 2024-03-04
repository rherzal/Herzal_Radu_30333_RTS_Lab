package ex1;

public class ImaginaryNumber {
    private double real;
    private double imaginary;


    public ImaginaryNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public ImaginaryNumber add(ImaginaryNumber n){
        return new ImaginaryNumber(this.getReal() + n.getReal(), this.getImaginary() + n.getImaginary());
    }

    public ImaginaryNumber substract(ImaginaryNumber n) {
        return new ImaginaryNumber(this.getReal() - n.getReal(), this.getImaginary() - n.getImaginary());
    }

    public ImaginaryNumber multiply(ImaginaryNumber n) {
        return new ImaginaryNumber(this.getReal() * n.getReal() - this.getImaginary() * n.getImaginary(), this.getReal() * n.getImaginary() + this.getImaginary() * n.getReal());
    }

    @Override
    public String toString() {
        String s = new String();
        s = Double.toString(this.getReal()) + " + " + Double.toString(this.getImaginary()) + "i";
        return s;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }
}
