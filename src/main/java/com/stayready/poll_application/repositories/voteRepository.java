package com.stayready.poll_application.repositories;
import com.stayready.poll_application.domain.Vote;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public class voteRepository implements CrudRepository<Vote,Long>
{
    @Query(value = "SELECT v.*"+ "FROM Option o, Vote v"+ "WHERE o.POLL_ID =?1" + "AND v.OPTION_ID = o.OPTION_ID" , nativeQuery = true)
    public Iterable<Vote> findVotesByPoll(long pollId);

    @Override
    public <S extends Vote> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Vote> Iterable<S> save(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vote findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean exists(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Vote> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Vote> findAll(Iterable<Long> ids) {
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
    public void delete(Vote entity) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Iterable<? extends Vote> entities) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub

    }

    
}