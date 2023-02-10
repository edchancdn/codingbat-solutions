package org.codesolutions.collections.arraylist;

import org.codesolutions.collections.CollectionsUtil;
import org.codesolutions.collections.Contact;

import java.util.*;

public class ArrayListRunner {
    public static void main(String[] args) {
        /**
         * Iterable is an interface.
         *    Implementing this interface allows an object to be used in a for-each loop statement.
         * Collection is an interface that extends the Iterable interface.
         *    A collection represents a group of objects, known as its elements.
         *    Some collections allow duplicates and others don't.
         *    Some are ordered and some are not.
         * List is an interface that extends the Collection interface.
         *    List is an ordered collection.
         *    The user can access the elements by their integer index.
         *    List allows duplicate elements.
         *    Allows null elements.
         * Array is a data structure that collects elements of the same data type
         *    and store them in a contiguous and adjacent memory locations.
         * ArrayList is the resizable array implementation of the List interface.
         *    The size, isEmpty, get, set, iterator, and listIterator operations run in constant time.
         *       The add operation runs in amortized constant time,
         *       that is, adding n elements requires O(n) time.
         *       All other operations run in linear time.
         *
         */
        List<Contact> contactList = new ArrayList<>();

        CollectionsUtil collectionsUtil = CollectionsUtil.getInstance();
        collectionsUtil.addContactList(contactList);

        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }

        /**
         * Direct use of ArrayList.remove() will result in ConcurrentModificationException exception.
         * Note: The element will be removed, even if the exception is thrown.
         * Use the Iterator.remove() instead.
         */
        try {
            for (Contact contact: contactList) {
                if (contact.getFirstName() == "John") {
                    contactList.remove(contact);
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("exception: ConcurrentModificationException");
        }

        System.out.println("After ArrayList.remove: " + contactList);

        /**
         * Iterator is an interface that belongs to the Collections framework.
         *    Iterator.hasNext() returns true if the iteration has more elements.
         *    Iterator.remove() safely removes the element from the iteration.
         */
        Iterator<Contact> itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact contact = itr.next();
            if (contact.getFirstName().equals("Fred")) {
                itr.remove(); }
        }

        System.out.println("After Iterator.remove: " + contactList);

        // Thread-safe ArrayList
        List<Contact> synchronizedContactList = Collections.synchronizedList(new ArrayList<>());
    }
}
