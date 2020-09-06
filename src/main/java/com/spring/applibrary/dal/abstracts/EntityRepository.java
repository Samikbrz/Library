package com.spring.applibrary.dal.abstracts;

import java.util.List;

public interface EntityRepository<T>  {
    List<T> getAll();
    void add(T entity);
    void update(T entity);
    void Delete(T entity);
}
