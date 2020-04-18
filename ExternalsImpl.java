package javatest;

import mathexpressions.MathInterpreter.Externals;

public class ExternalsImpl implements Externals {

    @Override
    public int power(int base, int power) {
        return (int) Math.pow(base, power);
    }

}
