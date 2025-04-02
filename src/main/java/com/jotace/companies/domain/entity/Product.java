package com.jotace.companies.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity(name = "product")
@Table(name = "product")
@Getter
@Setter
public class Product {
    private UUID id;
    private String name;
    private String code;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;
    private String category;

    private Company company;
    private List<StockMovement> movements;
}
