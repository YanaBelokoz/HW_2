package com.example.helloworld.calculate.operations;

import com.example.helloworld.calculate.Calculator;

public abstract class Operation implements Calculator {
    private float first;
    private float second;

    public Operation(float first, float second) {
        this.first = first;
        this.second = second;
    }

    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }
}
