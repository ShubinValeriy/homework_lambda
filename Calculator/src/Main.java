public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        int c = calculator.devide.apply(a, b); // Происходит деление на ноль
        calculator.println.accept(c);
    }
}
