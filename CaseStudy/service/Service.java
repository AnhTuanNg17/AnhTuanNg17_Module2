package CaseStudy.service;

import java.util.List;

public interface Service<E> {
    List<E> findAll();
    void add(E e);
    void delete(int id);
    void search(String val);
    void edit(E e);

}
