package com.wati.graphql.graph.schema;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class Employee {
  private String _id;

  private String fullName;

  private Gender gender;

  private List<Address> addressList;

  private Department department;

  public Employee() {
  }

  public Employee(String _id, String fullName, Gender gender, List<Address> addressList,
      Department department) {
    this._id = _id;
    this.fullName = fullName;
    this.gender = gender;
    this.addressList = addressList;
    this.department = department;
  }

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public List<Address> getAddressList() {
    return addressList;
  }

  public void setAddressList(List<Address> addressList) {
    this.addressList = addressList;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" + "_id='" + _id + "'," +"fullName='" + fullName + "'," +"gender='" + gender + "'," +"addressList='" + addressList + "'," +"department='" + department + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee that = (Employee) o;
        return java.util.Objects.equals(_id, that._id) &&
                            java.util.Objects.equals(fullName, that.fullName) &&
                            java.util.Objects.equals(gender, that.gender) &&
                            java.util.Objects.equals(addressList, that.addressList) &&
                            java.util.Objects.equals(department, that.department);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(_id, fullName, gender, addressList, department);
  }

  public static com.wati.graphql.graph.schema.Employee.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String _id;

    private String fullName;

    private Gender gender;

    private List<Address> addressList;

    private Department department;

    public Employee build() {
                  com.wati.graphql.graph.schema.Employee result = new com.wati.graphql.graph.schema.Employee();
                      result._id = this._id;
          result.fullName = this.fullName;
          result.gender = this.gender;
          result.addressList = this.addressList;
          result.department = this.department;
                      return result;
    }

    public com.wati.graphql.graph.schema.Employee.Builder _id(String _id) {
      this._id = _id;
      return this;
    }

    public com.wati.graphql.graph.schema.Employee.Builder fullName(String fullName) {
      this.fullName = fullName;
      return this;
    }

    public com.wati.graphql.graph.schema.Employee.Builder gender(Gender gender) {
      this.gender = gender;
      return this;
    }

    public com.wati.graphql.graph.schema.Employee.Builder addressList(List<Address> addressList) {
      this.addressList = addressList;
      return this;
    }

    public com.wati.graphql.graph.schema.Employee.Builder department(Department department) {
      this.department = department;
      return this;
    }
  }
}
