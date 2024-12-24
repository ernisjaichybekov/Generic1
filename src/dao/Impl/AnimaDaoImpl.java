package dao.Impl;

import Gender.Gender;
import dao.GenericDao;
import model.Animal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimaDaoImpl implements GenericDao<Animal> {

        private List<Animal> animals = new ArrayList<>();

        @Override
        public String add(List<Animal> animalsList) {
            animals.addAll(animalsList);
            return "Animals added successfully.";
        }

        @Override
        public Animal getById(Long id) {
            return animals.stream()
                    .filter(animal -> animal.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public List<Animal> getAll() {
            return new ArrayList<>(animals);
        }

        @Override
        public List<Animal> sortByName(int order) {
            return animals.stream()
                    .sorted(order == 1 ? Comparator.comparing(Animal::getName)
                            : Comparator.comparing(Animal::getName).reversed())
                    .collect(Collectors.toList());
        }

        @Override
        public List<Animal> filterByGender(int gender) {
            String Gender = "";
            return animals.stream()
                    .filter(animal -> gender == 1 ? animal.getGender() == Gender.FEMALE
                            : animal.getGender() == Gender)
                    .collect(Collectors.toList());
        }

        @Override
        public List<Animal> clear() {
            animals.clear();
            return new ArrayList<>();
}
    }

