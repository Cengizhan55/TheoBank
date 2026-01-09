package com.theobank.theo_merchant_service.data.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "MERCHANT")
@Getter
@Setter
@FilterDef(name = "activeFilter", parameters = {
        @ParamDef(name = "activeStatus", type = Boolean.class)
})
@Filter(name = "activeFilter", condition = "IS_ACTIVE = :activeStatus")
public class MerchantEntity {

    @Id
    private Long id;

    @Column(name = "MEMBER_NO")
    private Long member_no;

    @Column(name = "MEMBER_TYPE")
    private String  member_type;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CHAIN_CODE")
    private Long chainCode;

    @Column(name = "CONTRACT_NUMBER")
    private String contractNumber;

    @Column(name = "APPLICATION_STATUS")
    private Boolean applicationStatus;

    @Column(name = "BRANCH")
    private String branch;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_NO", referencedColumnName = "MEMBER_NO", insertable = false, updatable = false)
    private MerchantAddressEntity merchantAddressEntity;

    @CreatedDate
    private LocalDateTime createDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @LastModifiedBy
    private String lastModifiedBy;
}
