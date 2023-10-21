package com.thuongmaidientu.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "oder")
public class OrderEntity extends BaseEntity {
	@Column(name = "totalamount")
	private Integer totalAmount;
	
	@OneToMany(mappedBy="order")
	private List<OrderDetailEntity> orderDetail = new ArrayList<>();

	public Integer getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Integer totalAmount) {
		this.totalAmount = totalAmount;
	}

	public List<OrderDetailEntity> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
		this.orderDetail = orderDetail;
	}
	
	
}
