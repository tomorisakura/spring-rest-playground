package com.grevi.msx.rest.helper

import com.grevi.msx.rest.model.author.Author
import com.grevi.msx.rest.model.author.AuthorRequest

interface ModelMapper  {
    fun authorRequestToModel(request: AuthorRequest) : Author
}