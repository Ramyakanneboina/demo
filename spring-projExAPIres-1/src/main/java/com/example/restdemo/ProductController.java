package com.example.restdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController { 
	@PostMapping("/product")
	public String saveproduct(@RequestBody Product p)
	{
		System.out.println(p);
		return "product saved";
	}
	@GetMapping("/product/{pid}")
	public Product getproduct(@PathVariable Integer pid)
	{
		Product p=null;
		if(pid==100)
		{
			Product p= new Product(100,"mouse",500.0);
		}
		else if(pid==101)
		{
			p=new Product(101,"HD",330.0);
		} 
		return p;
		
	}

}
