package View;

import Interfaces.iComplexCalc;
import Interfaces.iViewCalc;

import java.util.Scanner;

/**
 * Класс представления (View) для калькулятора комплексных чисел.
 * Реализует пользовательский интерфейс для взаимодействия с калькулятором комплексных чисел.
 */
public class NewView implements iViewCalc {

    private iComplexCalc calculator;

    /**
     * Конструктор класса NewView.
     * @param calculator калькулятор комплексных чисел, который будет использоваться для вычислений.
     */
    public NewView(iComplexCalc calculator) {
        this.calculator = calculator;
    }

    /**
     * Запускает пользовательский интерфейс калькулятора комплексных чисел.
     * В этом методе реализован цикл, который позволяет пользователю вводить команды и получать результаты вычислений.
     */
    @Override
    public void run() {
        while (true) {
            double primaryArgRe = promptDouble("Введите действительную часть первого аргумента: ");
            double primaryArgIm = promptDouble("Введите мнимую часть первого аргумента: ");
            calculator = calculator.sum(primaryArgRe, primaryArgIm);

            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    double argRe = promptDouble("Введите действительную часть второго аргумента: ");
                    double argIm = promptDouble("Введите мнимую часть второго аргумента: ");
                    calculator = calculator.multi(argRe, argIm);
                    continue;
                }
                if (cmd.equals("+")) {
                    double argRe = promptDouble("Введите действительную часть второго аргумента: ");
                    double argIm = promptDouble("Введите мнимую часть второго аргумента: ");
                    calculator = calculator.sum(argRe, argIm);
                    continue;
                }

                if (cmd.equals("/")) {
                    double resultRe = calculator.getRe();
                    double resultIm = calculator.getIm();
                    System.out.printf("Результат: %.2f + %.2fi\n", resultRe, resultIm);
                    break;
                }

                if (cmd.equals("=")) {
                    double resultRe = calculator.getRe();
                    double resultIm = calculator.getIm();
                    System.out.printf("Результат: %.2f + %.2fi\n", resultRe, resultIm);
                    break;
                }
            }

            String cmd = prompt("Еще посчитать (Y/N)?");
            if (!cmd.equalsIgnoreCase("Y")) {
                break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}