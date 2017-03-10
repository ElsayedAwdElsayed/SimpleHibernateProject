/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author elsayedawd
 */
@Entity (name = "User_Details")
public class UserDetails implements Serializable {  
    
    private int userId;
   
    private String userName;
  
    public UserDetails()
    {
        
        
    }
    @Id 
    @Column (name = "user_Id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
     @Column (name = "user_Name")
    public String getUserName() {
        return userName +"from getter";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
