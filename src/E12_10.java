public class E12_10 {
    public static void main(String[] args) throws NullDenominatorExeption {
        System.out.println(new Fraction(1,5));
        System.out.println(new Fraction(1,0));
        System.out.println(new Fraction(1525,5));
    }

    public static class Fraction {
        private int NUMERATOR = 0;
        private int DENOMINATOR = -1;

         Fraction(int numerator, int denominator) throws NullDenominatorExeption {
            try {
                if (denominator == 0) throw new NullDenominatorExeption();
            }
            catch (NullDenominatorExeption ex) {
                ex.printStackTrace();
            }
            this.NUMERATOR = NUMERATOR;
            this.DENOMINATOR = denominator;


        }
    }
}
/**(Fraction) Create a class Fraction with two integer final fields: numerator and denominator. Its constructor creates fractions when given values
 for both, but it has to avoid fractions with null denominators by throwing a
 NullDenominatorException of Programming Exercise 12.7.*/