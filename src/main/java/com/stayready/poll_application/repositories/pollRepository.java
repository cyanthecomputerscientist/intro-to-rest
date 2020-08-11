package com.stayready.poll_application.repositories;

import org.springframework.data.repository.CrudRepository;
import com.stayready.poll_application.domain.Poll;
public class pollRepository implements CrudRepository<Poll,Long>{

    @Override
    public <S extends Poll> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Poll> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Poll findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean exists(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Poll> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Poll> findAll(Iterable<Long> ids) {
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
    public void delete(Poll entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Iterable<? extends Poll> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }
    
}