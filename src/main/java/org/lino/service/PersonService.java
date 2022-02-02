package org.lino.service;

import org.lino.model.Person;

public class PersonService {

    public void save(Person person){
        if(person!=null){
            System.out.println(person);
        }else {
            System.out.println("Invalid Data to process");
        }
    }
}
