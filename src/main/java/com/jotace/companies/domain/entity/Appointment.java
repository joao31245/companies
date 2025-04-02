package com.jotace.companies.domain.entity;

import com.jotace.companies.domain.enums.AppointmentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "appointment")
@Table(name = "appointment")
@Getter
@Setter
public class Appointment {

    private UUID id;
    private LocalDateTime appointmentTime;
    private AppointmentStatus status;
    private Integer rate;

    private User costumer;
    private Service service;
    private Company company;
}
