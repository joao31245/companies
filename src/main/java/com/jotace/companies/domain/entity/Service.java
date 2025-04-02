package com.jotace.companies.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity(name = "service")
@Table(name = "service")
@Getter
@Setter
public class Service {

    private UUID id;

    private String name;

    private String description;

    private BigDecimal value;

    private Integer durationMinutes;

    private String category;

    private boolean available;

    private Company company;

    private List<Appointment> appointments;

}
