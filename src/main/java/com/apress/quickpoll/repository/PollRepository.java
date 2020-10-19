package com.apress.quickpoll.repository;

import org.springframework.data.repository.CrudRepository;
import com.apress.quickpoll.domain.Poll;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface PollRepository extends CrudRepository<Poll, Long> {
    


//    @RequestMapping(value="/polls/{pollId}", method=RequestMethod.PUT)
//    public default ResponseEntity<?> updatePoll(@RequestBody Poll poll, @PathVariable Long pollId) {
//        // Save the entity
//        Poll p = PollRepository.save(poll);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @RequestMapping(value="/polls/{pollId}", method=RequestMethod.DELETE)
//    public default ResponseEntity<?> deletePoll(@PathVariable Long pollId) {
//        PollRepository.delete(pollId);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}
