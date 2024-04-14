package com.example.firstEndpoint.firstEndpoint.requestBody;

import java.util.List;

public class CandidateRequest {

    private List<Long> candidateIds;

    public CandidateRequest(){

    }

    public CandidateRequest(List<Long> candidateIds) {
        this.candidateIds = candidateIds;
    }

    public List<Long> getCandidateIds() {
        return candidateIds;
    }

    public void setCandidateIds(List<Long> candidateIds) {
        this.candidateIds = candidateIds;
    }
}
