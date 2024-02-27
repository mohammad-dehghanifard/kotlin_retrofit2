package ir.dehghanifard.kotlin_retrofit2.backend.response

class ServiceResponse<T>(
    val data : List<T>?,
    val status: String?,
    val message: String?,
    val totalCount: Long?
)