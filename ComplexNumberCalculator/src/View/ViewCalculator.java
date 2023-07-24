package View;

import Interfaces.iCalculator;
import Interfaces.iViewCalc;

import java.util.Scanner;

/**
 * Класс представления (View) для калькулятора.
 * Реализует пользовательский интерфейс для взаимодействия с калькулятором.
 */
public class ViewCalculator implements iViewCalc {

    private iCalculator calculator;

    /**
     * Конструктор класса ViewCalculator.
     * @param calculator калькулятор, который будет использоваться для вычислений.
     */
    public ViewCalculator(iCalculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Запускает пользовательский интерфейс калькулятора.
     * В этом методе реализован цикл, который позволяет пользователю вводить команды и получать результаты вычислений.
     */
    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите первый аргумент: ");
            calculator.sum(primaryArg);

            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите второй аргумент: ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }

            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}