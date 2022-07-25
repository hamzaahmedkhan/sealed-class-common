package com.github.hamzaahmedkhan.sealed_common_sdk

sealed class ProfileType{
    object Idle : ProfileType()
    object Loading : ProfileType()
    data class ProfileError(val errorMessage: String = "") : ProfileType()
    object ProfileSuccess : ProfileType()
    object ProfileDeleted : ProfileType()
    object ProfileUpdated : ProfileType()
}