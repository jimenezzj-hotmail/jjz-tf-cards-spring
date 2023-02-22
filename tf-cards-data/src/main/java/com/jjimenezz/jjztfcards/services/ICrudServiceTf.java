package com.jjimenezz.jjztfcards.services;

import java.util.Set;

public interface ICrudServiceTf<T, ID> {

    Set<T> getAll();
    
    T getById(ID id);

    T save(T newEntity);

    T delete(T entity);

    T deleteById(ID id);
}
