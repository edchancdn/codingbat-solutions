package org.codesolutions.collections.linkedhashset;

public class LinkedHashSetRunner {
    public static void main(String[] args) {
        /**
         * Iterable is an interface.
         *    Implementing this interface allows an object to be used in a for-each loop statement.
         * Collection is an interface that extends the Iterable interface.
         *    A collection represents a group of objects, known as its elements.
         *    Some collections allow duplicates and others don't.
         *    Some are ordered and some are not.
         * Set is an interface that extends the Collection interface.
         *    Set is an unordered collection.
         *    The user can access the elements by their integer index.
         *    No duplicate elements allowed.
         *    One null element allowed.
         * LinkedHashSet is an implementation of the Set interface.
         *    it is backed by a hash table (HashMap instance)
         *    Stores elements as nodes.
         *    The list has a link to the first node.
         *    Each node has a link to the next node in the list.
         *    Adding and removing an element in the list will involve creating a new node
                and setting the next link to the corresponding one in the chain.
         *    This class offers constant time performance for the basic operations
         *       (add, remove, contains and size)
         *    Iteration over a LinkedHashSet requires time proportional to the size of the set
         *       Faster than iteration over a HashSet.
         */
    }
}
