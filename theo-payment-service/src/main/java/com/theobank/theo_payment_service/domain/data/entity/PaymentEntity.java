package com.theobank.theo_payment_service.domain.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "PAYMENT")
@Getter
@Setter
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    // MERCHANT FK
    @Column(name = "MERCHANT_ID")
    private Long merchantId;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "PAYMENT_METHOD")
    private String paymentMethod;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "REFERENCE_NO")
    private String referenceNo;

    @CreatedDate
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @LastModifiedBy
    @Column(name = "UPDATED_BY")
    private String updatedBy;
}
