import Domen.AdapterComplexCalc;
import Domen.ComplexCalc;
import View.NewView;

/**
 * Главный класс программы, который запускает калькулятор комплексных чисел.
 */
public class Main {
    public static void main(String[] args) {

        // Создание объекта ComplexCalc для выполнения вычислений с комплексными числами
        ComplexCalc calculator = new ComplexCalc(0.0, 0.0);

        // Создание адаптера для калькулятора комплексных чисел,
        // чтобы он соответствовал интерфейсу iComplexCalc
        AdapterComplexCalc adapter = new AdapterComplexCalc(calculator);

        // Создание объекта NewView, представляющего пользовательский интерфейс калькулятора
        NewView view = new NewView(adapter);

        // Запуск пользовательского интерфейса калькулятора комплексных чисел
        view.run();

    }
}
