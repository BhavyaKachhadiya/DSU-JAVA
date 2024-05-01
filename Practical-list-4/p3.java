class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

public class p3 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static int divide(int numerator, int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Division by zero error!");
        }
        return numerator / denominator;
    }
}
