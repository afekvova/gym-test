package ua.afek.springmvc.service;

import ua.afek.springmvc.model.Person;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DataAccess {

    private final List<Person> personList;
    public DataAccess() {
        this.personList = buildPeople();
    }

    public Person findPerson(int id) {
        return personList.stream().filter(p-> p.getId() == id).toList().get(0);
    }

    public List<Person> getPeople() {
        return this.personList;
    }

    private List<Person> buildPeople() {
        var retval = Arrays.asList(
            new Person(1, "Joe", 12, "111-11-1111", 11000),
            new Person(2, "Fred", 22, "222-22-2222", 220000),
            new Person(3,"Bill", 33, "333-33-3333", 330000)
        );
        return retval;
    }
}
