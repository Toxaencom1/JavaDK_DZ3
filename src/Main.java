/*
    1. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
    sum(), multiply(), divide(), subtract().
    Параметры этих методов – два числа разного типа (но необязательно разного между собой),
    над которыми должна быть произведена операция.
    2. Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
    если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
    но должны иметь одинаковую длину и содержать элементы одного типа.
    3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
    Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих пары,
    а также переопределение метода toString(), возвращающее строковое представление пары.
 */

import calculator.Calculator;
import calculator.Calculator2;
import calculator.outDecorator;
import compareArrays.CompareArrays;

/**
 * The `Main` class demonstrates the functionality of the Calculator, CompareArrays, and Pair classes.
 * This class contains the `main` method and demonstrates the use of these classes and their methods.
 */
public class Main {
    public static void main(String[] args) {
        //region Task 1: Calculator
        System.out.println("=Task=№1=Calculator=================");
        try {
            double sumResult = Calculator.sum(2, 3.14f);
            double subtractResult = Calculator.subtract(0.5f, 2L);
            double multiplyResult = Calculator.multiply(2.7, 3L);
            double divideResult = Calculator.divide(2.125f, 0.5);
            System.out.println(outDecorator.decorate(sumResult));
            System.out.println(outDecorator.decorate(subtractResult));
            System.out.println(outDecorator.decorate(multiplyResult));
            System.out.println(outDecorator.decorate(divideResult));
            System.out.println("----------------");
            double sumResult2 = Calculator2.sum(2, 3.14f);
            double subtractResult2 = Calculator2.subtract(0.5f, 2L);
            double multiplyResult2 = Calculator2.multiply(2.7, 3L);
            double divideResult2 = Calculator2.divide(2.125f, 0.5);
            System.out.println(outDecorator.decorate(sumResult2));
            System.out.println(outDecorator.decorate(subtractResult2));
            System.out.println(outDecorator.decorate(multiplyResult2));
            System.out.println(outDecorator.decorate(divideResult2));
            double divideResult3 = Calculator.divide(25L, 0); // divide by zero Exception
            double divideResult4 = Calculator2.divide(25L, 0); // divide by zero Exception
        } catch (ArithmeticException e) {
            System.out.println("Can`t divide by zero");
        } finally {
            System.out.println("====================================");
        }
        //endregion
        //region Task 2: compareArrays()
        System.out.println("\n=Task=№2=compareArrays()============");
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {3, 2, 1};
        String[] arr3 = {"apple", "banana", "cherry"};
        Double[] arr4 = {3.0, 2.5, 1.5};
        Integer[] arr5 = {3, 2, 1, 4};
        Long[] arr6 = {2L, 1L, 3L};
        Object[] objArray = {"1",2,3.14};
        Object[] objArray2 = {"3",4,10.5};
        Object[] objArray3 = {"1","2","3"};
        Object[] objArray4 = {"3","4",1};
        System.out.println("int vs int size = size: " + CompareArrays.compareArrays(arr1, arr2));
        System.out.println("int vs String: " + CompareArrays.compareArrays(arr1, arr3));
        System.out.println("int vs double: " + CompareArrays.compareArrays(arr1, arr4));
        System.out.println("int vs int size != size: " + CompareArrays.compareArrays(arr1, arr5));
        System.out.println("int vs long: " + CompareArrays.compareArrays(arr1, arr6));
        System.out.println("Method 2: Obj vs Obj: " + CompareArrays.compareArrays2(objArray, objArray2));
        System.out.println("Method 3: Obj vs Obj: " + CompareArrays.compareArrays3(objArray3, objArray4));
        System.out.println("====================================");
        //endregion
        //region Task 3: Class Pair
        System.out.println("\n=Task=№3=Class_Pair=================");
        Pair<Integer, String> pair = new Pair<>(1, "second");
        Pair<Long, Float> pair2 = new Pair<>(1L, 25.4f);
        System.out.println("getFirst() method returns: " + pair.getFirst()
                + ", Type is: " + pair.getFirst().getClass().getTypeName());
        System.out.println("getSecond() method returns: " + pair.getSecond()
                + ", Type is: " + pair.getSecond().getClass().getTypeName());
        System.out.println(pair);
        System.out.println(pair2);
        System.out.println("====================================");
        //endregion
    }
}

















