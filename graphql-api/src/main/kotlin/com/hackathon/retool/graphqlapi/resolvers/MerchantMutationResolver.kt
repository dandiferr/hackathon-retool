package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.hackathon.retool.graphqlapi.db.models.Merchant
import com.hackathon.retool.graphqlapi.db.repository.MerchantsRepository
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
}