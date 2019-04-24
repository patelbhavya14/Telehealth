/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Organization;

import com.telehealth.Business.Role.AdminRole;
import com.telehealth.Business.Role.HospitalRole;
import com.telehealth.Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class HospitalOrganization extends Organization{

    public HospitalOrganization() {
        super(Type.Hospital.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalRole());
        return roles;
    }
     
}
