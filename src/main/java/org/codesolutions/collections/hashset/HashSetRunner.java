package org.codesolutions.collections.hashset;

import org.codesolutions.collections.Contact;

import java.util.*;

public class HashSetRunner {
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
         * HashSet is an implementation of the Set interface.
         *    it is backed by a hash table (HashMap instance)
         *    This class offers constant time performance for the basic operations
         *       (add, remove, contains and size)
         *    Iteration over a LinkedHashSet requires time proportional to the size of the set.
         */

        Set<Contact> contactList = new HashSet<>();

        addContacts(contactList);

        Contact findContact = new Contact();
        findContact.setId(2L);
        findContact.setFirstName("Jane");
        findContact.setLastName("Deer");
        findContact.setEmail("jane@email.com");

        System.out.println("Contact found: " + contactList.contains(findContact));

        /**
         * Iterator is an interface that belongs to the Collections framework.
         *    Iterator.hasNext() returns true if the iteration has more elements.
         *    Iterator.next() returns the next element in the iteration.
         *    Iterator.remove() safely removes the element from the iteration.
         */
        Iterator<Contact> itr = contactList.iterator();
        while (itr.hasNext()) {
            Contact contact = itr.next();  // use this to get/read the next element
            if (contact.getFirstName().equals("Fred")) {
                itr.remove(); }
        }

        System.out.println("After Iterator.remove: " + contactList);

        // Synchronized
        List<Contact> synchronizedContactList = Collections.synchronizedList(new ArrayList<>());

    }

    private static void addContacts(Set<Contact> contactList) {
        Contact contact1 = new Contact();
        contact1.setId(1L);
        contact1.setFirstName("John");
        contact1.setLastName("Doe");
        contact1.setPhoneNumber("4169712345");
        contactList.add(contact1);

        Contact contact2 = new Contact();
        contact2.setId(2L);
        contact2.setFirstName("Jane");
        contact2.setLastName("Deer");
        contact2.setEmail("jane@email.com");
        contactList.add(contact2);

        Contact contact3 = new Contact();
        contact3.setId(3L);
        contact3.setFirstName("Fred");
        contact3.setLastName("Campbell");
        contact1.setPhoneNumber("9059712333");
        contact3.setEmail("fred@email.com");
        contactList.add(contact3);
    }
}
