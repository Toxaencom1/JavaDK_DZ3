/*
3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
    а также переопределение метода toString(), возвращающее строковое представление пары.
 */
public class Pair<T,E> {
    T value1;
    E value2;

    public Pair(T value1, E value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getFirst() {
        return value1;
    }

    public E getSecond() {
        return value2;
    }

    @Override
    public String toString() {
        return "(" + value1 + ", " + value2 + ')';
    }
}
