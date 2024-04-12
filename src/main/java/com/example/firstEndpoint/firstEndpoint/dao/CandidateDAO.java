package com.example.firstEndpoint.firstEndpoint.dao;

import com.example.firstEndpoint.firstEndpoint.entity.Candidate;

import java.util.List;

public interface CandidateDAO {
    Candidate getCandidateById(Long id);
    public List<Candidate> findCandidatesByIdsAndAccountId(List<Long> candidateIds);
}
