package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
//		System.out.println("=== TEST 1 : department insert ===");
//		Department newDepartment = 	new Department(null, "Toys");
//		departmentDao.insert(newDepartment);
//		System.out.println("Inserted! New id = " + newDepartment.getId());
		
//		System.out.println("\n=== TEST 2 : department findById ===");
//		Department department = departmentDao.findById(7);
//		System.out.println(department);
		
				
//		System.out.println("\n=== TEST 3 : department update ===");
//		Department department = departmentDao.findById(3);
//		department.setName("Toys");
//		departmentDao.update(department);
//		System.out.println("Update completed ");
		
//		System.out.println("\n=== TEST 4 : department delete ===");
//		System.out.println("Enter id for delete test: ");
//		int id = sc.nextInt();
//		
//		departmentDao.deleteById(id);
//		System.out.println("Delete completed!");
//		sc.close();
		
		System.out.println("\n=== TEST 5 : department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department department : list) {
			System.out.println(department);
		}
	}

}
