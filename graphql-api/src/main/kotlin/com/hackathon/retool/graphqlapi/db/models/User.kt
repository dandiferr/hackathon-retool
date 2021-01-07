package com.hackathon.retool.graphqlapi.db.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User {
    @Id var id: Int = -1
    var ari: String = ""
    var first_name: String = ""
    var last_name: String = ""
    var email: String = ""
    var phone: String = ""
    var status: String = ""
}
