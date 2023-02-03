package org.codesolutions.designpattern.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        // Create a LenovoDriver object
        // This will create the first instance(object) of the LenovoDriver class in the heap
        LenovoDriver driver1 = LenovoDriver.getInstance();
        System.out.println("driver1.driverVersion: " + driver1.driverVersion);

        // Set the driverVersion attribute value
        driver1.driverVersion = "1.1.3";
        System.out.println("driver1.driverVersion: " + driver1.driverVersion);

        // Attempt to create another LenovoDriver object.
        // This variable will be created in the stack and will refer to the same instance(object)
        // of LenovoDriver class in the heap.
        LenovoDriver driver2 = LenovoDriver.getInstance();
        System.out.println("driver2.driverVersion: " + driver2.driverVersion);

        // Modify the driverVersion attribute
        // This will update the driverVersion attribute of the single LenovoDriver object in the heap
        driver2.driverVersion = "1.1.4";
        System.out.println("driver2.driverVersion: " + driver2.driverVersion);

        // Printing the driverVersion of variable driver1 shows that the attribute value
        // is equal to the driverVersion value of variable driver2.
        // This proves that both variables are referring to the same object in the heap.
        System.out.println("driver1.driverVersion: " + driver1.driverVersion);
    }
}
