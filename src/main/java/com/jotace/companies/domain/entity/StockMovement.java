package com.jotace.companies.domain.entity;

import com.jotace.companies.domain.enums.MovementType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "stock_movement")
@Table(name = "stock_movement")
@Getter
@Setter
public class StockMovement {
    private UUID id;
    private MovementType type;
    private Integer quantity;
    private LocalDateTime date;
    private Product product;
    private User responsible;

}
