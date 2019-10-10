package com.j2ee.dao;

import java.util.List;

import com.j2ee.model.Product;

public interface ProductService {
	public List<Product> getProducts();
        public Product findProductById(int id);
        public List<Product> findByName(String name);
}
