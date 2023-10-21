package com.thuongmaidientu.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "createddate")
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "createdby")
	@CreatedBy
	private String createdBy;
	
	@Column(name = "modifieddate")
	@LastModifiedDate
	private Date modifieddate;
	
	@Column(name = "modifiedby")
	@LastModifiedBy
	private String modifiedBy;
	
	public Integer getId() {
		return id;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public Date getModifieddate() {
		return modifieddate;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}
}