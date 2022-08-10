package com.example.helloworld.calculate;

import com.example.helloworld.calculate.operations.AddOperation;
import com.example.helloworld.calculate.operations.DivideOperation;
import com.example.helloworld.calculate.operations.MultiplyOperation;
import com.example.helloworld.calculate.operations.SubtractOperation;

import java.util.Scanner;

public class CalculatorService {
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        float first = scanner.nextFloat();
        System.out.println("Enter the math operand (+, -, *, /)");
        char symbol = scanner.next().charAt(0);
        System.out.println("Enter second integer number:");
        float second = scanner.nextFloat();
        scanner.close();

        Calculator calculator = getOperation(symbol, first, second);

        System.out.println("Result is: " + calculator.calculate());
    }
    private Calculator getOperation(char symbol, float first, float second) {
        return switch (symbol) {
            case '+' -> new AddOperation(first, second);
            case '-' -> new SubtractOperation(first, second);
            case '*' -> new MultiplyOperation(first, second);
            case '/' -> new DivideOperation(first, second);
            default -> throw new RuntimeException("Invalid operator");
        };
    }

}
