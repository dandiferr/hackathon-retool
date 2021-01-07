package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.hackathon.retool.graphqlapi.db.models.Loan
import com.hackathon.retool.graphqlapi.db.models.User
import com.hackathon.retool.graphqlapi.db.repository.LoansRepository
import com.hackathon.retool.graphqlapi.db.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class LoanQueryResolver @Autowired constructor(val repository: LoansRepository) : GraphQLQueryResolver {
    fun getLoanById(id: Int) : Loan? {
        return repository.findById(id).orElse(null)
    }

    fun getLoanByAri(ari: String) : Loan? {
        return repository.findByAri(ari)
    }
}