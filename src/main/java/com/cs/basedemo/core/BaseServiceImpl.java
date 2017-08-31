package com.cs.basedemo.core;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by cs on 2017/8/31.
 */
public abstract class BaseServiceImpl<T> implements BaseService<T>{

    @Autowired
    BaseRepository<T> baseRepository;


    @Override
    public void save(T model) {
        baseRepository.save(model);
    }

    @Override
    public void saveOrUpdate(T model) {

    }

    @Override
    public void update(T model) {

    }

    @Override
    public void merge(T model) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void deleteObject(T model) {

    }

    @Override
    public T get(Integer id) {
        return null;
    }

    @Override
    public int countAll() {
        return 0;
    }

    @Override
    public List<T> listAll() {
        return null;
    }

    @Override
    public Page<T> findByPage(Integer start, Integer size) {
        return null;
    }

    @Override
    public boolean exists(Integer id) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public void clear() {

    }
}
