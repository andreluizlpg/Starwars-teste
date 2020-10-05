package com.apirest.Starwars.service;

import com.apirest.Starwars.model.Planeta;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface PlanetaService {

    Flux<Planeta> findAll();
    Mono<Planeta> findById(String id);
    Mono<Planeta> save(Planeta planeta);
    Mono<Planeta> findByName(String nome);
    Mono<Void> delete(String id);
    Mono<String> findAllByApi();

}
