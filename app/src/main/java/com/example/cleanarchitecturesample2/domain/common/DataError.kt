package com.example.cleanarchitecturesample2.domain.common

sealed interface DataError : Error {
    enum class NetworkError : DataError {
        TIMEOUT,
        NO_INTERNET,
        REQUEST_ERROR,
        SERVER_ERROR,
        UNKNOWN,
    }

    enum class LocalError : DataError {
        TIMEOUT,
        OVER_CAPACITY,
    }
}
