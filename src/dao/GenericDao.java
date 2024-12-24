package dao;

import java.util.List;

public interface GenericDao <T> {
    String add(List<T> t);
    T getById(Long id);
    List<T> getAll();
    List<T> sortByName(int order); // 1 - ascending, 2 - descending
    List<T> filterByGender(int gender); // 1 - FEMALE, 2 - MALE
    List<T> clear();

}
