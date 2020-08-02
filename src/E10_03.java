public class E10_03 {
    public static void main(String[] args) {

    }
}

class MyInteger {
    private int value;

    MyInteger(int new_value) {
        value = new_value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value < 2) return false;
        for (int i = 2; i * i <= value; i++) {
            if (value % i == 0) return false;
        }
        return true;
    }
public static boolean isEven(MyInteger test) {
    return test.isEven();
}
public boolean equals(int new_value) {
        return value == new_value;
}
public boolean equals(MyInteger test, int number)  {
        return test.getValue() == number;
}


}