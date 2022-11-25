package com.wati.graphql.graph.schema;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Address {
  private String state;

  private String country;

  private String addressLine1;

  private String addressLine2;

  private String pinCode;

  private AddressType addressTYpe;

  public Address() {
  }

  public Address(String state, String country, String addressLine1, String addressLine2,
      String pinCode, AddressType addressTYpe) {
    this.state = state;
    this.country = country;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.pinCode = pinCode;
    this.addressTYpe = addressTYpe;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getAddressLine1() {
    return addressLine1;
  }

  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }

  public String getAddressLine2() {
    return addressLine2;
  }

  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }

  public String getPinCode() {
    return pinCode;
  }

  public void setPinCode(String pinCode) {
    this.pinCode = pinCode;
  }

  public AddressType getAddressTYpe() {
    return addressTYpe;
  }

  public void setAddressTYpe(AddressType addressTYpe) {
    this.addressTYpe = addressTYpe;
  }

  @Override
  public String toString() {
    return "Address{" + "state='" + state + "'," +"country='" + country + "'," +"addressLine1='" + addressLine1 + "'," +"addressLine2='" + addressLine2 + "'," +"pinCode='" + pinCode + "'," +"addressTYpe='" + addressTYpe + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return java.util.Objects.equals(state, that.state) &&
                            java.util.Objects.equals(country, that.country) &&
                            java.util.Objects.equals(addressLine1, that.addressLine1) &&
                            java.util.Objects.equals(addressLine2, that.addressLine2) &&
                            java.util.Objects.equals(pinCode, that.pinCode) &&
                            java.util.Objects.equals(addressTYpe, that.addressTYpe);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(state, country, addressLine1, addressLine2, pinCode, addressTYpe);
  }

  public static com.wati.graphql.graph.schema.Address.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String state;

    private String country;

    private String addressLine1;

    private String addressLine2;

    private String pinCode;

    private AddressType addressTYpe;

    public Address build() {
                  com.wati.graphql.graph.schema.Address result = new com.wati.graphql.graph.schema.Address();
                      result.state = this.state;
          result.country = this.country;
          result.addressLine1 = this.addressLine1;
          result.addressLine2 = this.addressLine2;
          result.pinCode = this.pinCode;
          result.addressTYpe = this.addressTYpe;
                      return result;
    }

    public com.wati.graphql.graph.schema.Address.Builder state(String state) {
      this.state = state;
      return this;
    }

    public com.wati.graphql.graph.schema.Address.Builder country(String country) {
      this.country = country;
      return this;
    }

    public com.wati.graphql.graph.schema.Address.Builder addressLine1(String addressLine1) {
      this.addressLine1 = addressLine1;
      return this;
    }

    public com.wati.graphql.graph.schema.Address.Builder addressLine2(String addressLine2) {
      this.addressLine2 = addressLine2;
      return this;
    }

    public com.wati.graphql.graph.schema.Address.Builder pinCode(String pinCode) {
      this.pinCode = pinCode;
      return this;
    }

    public com.wati.graphql.graph.schema.Address.Builder addressTYpe(AddressType addressTYpe) {
      this.addressTYpe = addressTYpe;
      return this;
    }
  }
}
