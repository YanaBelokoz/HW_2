package com.example.helloworld.calculate.operations;

public class SubtractOperation extends Operation {
    public SubtractOperation(float first, float second) {
        super(first, second);
    }

    @Override
    public float calculate() {
        return getFirst() - getSecond();
    }
}
