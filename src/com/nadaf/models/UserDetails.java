/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author elsayedawd
 */
@Entity   
@Table (name = "User_Details")
public class UserDetails implements Serializable {  
//to make the id is auto generated well and you should    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
   
    private String userName;
  
    public UserDetails()
    {
        
        
    }
   
   
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName +"from getter";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
