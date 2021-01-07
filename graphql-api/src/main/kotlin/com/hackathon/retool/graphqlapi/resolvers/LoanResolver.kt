package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLResolver
import com.hackathon.retool.graphqlapi.db.models.Loan
import com.hackathon.retool.graphqlapi.db.models.User
import com.hackathon.retool.graphqlapi.db.repository.UsersRepository
import org.springframework.stereotype.Component

@Component
class LoanResolver(var usersRepository: UsersRepository) : GraphQLResolver<Loan> {
    fun user(loan: Loan) : User? {
        return usersRepository.findById(loan.userId).orElse(null)
    }
}