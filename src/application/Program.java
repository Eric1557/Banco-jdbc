package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department department = new Department(1,"Books");
		
		Seller seller = new Seller(1," Eric Bastos Barbosa ", " eric@gmail.com ",new Date(),2.000,department);
		
		SellerDao sellerDao = DaoFactory.createSellerJDBC();
	
	   System.out.println(sellerDao);
	
       System.out.println(seller);
		
	}

}
