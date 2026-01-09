package com.theobank.theo_payment_service.domain.data.entity;


import com.theobank.theo_payment_service.domain.data.enums.TransactionStatusType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

import java.time.LocalDateTime;

@Entity
@Table(name = "OPERATION_LOG")
@Getter
@Setter
public class OperationLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PAYMENT_ID")
    private Long paymentId;

    @Column(name = "REQUEST_DATA")
    private String requestData;

    @Column(name = "RESPONSE_DATA")
    private String responseData;

    @Column(name = "DEVICE_INFO")
    private String deviceInfo;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private TransactionStatusType transactionStatus;

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
