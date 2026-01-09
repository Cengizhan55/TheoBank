package com.theobank.theo_customer_service.domain.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;


@Entity
@Table(name = "CUSTOMER_ADDRESS")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerAddress {

    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    private CustomerEntity customer;

    @Column(name = "TITLE")
    private String title; // Home,Company,Village ..

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "STREET")
    private String street;

    @Column(name = "ZIP_CODE", length = 10)
    private String zipCode;

    @Column(name = "IS_DEFAULT")
    private boolean isDefault;

    @CreatedDate
    @Column(name = "CREATED_AT", updatable = false)
    private LocalDateTime createdAt;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;
}
