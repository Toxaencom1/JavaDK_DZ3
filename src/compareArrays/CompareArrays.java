package compareArrays;
/*
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
    если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
    но должны иметь одинаковую длину и содержать элементы одного типа.
 */

/**
 * The `CompareArrays` class provides a generic method for comparing two arrays to determine if they are identical.
 * This class allows you to compare two arrays of any data type,
 * as long as they have the same length and contain elements of the same type.
 * The `compareArrays()` method returns true if the two arrays are identical, and false otherwise.
 */
public class CompareArrays {
    /**
     * Compares two arrays to check if they size and element type are identical.
     *
     * @param first  The first array for comparison.
     * @param second The second array for comparison.
     * @param <T>    The generic type of the elements in the first array.
     * @param <E>    The generic type of the elements in the second array.
     * @return true if the arrays are identical; false otherwise.
     * @throws NullPointerException If either of the input arrays is null.
     */
    public static <T, E> boolean compareArrays(T[] first, E[] second) throws NullPointerException {
        if (first == null || second == null) {
            throw new NullPointerException();
        }
        if (first.length != second.length) {
            return false;
        }
        return first.getClass().equals(second.getClass());
    }
}
