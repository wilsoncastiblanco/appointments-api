package com.servall.models

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String,
    val fullName: String,
    val password: String?,
    val userName: String,
    val role: Role
)
