package org.lino.service;

import org.lino.model.Person;

public class PersonService {

    public void save(Person person){
        if(person!=null){
            System.out.println("First Name : "+person.getFirstName());
            System.out.println("Last Name  : "+person.getFirstName());
            System.out.println("Email Id   : "+person.getFirstName());
        }else {
            System.out.println("Invalid Data to process");
        }
    }
}
