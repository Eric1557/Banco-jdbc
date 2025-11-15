package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
	  SellerDao sellerDao = DaoFactory.createSellerJDBC();
	  System.out.println("=== teste1 :seller FindByld ===");
	  Seller seller = sellerDao.FindByld(3);
	  System.out.println(seller);
	
      
		
	}

}
