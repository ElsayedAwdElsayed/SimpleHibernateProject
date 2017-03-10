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
            
        //test to insert without specifing the id the id is  outoincremented by hibernate it selff 
        UserDetails user1=new UserDetails();
        user1.setUserName("Elsayed Awd");
        
        UserDetails user2=new UserDetails();
        user2.setUserName("Elsayed Awd");
        
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        trancaction=session.beginTransaction(); //to define single unit of voke 
        session.save(user1);
        session.save(user2);
        trancaction.commit();
        session.close();
        //to retrieve   user from Session 
//        session=sessionFactory.openSession();
//        trancaction=session.beginTransaction();
//        UserDetails  userDetails=(UserDetails) session.get(UserDetails.class,1);
//        System.out.println("UserName is ------- "+userDetails.getUserName());
     //   session.close();
       
         }catch(Exception ex)
        {
            ex.printStackTrace();
            //trancaction.rollback();
        }
    
        
    }

}
