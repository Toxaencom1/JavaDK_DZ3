package calculator;

public class Calculator2 {
    /**
     * Computes the sum of two numbers.
     *
     * @param a   The first number.
     * @param b   The second number.
     * @param <T> The generic type of the numbers.
     * @param <E> The generic type of the numbers.
     * @return The sum of the two numbers as a double.
     */
    public static <T extends Number, E extends Number> double sum(T a, E b) {
        return a.doubleValue() + b.doubleValue();
    }

    /**
     * Computes the product of two numbers.
     *
     * @param a   The first number.
     * @param b   The second number.
     * @param <T> The generic type of the numbers.
     * @param <E> The generic type of the numbers.
     * @return The product of the two numbers as a double.
     */
    public static <T extends Number, E extends Number> double multiply(T a, E b) {
        return a.doubleValue() * b.doubleValue();
    }

    /**
     * Computes the result of dividing one number by another.
     *
     * @param a   The dividend (numerator).
     * @param b   The divisor (denominator).
     * @param <T> The generic type of the numbers.
     * @param <E> The generic type of the numbers.
     * @return The result of the division as a double.
     * @throws NullPointerException If the divisor is zero, which would result in division by zero.
     */
    public static <T extends Number, E extends Number> double divide(T a, E b) throws NullPointerException {
        if (b.doubleValue() == 0.0) { // in 'if' block can be 'equals' - same result
            throw new ArithmeticException();
        }
        return a.doubleValue() / b.doubleValue();
    }

    /**
     * Computes the result of subtracting one number from another.
     *
     * @param a   The number from which to subtract.
     * @param b   The number to subtract.
     * @param <T> The generic type of the numbers.
     * @param <E> The generic type of the numbers.
     * @return The result of the subtraction as a double.
     */
    public static <T extends Number, E extends Number> double subtract(T a, E b) {
        return a.doubleValue() - b.doubleValue();
    }
}
