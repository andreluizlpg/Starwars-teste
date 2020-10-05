package com.apirest.Starwars.service;

import com.apirest.Starwars.model.Planeta;
import com.apirest.Starwars.repository.PlanetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.LinkedHashMap;
import java.util.List;

@Service
public class PlanetaServiceImpl implements PlanetaService{

    @Autowired
    PlanetaRepository planetaRepository;

    private final WebClient webClient;


    PlanetaServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://swapi.dev/api").build();
    }

    @Override
    public Flux<Planeta> findAll() {
        return planetaRepository.findAll();
    }

    @Override
    public Mono<Planeta> findById(String id) {
        return planetaRepository.findById(String.valueOf(id));
    }

    @Override
    public Mono<Planeta> save(Planeta planeta) {
        return planetaRepository.save(planeta);
    }

    @Override
    public Mono<Planeta> findByName(String nome) {
        return planetaRepository.findByName(nome);
    }

    @Override
    public Mono<Void> delete(String id) {
        return planetaRepository.deleteById(String.valueOf(id));

    }

    public Mono<String> findAllByApi() {
        return this.webClient.get().uri("/planets/").retrieve().bodyToMono(String.class);
        //Gostaria de consultar todos os planetas, mas nao tenho experiencia suficiente para manejar a resposta e utilizar as proximas url's para juntar todos os planetas.
        //Espero poder conseguir essa vaga pois esse projeto basico me instigou muito sobre o web flux.
    }

}
