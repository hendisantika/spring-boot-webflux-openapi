package com.hendisantika.handler;

import com.hendisantika.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
