package com.drapala.singleton;

import java.util.Objects;

public class DoubleCheckLocking {

    private volatile static DoubleCheckLocking instance = null;
    private int value;

    private DoubleCheckLocking() {}

    public static DoubleCheckLocking getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (DoubleCheckLocking.class) {
                if (Objects.isNull(instance)) {
                    instance = new DoubleCheckLocking();
                }
            }
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
