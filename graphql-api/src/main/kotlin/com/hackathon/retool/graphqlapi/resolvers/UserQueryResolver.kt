package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.hackathon.retool.graphqlapi.db.models.User
import com.hackathon.retool.graphqlapi.db.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserQueryResolver @Autowired constructor(val repository: UsersRepository) : GraphQLQueryResolver {

    fun getUserById(id: Int) : User? {
        return repository.findById(id).orElse(null)
    }

    fun searchUsers(query: String) : List<User>? {
        return repository.findByAriOrEmailOrPhone(query, query, query).toList()
    }
}