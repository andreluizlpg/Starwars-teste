//package com.apirest.Starwars;
//
//import com.apirest.Starwars.model.Planeta;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import static org.springframework.web.reactive.function.server.RequestPredicates.*;
//
////import java.awt.*;
//
////@Configuration
//public class PlanetaRouter {
//
//    @Bean
//    public RouterFunction<ServerResponse> route(PlanetaHandler handler){
//        return RouterFunctions
//                .route(GET("/planetas").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
//                .andRoute(GET("/planeta/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
//                .andRoute(POST("/planeta").and(accept(MediaType.APPLICATION_JSON)), handler::save);
//
//    }
//
//
//
//
//
//}
