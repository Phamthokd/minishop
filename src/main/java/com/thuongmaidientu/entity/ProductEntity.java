package com.thuongmaidientu.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private Integer price;
	
	@Column(name = "discount")
	private Integer discount;
	
	@Column(name = "shortdescription",columnDefinition = "TEXT")
	private String shortDescription;
	
	@Column(name = "description",columnDefinition = "TEXT")
	private String description;
	
	@Column(name="quantity")
	private Integer quantity;
	
	@Column(name = "purchases")
	private Integer purchases;
	
	@Column(name = "image1")
	private String image1;
	
	@Column(name = "image2")
	private String image2;
	
	@Column(name = "image3")
	private String image3;
	
	@Column(name = "image4")
	private String image4;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;
	
	@OneToMany(mappedBy="product")
	private List<OrderDetailEntity> orderDetail = new ArrayList<>();
	

	
	
	public List<OrderDetailEntity> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetailEntity> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPurchases() {
		return purchases;
	}

	public void setPurchases(Integer purchases) {
		this.purchases = purchases;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	
	
}
