package br.com.joaopcamposs.services;

import br.com.joaopcamposs.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person findById(String id){
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Joao");
        person.setLastName("Campos");
        person.setAddress("Franca-sp");
        person.setGender("Male");

        return person;
    }
}
