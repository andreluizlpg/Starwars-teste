package com.apirest.Starwars.repository;

import com.apirest.Starwars.model.Planeta;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface PlanetaRepository extends ReactiveMongoRepository<Planeta,String> {

    @Query("{ 'nome' : ?0 }")
    Mono<Planeta> findByName(final String nome);
}
