public class Calculator {

    // To make a constructor available, but no arguments necessary
    public Calculator() {
    };

    public int add(int firstNumber, int secondNumber) {
        int ans = firstNumber + secondNumber;
        return ans;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int ans = firstNumber - secondNumber;
        return ans;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int ans = firstNumber * secondNumber;
        return ans;
    }

    public double divide(double firstNumber, double secondNumber) {
        double ans = firstNumber / secondNumber;
        return ans;
    }
}
