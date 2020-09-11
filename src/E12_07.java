public class E12_07 {
    public static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(0, 1);
            Fraction f2 = new Fraction(1, 5);
        }
        catch (NullDenominatorExeption ex) {
            System.out.println(ex.getStackTrace());
        }

    }
}
class Fraction {
    private int denominator;
    private int numerator;
    private int quotient;

    Fraction(int new_denominator, int new_numerator) throws NullDenominatorExeption {
        if (denominator == 0) throw new NullDenominatorExeption();
        else denominator = new_denominator;
                numerator = new_numerator;
    }
}

class NullDenominatorExeption extends Exception {
    NullDenominatorExeption() {
        System.out.println("The denominator cannot be zero.");
    }

}
