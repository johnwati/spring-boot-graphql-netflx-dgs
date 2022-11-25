package com.wati.graphql.entity;



import com.wati.graphql.enums.AddressType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "address")
public class AddressEntity {
  @Id
  private String _id;
  private String state;

  private String country;

  private String addressLine1;

  private String addressLine2;

  private String pinCode;

  private AddressType addressTYpe;


}
