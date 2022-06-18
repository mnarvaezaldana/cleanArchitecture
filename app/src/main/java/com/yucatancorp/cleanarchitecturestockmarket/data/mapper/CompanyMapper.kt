package com.yucatancorp.cleanarchitecturestockmarket.data.mapper

import com.yucatancorp.cleanarchitecturestockmarket.data.local.CompanyListingEntity
import com.yucatancorp.cleanarchitecturestockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}


fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}