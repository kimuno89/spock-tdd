package com.facgg.tdd.basic;

import java.util.function.BinaryOperator;

public enum Calculator {

    PLUS("더하기", (value1, value2) -> {
        return plus(value1, value2);
    }),

    MINUS("빼기", (value1, value2) -> {
        return minus(value1, value2);
    }),

    MULTIPLY("곱하기", (value1, value2) -> {
        return multiply(value1, value2);
    }),

    DIVIDE("나누기", (value1, value2) -> {
        return divide(value1, value2);
    });

    private String title;
    private BinaryOperator<Integer> expression;

    Calculator(String title, BinaryOperator<Integer> expression) {
        this.title = title;
        this.expression = expression;
    }

    public static int plus(int value1, int value2) {
        return value1 + value2;
    }

    public static int minus(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public static int divide(int value1, int value2) {
        return value1 / value2;
    }

    public int calculate(int value1, int value2) { return expression.apply(value1, value2); }
}
