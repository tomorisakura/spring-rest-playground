package com.grevi.msx.rest.services.impl

import com.grevi.msx.rest.helper.ModelMapper
import com.grevi.msx.rest.model.author.Author
import com.grevi.msx.rest.model.author.AuthorRequest
import com.grevi.msx.rest.repositories.AuthorRepository
import com.grevi.msx.rest.services.AuthorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.lang.IllegalStateException

@Service
class AuthorServiceImpl @Autowired constructor(private val authorRepository: AuthorRepository, private val modelMapper: ModelMapper) : AuthorService {
    override fun createAuthor(authorRequest: AuthorRequest) : Author {
        return modelMapper.authorRequestToModel(authorRequest).also {
            val name = authorRepository.findAuthorByName(it.name)
            if (name.isPresent) {
                throw IllegalStateException("name already exists")
            }
            authorRepository.save(it)
        }
    }

    override fun getAuthorServices(): List<Author> {
        return authorRepository.findAll()
    }

    override fun updateAuthor(authorRequest: AuthorRequest, id: Long): Author {
        return modelMapper.authorRequestToModel(authorRequest).also {
            authorRepository.updateAuthor(it.name, it.hobby, id)
        }
    }

    override fun deleteAuthor(id : Long) {
        return authorRepository.deleteById(id)
    }
}