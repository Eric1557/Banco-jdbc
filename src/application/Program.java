package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerJDBC();
		System.out.println("\n === TESTE 1 :seller FindByld() === \n");

		Seller seller = sellerDao.FindByld(3);
		System.out.println(seller);

		System.out.println("\n === TESTE 2 :seller FindByldDepartment() === \n");

		Department department = new Department(2, null);
		List<Seller> list = sellerDao.FindByldDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n === TESTE 3 :seller FindALL() === \n");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n === TESTE 4 :seller Insert() === \n");
		Seller newSeller = new Seller(null, "Eric ", "eric@gmail.com ", new Date(), 2500.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted ! new id = " + newSeller.getId());

		System.out.println("\n === TEST 5 :seller Update() === \n");
		seller = sellerDao.FindByld(2);
		seller.setName("Eric Bastos");
		sellerDao.update(seller);
		System.out.println("Update complete !");

		System.out.println("\n === TEST 6 :seller Update() === \n");
		System.out.println("enter Id for deleted test : ");
		int id = sc.nextInt();
		sellerDao.deleteByld(id);
		System.out.println("Deleted Completed");

		sc.close();

	}

}
