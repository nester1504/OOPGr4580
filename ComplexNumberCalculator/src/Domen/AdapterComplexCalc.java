package Domen;

import Interfaces.iCalculator;
import Interfaces.iComplexCalc;

import Interfaces.iComplexCalc;

/**
 * Адаптер для класса ComplexCalc, реализующий интерфейс iComplexCalc.
 * Адаптер позволяет использовать ComplexCalc в качестве iComplexCalc.
 */
public class AdapterComplexCalc extends ComplexCalc implements iCalculator {



    public AdapterComplexCalc(double real, double imaginary) {
        super(real, imaginary);
    }

    @Override
    public iCalculator sum(int arg) {
        // Передаем текущие значения реальной и мнимой части
        // для выполнения операции сложения с целым аргументом arg.
        sum(arg, 0);
        return this;
    }

    @Override
    public iCalculator multi(int arg) {
        return null;
    }



}