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
 * @author Kinnar
 */
public class PharmacyEnterprise extends Enterprise {
    public PharmacyEnterprise(String name){
        super(name,EnterpriseType.Pharmacy);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
