package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.hackathon.retool.graphqlapi.db.models.Merchant
import com.hackathon.retool.graphqlapi.db.repository.MerchantsRepository
import com.hackathon.retool.graphqlapi.input.MerchantInput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MerchantMutationResolver @Autowired constructor(val repository: MerchantsRepository) : GraphQLMutationResolver {
    fun createMerchant() : Merchant {
        val ari = String.format("MERCHANT-%04d", (0..10000).random())
        val merchant = Merchant()
        merchant.ari = ari
        repository.save(merchant)
        return merchant
    }

    fun updateMerchant(ari: String, input: MerchantInput) : Merchant? {
        val merchant: Merchant = repository.findByAri(ari) ?: return null
        merchant.merchantName = input.merchantName
        merchant.website = input.website
        merchant.affirmTxnFee = input.affirmTxnFee
        merchant.integrationType = input.integrationType
        merchant.integrationChannel = input.integrationChannel
        merchant.adminName = input.adminName
        merchant.adminEmail = input.adminEmail
        merchant.adminPhone = input.adminPhone
        merchant.fraudName = input.fraudName
        merchant.fraudEmail = input.fraudEmail
        merchant.fraudPhone = input.fraudPhone
        repository.save(merchant)
        return merchant
    }
}
