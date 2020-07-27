package com.drapala.singleton;

public class EagerEvaluation {

    private static final EagerEvaluation instance = new EagerEvaluation();
    private int value;

    private EagerEvaluation() {}

    public static EagerEvaluation getInstance() {
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
