package com.grevi.msx.rest.helper

import com.grevi.msx.rest.model.author.Author
import com.grevi.msx.rest.model.author.AuthorRequest
import org.springframework.stereotype.Component

@Component
class ModelMapperImpl : ModelMapper {
    override fun authorRequestToModel(request: AuthorRequest): Author {
        return Author(
            id = request.id,
            name = request.name,
            hobby = request.hobby
        )
    }
}