package calculator;
/*
1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract().
    Параметры этих методов – два числа разного типа (но необязательно разного между собой),
    над которыми должна быть произведена операция.
 */

/**
 * The `Calculator` class provides generic static methods for performing basic mathematical operations such as addition,
 * subtraction, multiplication, and division on two numbers of different types.
 * This class is part of the 'calculator' package and is designed to work with numbers of various types using generics.
 * It includes methods to perform mathematical operations on the provided input numbers.
 */
public class Calculator {
    /**
     * Computes the sum of two numbers.
     *
     * @param a   The first number.
     * @param b   The second number.
     * @param <T> The generic type of the numbers.
     * @return The sum of the two numbers as a double.
     */
    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    /**
     * Computes the product of two numbers.
     *
     * @param a   The first number.
     * @param b   The second number.
     * @param <T> The generic type of the numbers.
     * @return The product of the two numbers as a double.
     */
    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    /**
     * Computes the result of dividing one number by another.
     *
     * @param a   The dividend (numerator).
     * @param b   The divisor (denominator).
     * @param <T> The generic type of the numbers.
     * @return The result of the division as a double.
     * @throws NullPointerException If the divisor is zero, which would result in division by zero.
     */
    public static <T extends Number> double divide(T a, T b) throws NullPointerException {
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
     * @return The result of the subtraction as a double.
     */
    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

}
