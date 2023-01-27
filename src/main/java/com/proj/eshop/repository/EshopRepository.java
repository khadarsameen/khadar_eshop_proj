package com.proj.eshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.eshop.model.Eshop;

public interface EshopRepository extends MongoRepository<Eshop, Long>{

}
