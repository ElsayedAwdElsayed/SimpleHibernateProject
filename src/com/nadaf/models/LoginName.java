/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nadaf.models;

import java.sql.Date;
import javax.persistence.Embeddable;
import javax.xml.crypto.Data;

/**
 *
 * @author elsayedawd
 */
@Embeddable
public class LoginName {
    private String authKey;
    private int sessionId;
    private Date currentDate;

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
    
}
