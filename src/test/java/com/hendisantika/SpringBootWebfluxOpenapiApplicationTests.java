package com.hendisantika;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
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

}
