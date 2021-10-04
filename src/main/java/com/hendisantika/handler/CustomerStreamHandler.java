package com.hendisantika.handler;

import com.hendisantika.dto.Customer;
import com.hendisantika.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-webflux-openapi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/10/21
 * Time: 08.19
 */
@Service
public class CustomerStreamHandler {

    @Autowired
    private CustomerRepository customerRepository;


    public Mono<ServerResponse> getCustomers(ServerRequest request) {
        Flux<Customer> customersStream = customerRepository.getCustomersStream();
        return ServerResponse.ok().
                contentType(MediaType.TEXT_EVENT_STREAM)
                .body(customersStream, Customer.class);
    }
}
