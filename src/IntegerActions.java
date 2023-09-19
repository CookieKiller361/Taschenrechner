public class IntegerActions {
    private int ergebnis;

    public void add(int firstNumber, int secondNumber) {
        this.ergebnis = firstNumber + secondNumber;
    }

    public void sub(int firstNumber, int secondNumber) {
        this.ergebnis = firstNumber - secondNumber;
    }

    public void multiply(int firstNumber, int secondNumber) {
        this.ergebnis = firstNumber * secondNumber;
    }

    public void div(int firstNumber, int secondNumber) {
        this.ergebnis = firstNumber / secondNumber;
    }

    public void power(int basis, int exponent) {
        int result = 0;

        if (exponent == 0) {
            result = 1;
        } else if (exponent == 1) {
            result = basis;
        } else {
            for (int i = 0; i <= exponent; i++) {
                if (i == 2) {
                    result = basis;
                }
                result *= basis;
            }
        }
        this.ergebnis = result;

    }

    @Override
    public String toString() {
        return String.valueOf(ergebnis);
    }
}
