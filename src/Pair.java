/*
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
    а также переопределение метода toString(), возвращающее строковое представление пары.
 */

/**
 * The `Pair` class is a generic class representing a pair of values of different types.
 * This class allows you to create a pair of two values,
 * where the types of the values are specified as generic type parameters.
 * It provides methods to retrieve the first and second values of the pair and overrides the `toString()` method
 * to return a string representation of the pair.
 */
public class Pair<T, E> {
    T value1;
    E value2;

    /**
     * Constructs a new `Pair` with the specified values.
     *
     * @param value1 The first value of the pair.
     * @param value2 The second value of the pair.
     */
    public Pair(T value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * Retrieves the first value of the pair.
     *
     * @return The first value of the pair.
     */
    public T getFirst() {
        return value1;
    }

    /**
     * Retrieves the second value of the pair.
     *
     * @return The second value of the pair.
     */
    public E getSecond() {
        return value2;
    }

    /**
     * Returns a string representation of the pair in the format "(value1, value2)".
     *
     * @return A string representing the pair.
     */
    @Override
    public String toString() {
        return "(" + value1 + ", " + value2 + ')';
    }
}
