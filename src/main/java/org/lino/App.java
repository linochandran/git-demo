package org.lino;

import org.lino.model.Person;
import org.lino.service.PersonService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Person person=new Person("Lino", "Chandran", "linochandran@gmail.com");
        PersonService service=new PersonService();
        service.save(person);
    }
}
