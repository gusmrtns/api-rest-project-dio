package me.dio.api_rest_project.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // unique number and not null
    @Column(unique = true, nullable = false)
    private String number;
    private String agency;

    // 13 digits and 2 decimal places
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;
    // 13 digits and 2 decimal places
    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal limit;

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
