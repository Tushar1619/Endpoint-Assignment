package com.example.firstEndpoint.firstEndpoint.dao.impl;

import com.example.firstEndpoint.firstEndpoint.dao.CandidateDAO;
import com.example.firstEndpoint.firstEndpoint.entity.Candidate;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CandidateDaoImpl implements CandidateDAO {

    private EntityManager entityManager;

    @Autowired
    public CandidateDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    public Candidate getCandidateById(Long id) {
        return entityManager.find(Candidate.class,id);
    }

    @Override
    public List<Candidate> findCandidatesByIdsAndAccountId(List<Long> candidateIds) {
        String queryStr = "SELECT "
                + "tblcandidate.*, "
                + "candidate_id AS candidateid, "
                + "slug AS candidateslug, "
                + "profilepic AS profilepicUrl, "
                + "CONCAT(COALESCE(firstname, ''), ' ', COALESCE(lastname, '')) AS candidatename "
                + "FROM "
                + "tblcandidate "
                + "JOIN "
                + "candidate_custom_fields_t ON tblcandidate.id = candidate_custom_fields_t.candidate_id "
                + "WHERE "
                + "tblcandidate.id IN :candidateIds "
                + "ORDER BY "
                + "FIELD(tblcandidate.id, :candidateIds)";

        Query query = entityManager.createNativeQuery(queryStr, Candidate.class)
                .setParameter("candidateIds", candidateIds);

        return query.getResultList();
    }
}
