package com.hackathon.retool.graphqlapi.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.hackathon.retool.graphqlapi.db.models.Merchant
import com.hackathon.retool.graphqlapi.db.repository.MerchantsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MerchantQueryResolver @Autowired constructor(val repository: MerchantsRepository) : GraphQLQueryResolver {
    fun getMerchantById(id: Int) : Merchant? {
        return repository.findById(id).orElse(null)
    }

    fun getMerchantByAri(ari: String) : Merchant? {
        return repository.findByAri(ari)
    }

    fun searchMerchants(query: String) : List<Merchant>? {
        return repository.findByAriOrWebsiteOrMerchantName(query, query, query).toList()
    }
}