package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.Impl.DepartmentDaoJDBC;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		DepartmentDao departmentDao = DaoFactory.createDepartmentJDBC();
		System.out.println("\n === TESTE 1 :department FindByld() === \n");
		Department department = departmentDao.FindByld(1);
		System.out.println(department);
		System.out.println("============================================");
		System.out.println("\n === TESTE 2 :department FindAll() === \n");
		List<Department> list = departmentDao.findAll();
		
		for(Department obj :list) {
			System.out.println(obj);
		}
		System.out.println("\n === TESTE 3 :department Insert() === \n");
		Department department2 = new Department(null,"Eric");
		departmentDao.insert(department2);
		System.out.println("Inserted ! new id : " + department2.getId() );

		

		

		
		
		
		sc.close();

	}

}
