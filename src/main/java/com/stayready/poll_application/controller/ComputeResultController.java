package com.stayready.poll_application.controller;

import com.stayready.poll_application.repositories.voteRepository;
import com.stayready.poll_application.domain.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import DTOimplementation.VoteResult;

@RestController
public class ComputeResultController 
{
    private voteRepository voterepository;

    @Autowired
    public ComputeResultController(voteRepository voteRepository)
    {
        this.voterepository = voteRepository;
    }
    @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId)
    {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voterepository.findVotesByPoll(pollId);
        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }
}