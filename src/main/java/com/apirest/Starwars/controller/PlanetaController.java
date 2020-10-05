package com.apirest.Starwars.controller;


import com.apirest.Starwars.model.Planeta;
import com.apirest.Starwars.service.PlanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

import java.time.Duration;

//
@RestController
public class PlanetaController{

    @Autowired
    PlanetaService planetaService;

    @GetMapping(value="/planetas")
    public Flux<Planeta> getPlanetas(){
        return planetaService.findAll();
    }

    @GetMapping(value="/planeta/{id}")
    public Mono<Planeta> getPlanetaById(@PathVariable String id){
        return planetaService.findById(id);
    }

    @PostMapping(value="planeta")
    public Mono<Planeta> save(@RequestBody Planeta planeta){
        return planetaService.save(planeta);
    }

    @GetMapping(value = "/planetaName/{nome}")
    public Mono<Planeta> getPlanetaByName(@PathVariable String nome){
        return planetaService.findByName(nome);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") String id) {
        planetaService.delete(id);
    }

    @GetMapping(value="/planeta/events", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tuple2<Long, Planeta>> getPlanetasByWebflux(){
        Flux<Long> interval = Flux.interval(Duration.ofSeconds(10));
        Flux<Planeta> planetFlux = planetaService.findAll();
        return Flux.zip(interval, planetFlux);
    }

    @GetMapping(value="/planetaApi")
    public Mono<String> getPlanetasByApi(){
        return planetaService.findAllByApi();
    }

}
