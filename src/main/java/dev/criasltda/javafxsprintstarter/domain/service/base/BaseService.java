package dev.criasltda.javafxsprintstarter.domain.service.base;

import java.util.List;

public interface BaseService<T, ID> {

    void create(T entity);
    T update(T entity);
    T getOne(ID tnity_id);
    List<T> getAll();
    void delete(T entity);
}
