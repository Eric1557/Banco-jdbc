package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); 
	void update(Seller obj);
	void deleteByld(Integer id);
	Seller FindByld(Integer id);
	List<Seller> findAll();
	

}
