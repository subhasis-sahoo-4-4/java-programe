class ComplexNumber {
    private double real;
    private double imaginary;

        public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

       public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

       public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
              ComplexNumber num1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber num2 = new ComplexNumber(1.5, 4.5);
        
                ComplexNumber sum = num1.add(num2);
        
               System.out.print("Sum: ");
        sum.display();
    }
}