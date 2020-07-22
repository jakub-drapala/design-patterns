package com.drapala.singleton;

import java.util.Objects;

public class Synchronized {

    private static Synchronized instance = null;
    private int value;

    private Synchronized() {}

    // by adding the synchronized keyword to getInstance(),
    // we force every thread to wait its turn before it can enter the method
    public static synchronized Synchronized getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Synchronized();
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
