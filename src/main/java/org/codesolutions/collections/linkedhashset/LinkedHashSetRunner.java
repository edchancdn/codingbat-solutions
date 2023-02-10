package org.codesolutions.collections.linkedhashset;

import org.codesolutions.collections.CollectionsUtil;
import org.codesolutions.collections.Contact;

import java.util.*;

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
         *    The set has a link to the first node.
         *    Each node has a link to the next node in the list.
         *    Adding and removing an element in the set will involve creating a new node
                and setting the next link to the corresponding one in the chain.
         *    This class offers constant time performance for the basic operations
         *       (add, remove, contains and size)
         *    Iteration over a LinkedHashSet requires time proportional to the size of the set
         *       Faster than iteration over a HashSet.
         */
        Set<Contact> contactList = new LinkedHashSet<>();

        CollectionsUtil collectionsUtil = CollectionsUtil.getInstance();
        collectionsUtil.addContactSet(contactList);

        Contact findContact = new Contact(2L, "Jane", "Deer",
                null, "jane@email.com");
        System.out.println("Contact found: " + contactList.contains(findContact));

        /**
         * Iterator is an interface that belongs to the Collections framework.
         *    Iterator.hasNext() returns true if the iteration has more elements.
         *    Iterator.remove() safely removes the element from the iteration.
         *    Iterator.next() returns the next element in the iteration.
         */
        Iterator<Contact> itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact contact = itr.next();
            if (contact.getFirstName().equals("Fred")) {
                itr.remove(); }
        }

        System.out.println("After Iterator.remove: " + contactList);

        System.out.println("Collection elements:");
        for (Contact contact: contactList) {
            System.out.println(contact);
        }

        // Thread-safe LinkedHashSet
        Set<Contact> synchronizedContactList = Collections.synchronizedSet(new LinkedHashSet<>());
    }
}
