package com.grevi.msx.rest.controller

import com.grevi.msx.rest.config.ApiResponse
import com.grevi.msx.rest.model.author.Author
import com.grevi.msx.rest.model.author.AuthorRequest
import com.grevi.msx.rest.services.AuthorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/author")
class AuthorController @Autowired constructor(private val authorService: AuthorService) {

    @GetMapping(produces = ["application/json"])
    fun getAuthors() : ApiResponse<List<Author>> {
        return ApiResponse(200,true,authorService.getAuthorServices())
    }

    @PostMapping(produces = ["application/json"])
    fun createAuthor(body : AuthorRequest) : ApiResponse<Author> {
        return ApiResponse(200,true,authorService.createAuthor(body))
    }

    @PutMapping( "/{id}",produces = ["application/json"])
    fun updateAuthor(body: AuthorRequest, id: Long) : ApiResponse<Author> {
        return ApiResponse(200, true, authorService.updateAuthor(body, id))
    }

    @DeleteMapping("/{id}",produces = ["application/json"])
    fun deleteAuthor(id : Long) : ApiResponse<Unit> {
        return ApiResponse(200, true, authorService.deleteAuthor(id))
    }

}