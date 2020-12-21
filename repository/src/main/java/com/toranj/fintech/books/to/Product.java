package com.toranj.fintech.books.to;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
