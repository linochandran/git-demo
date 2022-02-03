package org.lino.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String streetName;
    private String city;
    private String province;
    private String zipCode;
    private String country;

}
