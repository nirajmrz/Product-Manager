package com.niraj.ProductManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	
	public List<Product> listAll(){
		return repo.findAll();
	}
	
	public Product save(Product product) {
	return	repo.save(product);
	}
	
	public Product get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		 repo.deleteById(id);
	}
	
	public Product updateProduct(Product product) {
		return repo.save(product);
	}
}
