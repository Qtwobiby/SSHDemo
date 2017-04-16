package com.nancy.shop.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chenqinqin on 17/4/16.
 * @author chenqinqin
 *
 */
public interface GenericDao <T, PK extends Serializable> {

    T load(PK id);

    T get(PK id);

    List<T> findAll();

    void persist(T entity);

    PK save(T entity);

    void saveOrUpdate(T entity);

    void delete(PK id);

    void flush();
}
