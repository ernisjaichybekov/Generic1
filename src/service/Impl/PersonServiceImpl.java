package service.Impl;

import dao.Impl.PersonDaoImpl;
import model.Person;
import service.GenericService;

import java.util.List;

public class PersonServiceImpl implements GenericService<Person> {

        private final PersonDaoImpl personDao = new PersonDaoImpl();

        @Override
        public String add(List<Person> t) {
            return personDao.add(t);
        }

        @Override
        public Person getById(Long id) {
            return personDao.getById(id);
        }

        @Override
        public List<Person> getAll() {
            return personDao.getAll();
        }

        @Override
        public List<Person> sortByName(int order) {
            return personDao.sortByName(order);
        }

        @Override
        public List<Person> filterByGender(int gender) {
            return personDao.filterByGender(gender);
        }

        @Override
        public List<Person> clear() {
            return personDao.clear();
}

}
