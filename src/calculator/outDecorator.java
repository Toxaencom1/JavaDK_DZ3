package calculator;

import java.text.DecimalFormat;

/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */
public class outDecorator {
    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки с преамбулой 'Результат вашей операции это: '
     *
     * @param res число с плавающей точкой, требующее декорации
     * @return Отформатированная строка.
     */
    public static String decorate(double res){
        DecimalFormat df = new DecimalFormat("#.###");
        String formattedResult = df.format(res);
        return String.format("Result your operation is: " + formattedResult);
    }
}
