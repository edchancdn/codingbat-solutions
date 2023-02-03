package org.codesolutions.advanced.immutable;

// Immutable class

import java.util.Objects;

// Make the class "final"
public final class Address {
    // Make the attributes "private" and "final"
    private final String street;
    private final String postalCode;
    private final String province;
    private final String country;

    // Create a "public" constructor and initialize the values of the private final attributes here.
    // This will be the only place to initialize the attributes of this class.

    // Once an instance of this class is created in the heap and it's attributes initialized, then
    //   the attributes of this object cannot be modified anymore. It will be immutable.
    public Address(String street, String postalCode, String province, String country) {
        this.street = street;
        this.postalCode = postalCode;
        this.province = province;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return street.equals(address.street) && postalCode.equals(address.postalCode) && province.equals(address.province) && country.equals(address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, postalCode, province, country);
    }
}
