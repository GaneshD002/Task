package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HBUtils;
import com.model.Employee;

public class EmployeeDao {

		private Session session = HBUtils.sf.openSession();
		private Transaction tx = session.beginTransaction();
		
		public int insertEmployee(Employee e1)
		{
			int check = (int) session.save(e1);
			tx.commit();
			session.close();
			return check;
		}
		
		public Employee findByEid(int eid)
		{
			return session.get(Employee.class, eid);
		}
}
