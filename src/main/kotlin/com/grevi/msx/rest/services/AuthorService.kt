package com.grevi.msx.rest.services

import com.grevi.msx.rest.model.author.Author
import com.grevi.msx.rest.model.author.AuthorRequest

interface AuthorService {
    fun createAuthor(authorRequest: AuthorRequest) : Author
    fun getAuthorServices() : List<Author>
    fun updateAuthor(authorRequest: AuthorRequest, id: Long) : Author
    fun deleteAuthor(id : Long)
}