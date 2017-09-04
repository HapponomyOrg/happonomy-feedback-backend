package com.happonomy.model;

import com.happonomy.common.enums.Status;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Organization Model maps with the database
 * Created by Kithmal on 9/4/17.
 */
@Entity
@Table(name = "hp_organization")
public class Organization {

    @Id
    @GeneratedValue
    @Column(name = "organization_id")
    private Long orgId;

    @Column(name = "organization_name")
    private String name;

    @Column(name = "organization_address")
    private String address;

    @Column(name = "organization_status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "created_datetime", nullable = false, updatable = false)
    @CreatedDate
    private Date createdDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }
}
