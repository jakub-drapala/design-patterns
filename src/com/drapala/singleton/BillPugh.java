package com.drapala.singleton;

public class BillPugh {

    private int value;

    private BillPugh() {}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static BillPugh getInstance() {
        return SingletonHelper.uniqueInstance;
    }

    private static class SingletonHelper {
        private static final BillPugh uniqueInstance = new BillPugh();
    }
}
