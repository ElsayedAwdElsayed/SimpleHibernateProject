/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.test;

import com.nadaf.models.UserDetails;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author elsayedawduser
 */
public class HibernateTest {
    
    public static void main(String[] args) {
        
        org.hibernate.Transaction trancaction=null;
        try{
        UserDetails user=new UserDetails();
        user.setUserId(2);
        user.setUserName("Elsayed Awd");
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        trancaction=session.beginTransaction(); //to define single unit of voke 
        session.save(user);
        trancaction.commit();
        session.close();
        session=sessionFactory.openSession();
        trancaction=session.beginTransaction();
        UserDetails  userDetails=(UserDetails) session.get(UserDetails.class,1);
        System.out.println("UserName is ------- "+userDetails.getUserName());
     //   session.close();
       
         }catch(Exception ex)
        {
            ex.printStackTrace();
            //trancaction.rollback();
        }
    
        
    }

}
