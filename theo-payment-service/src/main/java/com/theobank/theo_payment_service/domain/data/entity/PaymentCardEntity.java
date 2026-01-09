package com.theobank.theo_payment_service.domain.data.entity;

import com.theobank.theo_common_base.domain.data.enums.CardType;
import com.theobank.theo_common_base.domain.data.enums.OnUsType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "PAYMENT_CARD")
@Getter
@Setter
public class PaymentCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @Column(name = "CARD_TOKEN")
    private String cardToken;

    @Column(name = "CARD_FINGERPRINT")
    private String cardFingerprint;

    @Column(name = "MASKED_PAN")
    private String maskedPan;

    @Enumerated(EnumType.STRING)
    @Column(name = "CARD_TYPE")
    private CardType cardType; // VISA, MASTER, TROY...

    @Enumerated(EnumType.STRING)
    @Column(name = "ON_US_TYPE")
    private OnUsType onUsType;

    @Column(name = "CARD_BRAND")
    private String cardBrand; // Bonus, Maximum, etc.

    @Column(name = "CARD_BANK")
    private String cardBank;

    @Column(name = "BIN_NUMBER")
    private String binNumber;

    @Column(name = "LAST4")
    private String last4;

    @Column(name = "EXPIRY_MONTH")
    private Integer expiryMonth;

    @Column(name = "EXPIRY_YEAR")
    private Integer expiryYear;

    @Column(name = "HOLDER_NAME")
    private String holderName;

    @Column(name = "PROVIDER")
    private String provider;   // IYZICO, PAYTR, etc.

    @Column(name = "PROVIDER_RAW_REQUEST")
    private String providerRawRequest;

    @Column(name = "PROVIDER_RAW_RESPONSE")
    private String providerRawResponse;

    @Column(name = "IS_DEFAULT")
    private Boolean isDefault;

    @Column(name = "STATUS")
    private String status; // ACTIVE, INACTIVE, EXPIRED

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
