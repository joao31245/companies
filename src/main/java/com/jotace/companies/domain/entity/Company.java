package com.jotace.companies.domain.entity;

import com.jotace.companies.domain.entity.embeddable.Address;
import com.jotace.companies.domain.enums.BusinessType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Entity(name = "company")
@Table(name = "company")
@Getter
@Setter
public class Company {
    private UUID id;
    private String name;
    private String cnpj;
    private String phone;
    private BusinessType businessType;
    private Address address;
    private boolean active;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // Relacionamentos
    private List<Product> products;
    private List<Service> services;
    private List<User> owners;
}