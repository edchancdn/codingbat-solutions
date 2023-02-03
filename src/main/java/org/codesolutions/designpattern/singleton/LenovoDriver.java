package org.codesolutions.designpattern.singleton;

public class LenovoDriver {
    private static LenovoDriver instance;
    public String driverVersion = "";
    private LenovoDriver() {}

    // "synchronized" keyword makes this method thread safe
    public static synchronized LenovoDriver getInstance() {
        if (instance == null) {
            instance = new LenovoDriver();
        }
        return instance;
    }
}
