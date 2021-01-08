package com.hackathon.retool.graphqlapi.input

data class MerchantInput(
    val merchantName: String,
    val website: String,
    val affirmTxnFee: Double,
    val integrationType: String,
    val integrationChannel: String,
    val adminName: String,
    val adminEmail: String,
    val adminPhone: String,
    val fraudName: String,
    val fraudEmail: String,
    val fraudPhone: String,
)
