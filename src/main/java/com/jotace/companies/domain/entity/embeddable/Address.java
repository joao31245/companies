package com.jotace.companies.domain.entity.embeddable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;
}
