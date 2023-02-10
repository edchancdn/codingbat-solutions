package org.codesolutions.maps.hashmap;

import org.codesolutions.collections.Contact;

import java.util.*;

public class HashMapRunner {
    public static void main(String[] args) {
        /**
         * Map is an interface that maps keys to values.
         *    No duplicate key allowed.
         * HashMap is a data structure that implements the Map interface.
         *    it is a hash table based implementation.
         *    unordered map.
         *    One null key allowed.
         *    Allows null values.
         *    This class offers constant time performance for the basic operations
         *       (add, remove, contains and size)
         *    Iteration over a HashSet requires time proportional to the capacity of the set.
         */

        HashMap<Integer, String> employeeIdMap = new HashMap<>();

        employeeIdMap.put(1, "John Doe");
        employeeIdMap.put(2, "Jane Deer");
        employeeIdMap.put(3, "Fred Campbell");

        System.out.println(employeeIdMap);

        System.out.println(employeeIdMap.get(2));

        for (Map.Entry<Integer, String> entry : employeeIdMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        /**
         * Iterator is an interface that belongs to the Collections framework.
         *    Iterator.hasNext() returns true if the iteration has more elements.
         *    Iterator.remove() safely removes the element from the iteration.
         *    Iterator.next() returns the next element in the iteration.
         */
        Iterator itr = employeeIdMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            if (entry.getValue().equals("Fred Campbell")) {
                itr.remove(); }
        }
        System.out.println("After Iterator.remove: " + employeeIdMap);

        /**
         * Hash code collision can occur in a HasMap.
         *    A collision is when two or more key objects produce the same hash code value.
         *    Java's collision resolution technique involves the creation of a linked list
         *       to contain two or more mappings.
         *
         */

        // Thread-safe HashMap
        Map<Integer,String> synchronizedEmployeeIdList = Collections.synchronizedMap(employeeIdMap);
    }
}
