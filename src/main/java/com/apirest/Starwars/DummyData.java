//package com.apirest.Starwars;
//
//import com.apirest.Starwars.model.Planeta;
//import com.apirest.Starwars.repository.PlanetaRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Flux;
//
//import java.util.UUID;
//
//@Component
//public class DummyData  implements CommandLineRunner {
//
//	private final PlanetaRepository planetaRepository;
//
//    DummyData(PlanetaRepository planetaRepository) {
//        this.planetaRepository = planetaRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        planetaRepository.deleteAll()
//                .thenMany(
//                        Flux.just("API REST Spring Boot", "Deploy de uma aplicação java no IBM Cloud", "Java 8",
//                                "Github", "Spring Security", "Web Service RESTFULL", "Bean no Spring Framework")
//                                .map(nome -> new Planeta(UUID.randomUUID().toString(), nome,"a","a"))
//                                .flatMap(planetaRepository::save))
//                .subscribe(System.out::println);
//    }
//
//
//}
