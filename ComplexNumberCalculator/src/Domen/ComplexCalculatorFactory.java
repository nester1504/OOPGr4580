package Domen;

import Interfaces.iComplexCalc;
import Interfaces.iComplexCalculatorFactory;

public class ComplexCalculatorFactory implements iComplexCalculatorFactory {
    @Override
    public iComplexCalc createComplexCalculator(double real, double imaginary) {
        return new ComplexCalc(real, imaginary);
    }
}