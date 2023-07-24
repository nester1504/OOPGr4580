import Domen.AdapterComplexCalc;
import Domen.Calculator;
import Domen.ComplexCalc;
import Domen.ComplexCalculatorFactory;
import Interfaces.iComplexCalc;
import View.NewView;

/**
 * Главный класс программы, который запускает калькулятор комплексных чисел.
 */
public class Main {
    public static void main(String[] args) {

//        // Создание объекта ComplexCalc для выполнения вычислений с комплексными числами
//        Calculator calculator = new ComplexCalc(0.0, 0.0);
//
//        // Создание адаптера для калькулятора комплексных чисел,
//        // чтобы он соответствовал интерфейсу iComplexCalc
//        AdapterComplexCalc adapter = new AdapterComplexCalc(calculator);
//
//        // Создание объекта NewView, представляющего пользовательский интерфейс калькулятора
//        NewView view = new NewView(adapter);
//
//        // Запуск пользовательского интерфейса калькулятора комплексных чисел
//        view.run();

        ComplexCalculatorFactory factory = new ComplexCalculatorFactory();

        // Создаем калькулятор с помощью фабрики
        iComplexCalc calculator = factory.createComplexCalculator(0.0, 0.0);

        // Создаем View с созданным калькулятором
        NewView view = new NewView(calculator);
        view.run();

    }
}
