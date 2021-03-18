package com.grevi.msx.rest.model.article

import com.grevi.msx.rest.model.student.Student
import java.time.LocalDate

data class Article(
    val id : Long? = null,
    val title : String,
    val content : String,
    val author : Student,
    val createdAt : LocalDate = LocalDate.now()
)
