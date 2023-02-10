package org.codesolutions.designpattern.singleton;

public class LenovoDriver {
    // Private static attribute of self
    private static LenovoDriver instance;
    public String driverVersion = "";
    // Private constructor to prevent instantiation
    // Use getInstance() instead to instantiate one (and only) object in heap
    private LenovoDriver() {}

    // Public static method to create an instance of this class
    // "synchronized" keyword makes this method thread safe
    public static synchronized LenovoDriver getInstance() {
        if (instance == null) {
            instance = new LenovoDriver();
        }
        return instance;
    }
}
