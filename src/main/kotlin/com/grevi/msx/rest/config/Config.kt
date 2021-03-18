package com.grevi.msx.rest.config

import com.grevi.msx.rest.model.author.Author
import com.grevi.msx.rest.repositories.AuthorRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {

    /**
     * testing orm
     * */

    @Bean
    fun commandLineAuthorRunner(authorRepository: AuthorRepository) : CommandLineRunner {
        return CommandLineRunner {
            val kyoko = Author(name = "kyoko", hobby = "Reading")
            val grevi = Author(name = "grevi", hobby = "Writing")
            authorRepository.saveAll(listOf(kyoko, grevi))
        }
    }
}