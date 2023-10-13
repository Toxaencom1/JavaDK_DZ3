package calculator;

import java.text.DecimalFormat;

/**
 * Decorator. He decorates, that is, superimposes decorations on the result.
 * Appearance is important, which is why this class exists.
 */
public class outDecorator {
    /**
     * The function of decorating a number to be displayed in the console
     * in the form of a line with a preamble 'The result of your operation is:'
     *
     * @param res Floating-point number that requires decoration
     * @return Formatted String.
     */
    public static String decorate(double res) {
        DecimalFormat df = new DecimalFormat("#.###");
        String formattedResult = df.format(res);
        return String.format("Result your operation is: " + formattedResult);
    }
}
