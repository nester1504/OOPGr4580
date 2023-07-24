package Domen;

import Interfaces.iCalculator;

/**
 * Класс калькулятора для работы с целыми числами, реализующий интерфейс iCalculator.
 * Калькулятор может выполнять операции сложения и умножения с заданным первичным аргументом.
 */
public final class Calculator implements iCalculator {

    private int primaryArg;

    /**
     * Конструктор калькулятора.
     *
     * @param primaryArg первичный аргумент, с которым будут выполняться операции.
     */
    public Calculator(int primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculator sum(int arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public iCalculator multi(int arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public int getResult() {
        return primaryArg;
    }
}