package com.hackathon.retool.graphqlapi.db.repository

import com.hackathon.retool.graphqlapi.db.models.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UsersRepository : CrudRepository<User, Int> {
    fun findByAriOrEmailOrPhone(ari: String, email: String, phone: String) : Iterable<User>
}
