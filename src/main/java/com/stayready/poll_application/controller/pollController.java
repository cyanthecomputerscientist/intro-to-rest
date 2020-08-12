package com.stayready.poll_application.controller;
import java.net.URI;
import java.net.http.HttpHeaders;

import javax.inject.Inject;

import com.stayready.poll_application.domain.Poll;
import com.stayready.poll_application.repositories.pollRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class pollController 
{
    @Inject
    private pollRepository pollrepository;

    @RequestMapping(value ="/polls", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls()
    {
        Iterable<Poll> allPolls = pollrepository.findAll();
        return new ResponseEntity<>(allPolls,HttpStatus.OK);
    }
    @RequestMapping(value = "/polls", method = RequestMethod.POST)
    public ResponseEntity<?> createPolls(@RequestBody Poll poll)
    {
        poll = pollrepository.save(poll);
        org.springframework.http.HttpHeaders responHeaders = new org.springframework.http.HttpHeaders();
        URI newPollUri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(poll.getId()).toUri();
        responHeaders.setLocation(newPollUri);

        return new ResponseEntity<>(responHeaders, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/polls/{pollId}", method = RequestMethod.GET)
    public ResponseEntity<?> getpoll(@PathVariable long pollId)
    {
        Poll p = pollrepository.findOne(pollId);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
    @RequestMapping(value ="/polls/{pollId}", method =RequestMethod.PUT)
    public ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable long pollId)
    {
        Poll p = pollrepository.save(poll);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value ="/polls/{pollId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePoll(@PathVariable long pollId)
    {
        pollrepository.delete(pollId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    


}