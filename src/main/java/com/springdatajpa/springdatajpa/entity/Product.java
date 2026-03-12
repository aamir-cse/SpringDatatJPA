package com.springdatajpa.springdatajpa.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
		name = "tbl_product", 
		
		uniqueConstraints = {
		@UniqueConstraint
		(
				name = "sku_unique", 
				columnNames = "stock_keeping_unit"
		)
})

public class Product {

	@Id
	private Long id;
	@Column(name="stock_keeping_unit" , nullable = false)
	private String sku;
	@Column(nullable=false)
	private String name;
	private String description;
	private BigDecimal price;
	private boolean active;
	private String imageUrl;
	private LocalDateTime dateCreated;
	private LocalDateTime lastUpdated;

}
