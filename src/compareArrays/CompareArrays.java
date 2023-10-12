package compareArrays;
/*
2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
    если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
    но должны иметь одинаковую длину и содержать элементы одного типа.
 */

public class CompareArrays {
    public static <T,E> boolean compareArrays(T[] first, E[] second) throws NullPointerException {
        if (first == null || second==null){
            throw new NullPointerException();
        }
        if (first.length != second.length) {
            return false;
        }
        return first.getClass().equals(second.getClass());
    }
}
