package com.company.sales.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "SALES_CUSTOMER")
@Entity(name = "sales_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -6018518150505269719L;

    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Column(name = "EMAIL", length = 100)
    protected String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}