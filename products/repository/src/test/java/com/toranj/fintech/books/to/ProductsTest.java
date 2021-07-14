package com.toranj.fintech.books.to;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void givenProduct_whenInstantiateNewProduct_thenIdMustBeNull(){
        Product product = new Product();
        Assertions.assertThat(product.getId()).isNull();
    }

}