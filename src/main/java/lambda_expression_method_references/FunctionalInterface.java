package lambda_expression_method_references;

public class FunctionalInterface {
    private static int addition(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        // Method references.
        Calculator calculatorFunc = FunctionalInterface::addition;
        int addFunc = calculatorFunc.calculate(a, b);

        // Lambda expression. => create an instance of the Calculator Interface.
        Calculator calculatorLambda = (c, d) -> c + d;
        int addLambda = calculatorLambda.calculate(a, b);

        System.out.println(addFunc + " " + addLambda);
    }
}
