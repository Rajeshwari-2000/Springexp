package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	void saveProduct(Product p);

	boolean deleteById(int pid);

	boolean modifyById(int pid1, int qty, double price);

	Product FindById(int pid2);

	List<Product> FindAll();

	List<Product> FindByPrice(double price1);

}
