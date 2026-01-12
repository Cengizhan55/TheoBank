package com.theobank.theo_merchant_service.domain.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "MERCHANT_ADDRESS")
@Getter
@Setter
@FilterDef(name = "activeFilter", parameters = {
        @ParamDef(name = "activeStatus", type = Boolean.class)
})
@Filter(name = "activeFilter", condition = "status = :activeStatus")
public class MerchantAddressEntity {

    @Id
    @Column(name = "MEMBER_NO")
    private Long memberNo;

    @Column(name = "STATUS")
    private Boolean status;

    @Column(name = "ADDRESS_LINE")
    private String addressLine;

    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @CreatedDate
    private LocalDateTime createDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;


    @LastModifiedBy
    private String lastModifiedBy;


}
