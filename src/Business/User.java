/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author RASHMI
 */
public class User {
    
    private int userId;
    private String userName, userPassword, userFullName, usrEmailId, userPhoneNumber;
    private Role role;
    public User(int userId, String userName, String userPassword, String userFullName, String usrEmailId, String userPhoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userFullName = userFullName;
        this.usrEmailId = usrEmailId;
        this.userPhoneNumber = userPhoneNumber;
        this.role=null;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUsrEmailId() {
        return usrEmailId;
    }

    public void setUsrEmailId(String usrEmailId) {
        this.usrEmailId = usrEmailId;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }


    
    
    
    
}
