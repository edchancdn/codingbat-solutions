package org.codesolutions.collections.linkedlist;

import org.codesolutions.collections.CollectionsUtil;
import org.codesolutions.collections.Contact;

import java.util.*;

public class LinkedListRunner {
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
         * LinkedList is an implementation of the List interface.
         *    Stores elements as nodes.
         *    The list has a link to the first node.
         *    Each node has a link to the next node in the list.
         *    Adding and removing an element in the list will involve creating a new node
         *       and setting the next link to the corresponding one in the chain.
         *    Adding and removing an element from the list is faster than that of an ArrayList.
         *    But reading is slower than that of the ArrayList,
         *       as the pointer would need to read from the beginning of the list.
         *
         */
        List<Contact> contactList = new LinkedList<>();

        CollectionsUtil collectionsUtil = CollectionsUtil.getInstance();
        collectionsUtil.addContactList(contactList);

        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }

        /**
         * Direct use of LinkedList.remove() will result in ConcurrentModificationException exception.
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

        // Thread-safe LinkedList
        List<Contact> synchronizedContactList = Collections.synchronizedList(new LinkedList<>());
    }
}
