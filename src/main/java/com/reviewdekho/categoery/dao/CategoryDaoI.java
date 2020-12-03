package com.reviewdekho.categoery.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reviewdekho.categoery.model.Category;

public interface CategoryDaoI extends JpaRepository<Category, Integer> {

//	public void add( Category category );
//	
//	public List<Category> get();
//	
//	public Category getById();
//	
//	public void update( Category category, Integer categoey_id );
//	
//	public void delete( Integer categoey_id );
}
