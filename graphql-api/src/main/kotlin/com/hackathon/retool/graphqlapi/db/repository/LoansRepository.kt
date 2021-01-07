package com.hackathon.retool.graphqlapi.db.repository

import com.hackathon.retool.graphqlapi.db.models.Loan
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LoansRepository : CrudRepository<Loan, Int> {
    fun findByAri(ari: String) : Loan?
    fun findByUserId(userId: Int) : Iterable<Loan>
}