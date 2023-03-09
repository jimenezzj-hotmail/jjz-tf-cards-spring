package com.jjimenezz.jjztfcards.services;

import java.util.Set;

public interface ICrudServiceTf<T, ID> {

    Set<T> getAll();
    
    T getById(ID id);

    T save(T newEntity);

    void delete(T entity);

    void deleteById(ID id);
}
