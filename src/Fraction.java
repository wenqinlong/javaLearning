import java.util.Scanner;

class FractionOperation {
    int numerator;
    int denominator;

    FractionOperation(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    double toDouble() {
        return (double)this.numerator/this.denominator;
    }

    void print() {
        int temp;
        int a = this.numerator;
        int b = this.denominator;

        // Greatest common divisor
        while (b!=0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        this.numerator /= a;
        this.denominator /= a;
        if (this.denominator == 1) {
            System.out.println(this.numerator);
        }
        else {
            System.out.println(this.numerator + "/" + this.denominator);
        }
    }

    FractionOperation plus(FractionOperation f) {
        FractionOperation fc = new FractionOperation(numerator, denominator);
        fc.numerator = fc.numerator * f.denominator + fc.denominator * f.numerator;
        fc.denominator = fc.denominator * f.denominator;
        return fc;
    }

    FractionOperation multiply(FractionOperation f) {
        FractionOperation fc = new FractionOperation(numerator, denominator);
        fc.numerator = fc.numerator * f.numerator;
        fc.denominator = fc.denominator * f.denominator;
        return fc;
    }
}

public class Fraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FractionOperation a = new FractionOperation(in.nextInt(), in.nextInt());
        FractionOperation b = new FractionOperation(in.nextInt(), in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        double result;
        result = a.multiply(b).plus(new FractionOperation(5, 6)).toDouble();
        System.out.println(result);
        a.print();
        b.print();

        in.close();

    }

}



