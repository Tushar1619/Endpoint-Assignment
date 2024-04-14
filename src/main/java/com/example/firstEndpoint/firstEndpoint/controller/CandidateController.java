package com.example.firstEndpoint.firstEndpoint.controller;

import com.example.firstEndpoint.firstEndpoint.entity.Candidate;
import com.example.firstEndpoint.firstEndpoint.requestBody.CandidateRequest;
import com.example.firstEndpoint.firstEndpoint.service.impl.CandidateServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @PostMapping("/candidates")
    public ResponseEntity<List<Candidate>> findCandidatesByIdsAndAccountId(@RequestBody CandidateRequest candidateReq) {
        System.out.println(candidateReq.getCandidateIds());
        List<Candidate> candidates = service.findCandidatesByIdsAndAccountId(candidateReq.getCandidateIds());
        return new ResponseEntity<>(candidates, HttpStatus.OK);
    }
}
