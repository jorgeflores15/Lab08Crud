package com.tecsup.lab08.crud.app;

import com.tecsup.lab08.crud.bean.Employee;
import com.tecsup.lab08.crud.dao.EmployeeDAO;
import com.tecsup.lab08.crud.dao.EmployeeDAOImpl;

public class Application {
	
	public static void main(String[] args) {
		Application ap = new Application();
		//ap.ejemploPorDefecto();
		ap.realizarPrueba();
	
	}
	public void ejemploPorDefecto(){
	
		EmployeeDAO dao = new EmployeeDAOImpl();
		int id = -1;
		//Create a new user register
		id = dao.create("Jorge", "Flores", (double) 1500,(int) 12);
		//Find the specific user
		Employee emp = dao.findById(id);
		System.out.println("Create .. " + emp);
		//Update the user
		dao.update(id, "Jorge", "Flores", (double) 1597,(int) 20);
		//Find the specific user
		emp = dao.findById(id);
		System.out.println("Update .. " + emp);
		//Delete the specific user
		emp = dao.findById(id);
		dao.delete(id);
		System.out.println("Delete .. " + emp);		
		//Show all the users
		for (Employee item : dao.findAll()) {	
			System.out.println(item);
		};	
	}
	
	public void realizarPrueba(){
		EmployeeDAO dao = new EmployeeDAOImpl();
		int id = -1;
		//Create a new user
		id = dao.create("Jorge", "Flores", (double) 1500,(int) 12);
		Employee emp = dao.findById(id);
		System.out.println("Create .. " + emp);
		//Update the new user
		dao.update(id, "Jorge", "Flores", (double) 1597,(int) 20);
		emp = dao.findById(id);
		System.out.println("Update .. " + emp);
	}

}
