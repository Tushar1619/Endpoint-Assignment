package com.example.firstEndpoint.firstEndpoint.service.impl;

import com.example.firstEndpoint.firstEndpoint.dao.impl.CandidateDaoImpl;
import com.example.firstEndpoint.firstEndpoint.entity.Candidate;
import com.example.firstEndpoint.firstEndpoint.service.CandidateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {

    private  CandidateDaoImpl candidateDaoImpl;

    public CandidateServiceImpl(CandidateDaoImpl candidateDaoImpl){
        this.candidateDaoImpl = candidateDaoImpl;
    }

    @Override
    public Candidate getCandidateById(Long id) {
        return candidateDaoImpl.getCandidateById(id);
    }

    @Override
    public List<Candidate> findCandidatesByIdsAndAccountId(List<Long> candidateIds) {
        return candidateDaoImpl.findCandidatesByIdsAndAccountId(candidateIds);
    }
}
