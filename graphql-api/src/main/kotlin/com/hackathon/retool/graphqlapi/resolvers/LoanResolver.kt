package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.hackathon.retool.graphqlapi.db.models.Loan
import com.hackathon.retool.graphqlapi.db.repository.LoansRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class LoanResolver @Autowired constructor(val repository: LoansRepository) : GraphQLQueryResolver {
    fun loans(id: Int) : Loan? {
        return repository.findById(id).orElse(null)
    }
}