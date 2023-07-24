package Domen;

import Interfaces.iComplexCalc;

/**
 * Адаптер для класса ComplexCalc, реализующий интерфейс iComplexCalc.
 * Адаптер позволяет использовать ComplexCalc в качестве iComplexCalc.
 */
public class AdapterComplexCalc implements iComplexCalc {

    private ComplexCalc adapter;

    /**
     * Конструктор адаптера.
     *
     * @param adapter экземпляр класса ComplexCalc, который будет использоваться в качестве адаптируемого объекта.
     */
    public AdapterComplexCalc(ComplexCalc adapter) {
        this.adapter = adapter;
    }

    @Override
    public iComplexCalc sum(double argRe, double argIm) {
        adapter.sum(argRe, argIm);
        return this;
    }

    @Override
    public iComplexCalc multi(double argRe, double argIm) {
        adapter.multi(argRe, argIm);
        return this;
    }

    @Override
    public iComplexCalc divide(double argRe, double argIm) {
        adapter.divide(argRe, argIm);
        return this;
    }

    @Override
    public double getRe() {
        return adapter.getRe();
    }

    @Override
    public double getIm() {
        return adapter.getIm();
    }

    @Override
    public int getResult() {
        return adapter.getResult();
    }
}