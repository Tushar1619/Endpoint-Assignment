package com.example.firstEndpoint.firstEndpoint.service;

import com.example.firstEndpoint.firstEndpoint.entity.Candidate;

import java.util.List;

public interface CandidateService {
    Candidate getCandidateById(Long id);
    public List<Candidate> findCandidatesByIdsAndAccountId(List<Long> candidateIds);
}
