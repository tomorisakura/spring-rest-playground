package com.grevi.msx.rest.repositories

import com.grevi.msx.rest.model.author.Author
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface AuthorRepository : JpaRepository<Author, Long> {

    @Query("SELECT a FROM Author a WHERE a.name = ?1")
    fun findAuthorByName(name: String): Optional<Author>

    @Query("UPDATE Author a SET a.name = ?1 , a.hobby =?1 WHERE a.id = ?1")
    fun updateAuthor(name : String, hobby : String, id : Long) : Optional<Author>
}