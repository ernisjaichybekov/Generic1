package dao.Impl;

import Gender.Gender;
import dao.GenericDao;
import model.Person;
import service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonDaoImpl implements GenericDao<Person> {

        private List<Person> people = new ArrayList<>();

        @Override
        public String add(List<Person> persons) {
            people.addAll(persons);
            return "People added successfully.";
        }

        @Override
        public Person getById(Long id) {
            return people.stream()
                    .filter(person -> person.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public List<Person> getAll() {
            return new ArrayList<>(people);
        }

        @Override
        public List<Person> sortByName(int order) {
            return people.stream()
                    .sorted(order == 1 ? Comparator.comparing(Person::getName)
                            : Comparator.comparing(Person::getName).reversed())
                    .collect(Collectors.toList());
        }

        @Override
        public List<Person> filterByGender(int gender) {
            String Gender = "";
            return people.stream()
                    .filter(person -> gender == 1 ? person.getGender() == Gender.FEMALE
                            : person.getGender() == Gender)
                    .collect(Collectors.toList());
        }

        @Override
        public List<Person> clear() {
            people.clear();
            return new ArrayList<>();
}
    }


