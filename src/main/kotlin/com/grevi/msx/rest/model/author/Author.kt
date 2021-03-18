package com.grevi.msx.rest.model.author

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.persistence.*

@Entity
@Table
data class Author(
    @Id @SequenceGenerator(
        name ="author_sequence",
        sequenceName = "author_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "author_sequence"
    )
    val id : Long? = null,
    val name : String,
    val hobby : String,
    val createdAt : String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))
)

data class AuthorRequest(
    val id : Long? = null,
    val name: String,
    val hobby : String
)
