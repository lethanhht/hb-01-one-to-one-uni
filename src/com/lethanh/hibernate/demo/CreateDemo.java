package com.lethanh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lethanh.hibernate.entity.Instructor;
import com.lethanh.hibernate.entity.InstructorDetail;
import com.lethanh.hibernate.until.HibernateUtil;

public class CreateDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
//			Instructor instructor = new Instructor("Dang", "Dat", "dangdat@gmail.com");
			
			InstructorDetail detail = new InstructorDetail("http://www.dangdat.com/youtube", "Love you");
			
//			instructor.setInstructorDetail(detail);
			
			session.beginTransaction();
			Instructor instructor = session.get(Instructor.class, 2);
			
//			session.save(instructor);
			if(instructor!=null) {
				session.delete(instructor);
			}
			
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
//			factory.close();
			HibernateUtil.close();
		}

	}
}
