package com.niraj.ProductManager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/list")
	public List<Product> listProduct() {
		return service.listAll();
	}
	
	@PostMapping("/addProduct")
		public Product addProduct(Product product) {
			return service.save(product);
		}
	
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable(name="id") int id){
		return service.get(id);
	}
	
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable(name="id")Integer id) {
		service.delete(id);
	return "product deleted";
	}
	
	
	@PutMapping("/updateProduct")
	public Product updateProduct(Product product) {
		return service.save(product);
	}
}
	

