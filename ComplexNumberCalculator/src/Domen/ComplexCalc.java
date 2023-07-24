package Domen;

import Interfaces.iComplexCalc;

/**
 * Класс комплексного калькулятора для работы с комплексными числами, реализующий интерфейс iComplexCalc.
 * Комплексный калькулятор выполняет операции сложения, умножения и деления с комплексными числами.
 */
public class ComplexCalc implements iComplexCalc {

    private double real;        // Действительная часть комплексного числа
    private double imaginary;   // Мнимая часть комплексного числа

    /**
     * Конструктор комплексного числа.
     *
     * @param real      действительная часть комплексного числа
     * @param imaginary мнимая часть комплексного числа
     */
    public ComplexCalc(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        this.real += argRe;
        this.imaginary += argIm;
        return this;
    }

    @Override
    public iComplexCalc multi(double argRe, double argIm) {
        double newReal = this.real * argRe - this.imaginary * argIm;
        double newImaginary = this.real * argIm + this.imaginary * argRe;
        this.real = newReal;
        this.imaginary = newImaginary;
        return this;
    }

    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        double denominator = argRe * argRe + argIm * argIm;
        double newReal = (this.real * argRe + this.imaginary * argIm) / denominator;
        double newImaginary = (this.imaginary * argRe - this.real * argIm) / denominator;
        this.real = newReal;
        this.imaginary = newImaginary;
        return this;
    }

    @Override
    public int getResult() {
        return (int) this.real;   // Возвращаем действительную часть комплексного числа в виде целого числа
    }

    @Override
    public double getRe() {
        return this.real;        // Возвращаем действительную часть комплексного числа
    }

    @Override
    public double getIm() {
        return this.imaginary;   // Возвращаем мнимую часть комплексного числа
    }

}