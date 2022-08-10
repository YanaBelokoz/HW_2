package com.example.helloworld.calculate.operations;

public class MultiplyOperation extends Operation {
    public MultiplyOperation(float first, float second) {
        super(first, second);
    }

    @Override
    public float calculate() {
        return getFirst() * getSecond();
    }
}
