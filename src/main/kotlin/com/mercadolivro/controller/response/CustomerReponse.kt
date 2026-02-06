package com.mercadolivro.controller.response

import com.mercadolivro.enums.CustomerStatus
import javax.persistence.Column
import javax.persistence.EnumType
import javax.persistence.Enumerated

data class CustomerReponse(
    var id: Int? = null,
    var name: String,
    var email: String,
    var status: CustomerStatus
) {

}
