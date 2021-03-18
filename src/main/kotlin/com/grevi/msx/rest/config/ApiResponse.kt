package com.grevi.msx.rest.config

data class ApiResponse<T>(
    val code : Long,
    val status : Boolean,
    val result : T
)
