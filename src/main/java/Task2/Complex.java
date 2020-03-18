package Task2;

class Complex {
    private int real;
    private int imaginary;

    public int getReal() { return real; }
    public void setReal(int real) {this.real = real; }
    public int getImaginary() { return imaginary; }
    public void setImaginary(int imaginary) {this.imaginary = imaginary;}

    public Complex (int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex (Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }
    public Complex(){
        this(0 , 0);
    }
    public void showNumber() {
        if (imaginary == 0)
            System.out.println(String.format("%d", real));
        else if (imaginary > 0)
            System.out.println(String.format("%d + i * %d", real, imaginary));
        else
            System.out.println(String.format("%d - i * %d", real, (-1) * imaginary));
    }
    public void addWithComplex(Complex complex) {
        this.real += complex.real;
        this.imaginary += complex.imaginary;
    }

}

class Main{
    public static void main(String[] args) {
        Complex complex1 = new Complex(5,5);
        complex1.showNumber();

        Complex complex2 = new Complex(1,3);
        complex2.showNumber();

        complex1.addWithComplex(complex2);
        complex1.showNumber();

        complex1.addWithComplex(new Complex());
        complex1.showNumber();
    }

}

