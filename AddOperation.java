package com.example.helloworld.calculate.operations;

public class AddOperation extends Operation {

    public AddOperation(float first, float second) {
        super(first, second);
    }

    @Override
    public float calculate() {
        return getFirst() + getSecond();
    }
}
