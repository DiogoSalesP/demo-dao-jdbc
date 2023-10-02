package application;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Progrm {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Books");

		System.out.println(department);
		
		Seller seller = new Seller(11, "Diogo", "diogo@sales.com", new Date(), 6000.0, department);
		
		System.out.println(seller);
	}

}
