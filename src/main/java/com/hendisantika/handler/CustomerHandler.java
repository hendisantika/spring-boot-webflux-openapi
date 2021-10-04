package com.hendisantika.handler;

import com.hendisantika.dto.Customer;
import com.hendisantika.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
 * Time: 08.17
 */
@Service
public class CustomerHandler {

    @Autowired
    private CustomerRepository customerRepository;

    public Mono<ServerResponse> loadCustomers(ServerRequest request) {
        Flux<Customer> customerList = customerRepository.getCustomerList();
        return ServerResponse.ok().body(customerList, Customer.class);
    }

}
