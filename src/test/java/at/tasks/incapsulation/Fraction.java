package at.tasks.incapsulation;

public class Fraction {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным или нулевым");
        }

        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction sum(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sum(int number) {
        return this.sum(new Fraction(number, 1));
    }

    public Fraction minus(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction minus(int number) {
        return this.minus(new Fraction(number, 1));
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}