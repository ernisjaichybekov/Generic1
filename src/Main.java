import Gender.Gender;
import model.Animal;
import model.Person;
import service.Impl.PersonServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            PersonServiceImpl personService = new PersonServiceImpl();

            List<Person> persons = new ArrayList<>();
            persons.add(new Person(1L, "ainura", 30, Gender.FEMALE));
            persons.add(new Person(2L, "nurtielk", 25, Gender.MALE));
            persons.add(new Person(3L, "ernis", 35, Gender.MALE));

            System.out.println(personService.add(persons));
            System.out.println("All Persons: " + personService.getAll());
            System.out.println("Person by ID 2: " + personService.getById(2L));
            System.out.println("Sorted by name (asc): " + personService.sortByName(1));
            System.out.println("Filtered by gender (FEMALE): " + personService.filterByGender(1));
            System.out.println("Cleared List: " + personService.clear());


    }
}