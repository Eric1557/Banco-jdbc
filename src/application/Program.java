package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
	  SellerDao sellerDao = DaoFactory.createSellerJDBC();
	  System.out.println("=== teste1 :seller FindByld ===");
	  Seller seller = sellerDao.FindByld(3);
	  System.out.println(seller);
	  
	  System.out.println("=== teste2 :seller FindByldDepartment ===");
	  Department department = new Department(2,null);
	  List<Seller> list = sellerDao.FindByldDepartment(department);
	  for(Seller obj : list) {
		  System.out.println(obj);
	  }

      
		
	}

}
