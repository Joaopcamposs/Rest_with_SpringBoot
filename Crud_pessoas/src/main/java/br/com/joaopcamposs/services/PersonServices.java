package br.com.joaopcamposs.services;

import br.com.joaopcamposs.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person){
        return person;
    }

    public Person update(Person person){
        return person;
    }

    public void delete(String id){}

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Joao");
        person.setLastName("Campos");
        person.setAddress("Franca-sp");
        person.setGender("Male");

        return person;
    }

    public List<Person> findAll(){
        List<Person> persons = new ArrayList<Person>();
        for (int i=0; i<8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    public Person mockPerson(int i){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name"+i);
        person.setLastName("Last name");
        person.setAddress("Some adress");
        person.setGender("Gender");
        return person;
    }
}
