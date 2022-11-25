package com.wati.graphql.graph.schema;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class QueryEmployee {
  private List<Hello> allHellos;

  private Hello oneHello;

  public QueryEmployee() {
  }

  public QueryEmployee(List<Hello> allHellos, Hello oneHello) {
    this.allHellos = allHellos;
    this.oneHello = oneHello;
  }

  public List<Hello> getAllHellos() {
    return allHellos;
  }

  public void setAllHellos(List<Hello> allHellos) {
    this.allHellos = allHellos;
  }

  public Hello getOneHello() {
    return oneHello;
  }

  public void setOneHello(Hello oneHello) {
    this.oneHello = oneHello;
  }

  @Override
  public String toString() {
    return "QueryEmployee{" + "allHellos='" + allHellos + "'," +"oneHello='" + oneHello + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QueryEmployee that = (QueryEmployee) o;
        return java.util.Objects.equals(allHellos, that.allHellos) &&
                            java.util.Objects.equals(oneHello, that.oneHello);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(allHellos, oneHello);
  }

  public static com.wati.graphql.graph.schema.QueryEmployee.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private List<Hello> allHellos;

    private Hello oneHello;

    public QueryEmployee build() {
                  com.wati.graphql.graph.schema.QueryEmployee result = new com.wati.graphql.graph.schema.QueryEmployee();
                      result.allHellos = this.allHellos;
          result.oneHello = this.oneHello;
                      return result;
    }

    public com.wati.graphql.graph.schema.QueryEmployee.Builder allHellos(List<Hello> allHellos) {
      this.allHellos = allHellos;
      return this;
    }

    public com.wati.graphql.graph.schema.QueryEmployee.Builder oneHello(Hello oneHello) {
      this.oneHello = oneHello;
      return this;
    }
  }
}
