/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.models;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
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
//    @Id @GeneratedValue(strategy = GenerationType.AUTO)  
//    private int userId;    //these two staments are replaced by LoginName 
    @EmbeddedId     //we will make the combination of attributes makes the Id of the  user details
    private LoginName userId;
    private String userName;
  
    @Embedded   //you must make that because it defined the Address class as Embedable sure 
    @AttributeOverrides({  //to reconfigure the columns names to insert it in database to 
                           //make sure of that there isn't any thing that not being dublicated .
    @AttributeOverride(name = "city",column = @Column(name = "myCityName")),
    @AttributeOverride(name = "street",column = @Column(name = "myStreetName")),
    @AttributeOverride(name = "state",column = @Column(name = "myStateName")),
    @AttributeOverride(name = "pinCode",column = @Column(name = "myPinCode"))})
    private Address  homeAddress;
    
    @Embedded
    private Address  officeAddress; //I will keep that by default and reconfigure the other .
 
    
    
    public UserDetails()
    {
        
        
    }
   
   
    public LoginName getUserId() {
        return userId;
    }

    public void setUserId(LoginName userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName +"from getter";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }
    
    
    
}
