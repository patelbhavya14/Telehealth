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
public class HospitalUser {
    
    private int hospitalUserId;
    private Hospital hospital;
    private User user;


    public HospitalUser(int hospitalUserId) {
        this.hospitalUserId = hospitalUserId;
        this.hospital=null;
        this.user=null;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public int getHospitalUserId() {
        return hospitalUserId;
    }

    public void setHospitalUserId(int hospitalUserId) {
        this.hospitalUserId = hospitalUserId;
    }

   
    
    
    
}
