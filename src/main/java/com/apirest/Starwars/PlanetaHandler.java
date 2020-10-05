//package com.apirest.Starwars;
//
//
//
//import com.apirest.Starwars.model.Planeta;
//import com.apirest.Starwars.service.PlanetaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
//import static org.springframework.web.reactive.function.server.ServerResponse.ok;
//import static org.springframework.web.reactive.function.BodyInserters.fromPublisher;
//
//
////@Component
//public class PlanetaHandler {
//
//    @Autowired
//    PlanetaService planetaService;
//
//    public Mono<ServerResponse> findAll(ServerRequest serverRequest){
//        return ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(planetaService.findAll(), Planeta.class);
//    }
//
//    public Mono<ServerResponse> findById(ServerRequest serverRequest){
//        int id = serverRequest.pathVariable("id");
//        return ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(planetaService.findById(id), Planeta.class);
//    }
//
//    public Mono<ServerResponse> save(ServerRequest request){
//        final Mono<Planeta> playlist = request.bodyToMono(Planeta.class);
//        return ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(fromPublisher(playlist.flatMap(planetaService::save), Planeta.class));
//    }
//
//}
