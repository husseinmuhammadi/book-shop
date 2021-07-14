package com.toranj.fintech.books.repository;

import com.toranj.fintech.books.to.Product;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.Arrays;

import static org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace.*;


@DataJpaTest
@AutoConfigureTestDatabase(replace = ANY)
class ProductRepositoryIntegrationTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    private ApplicationContext context;

    @Test
    void given_when_then() {
        // List<Products> products = productRepository.findAll();

        Arrays.stream(context.getBeanDefinitionNames()).map(bean->">>>"+bean).forEach(System.out::println);

        productRepository.findAll();

    }
}