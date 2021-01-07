package com.hackathon.retool.graphqlapi.db.models

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "loans")
class Loan {
    @Id var id: Int = -1
    var ari: String = ""
    var apr: Float? = null
    var autopay: Boolean = false
    var merchant: String = ""
    var total_paid: Float? = null
    var total_remaining: Float? = null
    var purchase_total: Float? = null
    var monthly_amount: Float? = null
}