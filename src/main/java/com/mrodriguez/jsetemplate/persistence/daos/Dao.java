package com.mrodriguez.jsetemplate.persistence.daos;

import java.util.List;

public interface Dao<K, E> {

    void flush();

    void persist(E entity);

    void merge(E entity);


    void remove(E entity);

    E findById(K id);

    List<E> findAll();

    public void rollBack();
 
}