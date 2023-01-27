package com.proj.eshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.eshop.model.Eshop;
import com.proj.eshop.repository.EshopRepository;

@Service
public class EshopService {
	
	@Autowired
	EshopRepository eshopRepository;

	public void addProduct(Eshop eshop) {
		eshopRepository.save(eshop);
	}
	public List<Eshop> getShopList(){
		return eshopRepository.findAll();
	}
	
	public void removeEshopById(Long id) {		
		eshopRepository.deleteById(id);
	}
	

	public void modifyEshopById(Long id, Eshop eshop) {
		Optional<Eshop> eshopOpt = eshopRepository.findById(id);
		Eshop eshopDB = eshopOpt.get();
		eshopDB.setOrderId(eshop.getOrderId() != null ? eshop.getOrderId():eshopDB.getOrderId());
		eshopDB.setProductId(eshop.getProductId() != null ? eshop.getProductId():eshopDB.getProductId() );
		eshopDB.setStockId(eshop.getStockId() != null ? eshop.getStockId() : eshopDB.getStockId());
		eshopRepository.save(eshopDB);
	}
}
