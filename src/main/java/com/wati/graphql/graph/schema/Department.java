package com.wati.graphql.graph.schema;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Department {
  private String _id;

  private String departmentName;

  public Department() {
  }

  public Department(String _id, String departmentName) {
    this._id = _id;
    this.departmentName = departmentName;
  }

  public String get_id() {
    return _id;
  }

  public void set_id(String _id) {
    this._id = _id;
  }

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  @Override
  public String toString() {
    return "Department{" + "_id='" + _id + "'," +"departmentName='" + departmentName + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return java.util.Objects.equals(_id, that._id) &&
                            java.util.Objects.equals(departmentName, that.departmentName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(_id, departmentName);
  }

  public static com.wati.graphql.graph.schema.Department.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String _id;

    private String departmentName;

    public Department build() {
                  com.wati.graphql.graph.schema.Department result = new com.wati.graphql.graph.schema.Department();
                      result._id = this._id;
          result.departmentName = this.departmentName;
                      return result;
    }

    public com.wati.graphql.graph.schema.Department.Builder _id(String _id) {
      this._id = _id;
      return this;
    }

    public com.wati.graphql.graph.schema.Department.Builder departmentName(String departmentName) {
      this.departmentName = departmentName;
      return this;
    }
  }
}
