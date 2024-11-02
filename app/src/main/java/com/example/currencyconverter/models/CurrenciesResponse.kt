package com.example.currencyconverter.models

data class CurrenciesResponse(
    val status: String,
    val currencies: Map<String, String>
)
