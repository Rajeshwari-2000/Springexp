package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addnewProduct();

	boolean removebyId(int pid);

	boolean updateById(int pid1, int qty, double price);

	Product getById(int pid2);

	List<Product> getAllProducts();

	List<Product> getByPrice(double price1);

	
}
