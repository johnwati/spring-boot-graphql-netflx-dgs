package com.wati.graphql.graph.schema;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Hello {
  private String text;

  private Integer randomNumber;

  public Hello() {
  }

  public Hello(String text, Integer randomNumber) {
    this.text = text;
    this.randomNumber = randomNumber;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Integer getRandomNumber() {
    return randomNumber;
  }

  public void setRandomNumber(Integer randomNumber) {
    this.randomNumber = randomNumber;
  }

  @Override
  public String toString() {
    return "Hello{" + "text='" + text + "'," +"randomNumber='" + randomNumber + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hello that = (Hello) o;
        return java.util.Objects.equals(text, that.text) &&
                            java.util.Objects.equals(randomNumber, that.randomNumber);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(text, randomNumber);
  }

  public static com.wati.graphql.graph.schema.Hello.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String text;

    private Integer randomNumber;

    public Hello build() {
                  com.wati.graphql.graph.schema.Hello result = new com.wati.graphql.graph.schema.Hello();
                      result.text = this.text;
          result.randomNumber = this.randomNumber;
                      return result;
    }

    public com.wati.graphql.graph.schema.Hello.Builder text(String text) {
      this.text = text;
      return this;
    }

    public com.wati.graphql.graph.schema.Hello.Builder randomNumber(Integer randomNumber) {
      this.randomNumber = randomNumber;
      return this;
    }
  }
}
