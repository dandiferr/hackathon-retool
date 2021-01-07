package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLResolver
import com.hackathon.retool.graphqlapi.db.models.Loan
import com.hackathon.retool.graphqlapi.db.models.User
import com.hackathon.retool.graphqlapi.db.repository.LoansRepository
import org.springframework.stereotype.Component

@Component
class UserResolver(var loansRepository: LoansRepository) : GraphQLResolver<User> {
    fun loans(user: User) : List<Loan>? {
        return loansRepository.findByUserId(user.id).toList()
    }
}