package application;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Progrm {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Books");

		System.out.println(department);
		
		Seller seller = new Seller(11, "Diogo", "diogo@sales.com", new Date(), 6000.0, department);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println(sellerDao);
		System.out.println(seller);
	}

}
