package org.danp.samplehilt;

import javax.inject.Inject;


public class MathOperation {


    @Inject
    MathOperation() {

    }

    public double Multiplication(double a, double b) {
        return a * b;
    }

    public double Sum(double a, double b) {
        return a + b;
    }
}
