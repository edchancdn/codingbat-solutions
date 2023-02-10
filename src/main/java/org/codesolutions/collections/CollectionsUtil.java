package org.codesolutions.collections;

import java.util.List;
import java.util.Set;

public class CollectionsUtil {
    private static CollectionsUtil collectionsUtil;
    private CollectionsUtil(){};
    public static synchronized CollectionsUtil getInstance() {
        if (collectionsUtil == null) {
            collectionsUtil = new CollectionsUtil();
        }
        return collectionsUtil;
    }

    public void addContactList(List<Contact> contactList) {
        Contact contact1 = new Contact();
        contact1.setId(1L);
        contact1.setFirstName("John");
        contact1.setLastName("Doe");
        contact1.setPhoneNumber("4169712345");
        contactList.add(contact1);

        Contact contact2 = new Contact();
        contact2.setId(5L);
        contact2.setFirstName("Jane");
        contact2.setLastName("Deer");
        contact2.setEmail("jane@email.com");
        contactList.add(contact2);

        Contact contact3 = new Contact();
        contact3.setId(6L);
        contact3.setFirstName("Fred");
        contact3.setLastName("Campbell");
        contact1.setPhoneNumber("9059712333");
        contact3.setEmail("fred@email.com");
        contactList.add(contact3);
    }

    public void addContactSet(Set<Contact> contactList) {
        Contact contact1 = new Contact();
        contact1.setId(1L);
        contact1.setFirstName("John");
        contact1.setLastName("Doe");
        contact1.setPhoneNumber("4169712345");
        contactList.add(contact1);

        Contact contact2 = new Contact();
        contact2.setId(5L);
        contact2.setFirstName("Jane");
        contact2.setLastName("Deer");
        contact2.setEmail("jane@email.com");
        contactList.add(contact2);

        Contact contact3 = new Contact();
        contact3.setId(6L);
        contact3.setFirstName("Fred");
        contact3.setLastName("Campbell");
        contact1.setPhoneNumber("9059712333");
        contact3.setEmail("fred@email.com");
        contactList.add(contact3);
    }
}
