package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerJDBC();
		System.out.println("\n === teste1 :seller FindByld() === \n");

		Seller seller = sellerDao.FindByld(3);
		System.out.println(seller);

		System.out.println("\n === teste2 :seller FindByldDepartment() === \n");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.FindByldDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n === teste3 :seller FindALL() === \n");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}

	}

}
