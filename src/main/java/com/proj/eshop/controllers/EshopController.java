package com.proj.eshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.eshop.model.Eshop;
import com.proj.eshop.services.EshopService;

@RestController
@RequestMapping("/")
public class EshopController {
	
	@Autowired
	EshopService eshopService;
	
	@PostMapping("/add")
	public void addProduct(@RequestBody Eshop eshop) {
		eshopService.addProduct(eshop);
	}
	
	@GetMapping("/list")
	public List<Eshop> getAllProduct(){
		return eshopService.getShopList();
	}
	
	@DeleteMapping("/remove/{id}")
	public String removeProdcut(@PathVariable(value = "id") Long id) {
		eshopService.removeEshopById(id);
		return "Deleted";
	}
	
	
	@PutMapping("/modify/{id}")
	public String modifiedProduct(@PathVariable (value = "id") Long id, @Validated @RequestBody Eshop eshop) {
		eshopService.modifyEshopById(id, eshop);
		return "Updated!";
	}
}
