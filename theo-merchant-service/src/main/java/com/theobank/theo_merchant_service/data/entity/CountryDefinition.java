package com.theobank.theo_merchant_service.data.entity;

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
@Table(name = "COUNTRY_DEFINITION")
@Getter
@Setter
@FilterDef(name = "activeFilter", parameters = {  // soft delete
        @ParamDef(name = "activeStatus", type = Boolean.class)
})
@Filter(name = "activeFilter", condition = "status = :activeStatus")
public class CountryDefinition {

    @Id
    @Column(name = "ID")
    private Long id;

    @Id
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    @Column(name = "STATUS")
    private Boolean status;


    @CreatedDate
    private LocalDateTime createDate;

    @CreatedBy
    private String createdBy;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;


    @LastModifiedBy
    private String lastModifiedBy;

}
