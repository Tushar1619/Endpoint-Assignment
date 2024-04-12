package com.example.firstEndpoint.firstEndpoint.controller;

import com.example.firstEndpoint.firstEndpoint.entity.Candidate;
import com.example.firstEndpoint.firstEndpoint.service.impl.CandidateServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    private CandidateServiceImpl service;

    public CandidateController(CandidateServiceImpl service){
        this.service = service;
    }

    @GetMapping("api/hello")
    public String sayHello(){
        return "hello";
    }
    @GetMapping("/api/candidates/{theId}")
    public Candidate getCandidateById(@PathVariable Long theId){
        return service.getCandidateById(theId);
    }

    @GetMapping("/candidates")
    public ResponseEntity<List<Candidate>> findCandidatesByIdsAndAccountId(@RequestParam List<Long> candidateIds) {
        List<Candidate> candidates = service.findCandidatesByIdsAndAccountId(candidateIds);
        return new ResponseEntity<>(candidates, HttpStatus.OK);
    }
}
