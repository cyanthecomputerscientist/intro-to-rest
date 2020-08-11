package com.stayready.poll_application.controller;
import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.stayready.poll_application.repositories.pollRepository;
import com.stayready.poll_application.domain.Poll;

@RestController
public class pollController 
{
    @Inject
    private pollRepository pollrepository;

    @RequestMapping(value ="/polls", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Poll>> getAllPolls()
    {
        Iterable<Poll> allPolls = pollrepository.findAll();
        return new ResponseEntity<>(pollrepository.findAll(), HttpStatus.OK);
    }
    @RequestMapping(value = "/polls", method = RequestMethod.POST)
    public ResponseEntity<?> createPolls(@RequestBody Poll poll)
    {
        poll = pollrepository.save(poll);
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    
}