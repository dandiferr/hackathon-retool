package com.hackathon.retool.graphqlapi.db.repository

import com.hackathon.retool.graphqlapi.db.models.Merchant
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MerchantsRepository : CrudRepository<Merchant, Int> {
    fun findByAri(ari: String) : Merchant?
    fun findByAriOrWebsiteOrMerchantName(ari: String, website: String, merchantName: String) : Iterable<Merchant>
}