package model.dao;

import db.DB;
import model.dao.Impl.DepartmentDaoJDBC;
import model.dao.Impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerJDBC() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentJDBC() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}

}
