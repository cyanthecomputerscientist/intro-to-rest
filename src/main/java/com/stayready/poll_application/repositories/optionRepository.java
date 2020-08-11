package com.stayready.poll_application.repositories;

import org.springframework.data.repository.CrudRepository;
import com.stayready.poll_application.domain.Option;

public class optionRepository implements CrudRepository<Option,Long>
{

    @Override
    public <S extends Option> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Option> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Option findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean exists(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Option> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Option> findAll(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Option entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Iterable<? extends Option> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }
    
}