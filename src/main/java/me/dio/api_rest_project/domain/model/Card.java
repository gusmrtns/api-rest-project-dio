package me.dio.api_rest_project.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // unique number and not null
    @Column(unique = true, nullable = false)
    private String number;
    // 13 digits and 2 decimal places
    @Column(name = "adicional_limit", scale = 13, precision = 2)
    private BigDecimal limit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
