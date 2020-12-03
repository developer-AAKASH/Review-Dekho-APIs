package com.reviewdekho.categoery.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="category_master")
public class Category {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Integer category_id;
	private String category_name;
	@Temporal(TemporalType.TIMESTAMP)
	private Date category_created_at;
	@Temporal(TemporalType.TIMESTAMP)
	private Date category_updated_at;

	private String categoryCreatedAt;
	private String categoryUpdatedAt;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	
	public Category() {}
	
	public Category(Integer category_id, String category_name, Date category_created_at,
			Date category_updated_at) {
		super();
		this.category_id = category_id;
		this.category_name = category_name;
		this.category_created_at = category_created_at;
		this.category_updated_at = category_updated_at;
	}
	
	public Integer getCategory_id() {
		return category_id;
	}
	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Date getCategory_created_at() {
		return category_created_at;
	}
	public void setCategory_created_at(Timestamp category_created_at) {
		this.category_created_at = category_created_at;
	}
	public Date getCategory_updated_at() {
		return category_updated_at;
	}
	public void setCategory_updated_at(Timestamp category_updated_at) {
		this.category_updated_at = category_updated_at;
	}
	
}
