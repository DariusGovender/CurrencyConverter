package com.example.currencyconverter.models

data class Rate(
    val currency_name: String,
    val rate: String,
    val rate_for_amount: String
)
