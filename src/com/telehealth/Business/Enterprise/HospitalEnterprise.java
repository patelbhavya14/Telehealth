/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Enterprise;

import com.telehealth.Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class HospitalEnterprise extends Enterprise {
    
    public HospitalEnterprise(String name,String address1, String address2, String city, String state, String zip, String phone, String email, String contactPerson){
        super(name,EnterpriseType.Hospital, address1, address2, city, state, zip, phone, email, contactPerson);
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
