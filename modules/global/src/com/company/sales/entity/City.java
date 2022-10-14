package com.company.sales.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "SALES_CITY")
@Entity(name = "sales_City")
@NamePattern("%s|name")
public class City extends StandardEntity {
    private static final long serialVersionUID = 8967926253253479965L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotNull
    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    private BigDecimal phone_number;

    public BigDecimal getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(BigDecimal phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}