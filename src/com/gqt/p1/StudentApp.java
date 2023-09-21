package com.gqt.p1;

public class StudentApp {
	public static void main(String[] args) {
		Student s = new Student();
//		s.setRoll(1);
//		s.setName("Aditi");
//		s.setFname("Manoj");
//		s.setMname("Vineeta");
//		s.setSchool("GQT");
		s.setRoll(2);
		s.setName("Anmol");
		s.setFname("Sanjay");
		s.setMname("Anjali");
		s.setSchool("Faith");
		HibernateManager hbm = new HibernateManager();
		hbm.insertData(s);

	}
}
