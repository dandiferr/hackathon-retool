package com.hackathon.retool.graphqlapi.db.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "merchants")
class Merchant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Int = -1
    var ari: String = ""
    @Column(name="merchant_name")
    var merchantName: String? = ""
    var website: String? = ""
    @Column(name="affirm_txn_fee")
    var affirmTxnFee: Double? = 0.00
    @Column(name="integration_type")
    var integrationType: String? = ""
    @Column(name="integration_channel")
    var integrationChannel: String? = ""
    @Column(name="admin_name")
    var adminName: String? = ""
    @Column(name="admin_email")
    var adminEmail: String? = ""
    @Column(name="admin_phone")
    var adminPhone: String? = ""
    @Column(name="fraud_name")
    var fraudName: String? = ""
    @Column(name="fraud_email")
    var fraudEmail: String? = ""
    @Column(name="fraud_phone")
    var fraudPhone: String? = ""
}
