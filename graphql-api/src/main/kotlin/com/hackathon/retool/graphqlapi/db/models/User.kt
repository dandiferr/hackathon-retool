package com.hackathon.retool.graphqlapi.db.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User (
    @Id var id: Int,
    var ari: String,
    var firstName: String,
    var lastName: String,
    var email: String,
    var phone: String
)
