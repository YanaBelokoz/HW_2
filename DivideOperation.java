package com.example.helloworld.calculate.operations;

public class DivideOperation extends Operation {
    public DivideOperation(float first, float second) {
        super(first, second);
    }

    @Override
    public float calculate() {
        return getFirst() / getSecond();
    }
}
