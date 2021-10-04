package com.hendisantika;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootTest
class SpringBootWebfluxOpenapiApplicationTests {

    @Test
    public void testMono() {
        Mono<?> monoString = Mono.just("Edannnnn")
                .then(Mono.error(new RuntimeException("Exception occured")))
                .log();
        monoString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
    }

    @Test
    public void testFlux() {
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "microservice")
                .concatWithValues("AWS")
                .concatWith(Flux.error(new RuntimeException("Exception occured in Flux")))
                .concatWithValues("cloud")
                .log();

        fluxString.subscribe(System.out::println, (e) -> System.out.println(e.getMessage()));
    }
}
