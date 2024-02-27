package ir.dehghanifard.kotlin_retrofit2.backend.response

class ServiceResponse<T>(
    var data : List<T>? = null,
    var status: String? = null,
    var message: String? = null,
    var totalCount: Long? = null
)