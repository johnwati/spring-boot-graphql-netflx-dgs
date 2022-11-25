package com.wati.graphql;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class ADDRESS {
    public static final String TYPE_NAME = "Address";

    public static final String State = "state";

    public static final String Country = "country";

    public static final String AddressLine1 = "addressLine1";

    public static final String AddressLine2 = "addressLine2";

    public static final String PinCode = "pinCode";

    public static final String AddressTYpe = "addressTYpe";
  }

  public static class DEPARTMENT {
    public static final String TYPE_NAME = "Department";

    public static final String _id = "_id";

    public static final String DepartmentName = "departmentName";
  }

  public static class EMPLOYEE {
    public static final String TYPE_NAME = "Employee";

    public static final String _id = "_id";

    public static final String FullName = "fullName";

    public static final String Gender = "gender";

    public static final String AddressList = "addressList";

    public static final String Department = "department";
  }

  public static class QUERYEMPLOYEE {
    public static final String TYPE_NAME = "QueryEmployee";

    public static final String AllHellos = "allHellos";

    public static final String OneHello = "oneHello";
  }

  public static class HELLO {
    public static final String TYPE_NAME = "Hello";

    public static final String Text = "text";

    public static final String RandomNumber = "randomNumber";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String AllHellos = "allHellos";

    public static final String OneHello = "oneHello";
  }
}
