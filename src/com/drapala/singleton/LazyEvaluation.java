package com.drapala.singleton;

import java.util.Objects;

public class LazyEvaluation {

    private static LazyEvaluation instance = null;
    private int value;

    private LazyEvaluation() {}

    public static LazyEvaluation getInstance() {
        if (Objects.isNull(instance)) {
            instance = new LazyEvaluation();
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
