package com.jotace.companies.domain.entity;

import com.jotace.companies.domain.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
public class User {

    private UUID id;
    private String nome;
    private String email;
    private String senha;
    private UserRole role;
    private Company empresa;
    private List<Appointment> agendamentos;

}