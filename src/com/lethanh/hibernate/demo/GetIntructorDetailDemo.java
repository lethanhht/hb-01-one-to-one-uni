package com.lethanh.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.lethanh.hibernate.entity.InstructorDetail;
import com.lethanh.hibernate.until.HibernateUtil;

public class GetIntructorDetailDemo {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			InstructorDetail detail = session.get(InstructorDetail.class, 12);
			
			if(detail !=null) {
				System.out.println(detail.toString());
				
				System.out.println(detail.getInstructor().toString());
			}else {
				System.out.println("Not exist instructor detail");
			}
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			HibernateUtil.close();
		}
	}
}
