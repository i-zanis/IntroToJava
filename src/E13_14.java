public class E13_14 {
    public static void main(String[] args) {

    }
    class Rational extends Number implements Comparable<Rational> {
private Long[] r = new Long[2];

public Rational(long numerator, long denominator) {
    r[0] = numerator;
    if (numerator == 0) throw new ArithmeticException("The number can't be zero");
    r[1] = denominator;
}
        @Override
        public int compareTo(Rational o) {
            return 0;
        }

        @Override
        public int intValue() {
            return 0;
        }

        @Override
        public long longValue() {
            return 0;
        }

        @Override
        public float floatValue() {
            return 0;
        }

        @Override
        public double doubleValue() {
            return 0;
        }
    }
}
/**(Demonstrate the benefits of encapsulation) Rewrite the Rational class
 in Listing 13.13 using a new internal representation for the numerator and
 denominator. Create an array of two integers as follows:
 private long[] r = new long[2];
 Use r[0] to represent the numerator and r[1] to represent the denominator.
 The signatures of the methods in the Rational class are not changed, so a client
 application that uses the previous Rational class can continue to use this new
 Rational class without being recompiled*/