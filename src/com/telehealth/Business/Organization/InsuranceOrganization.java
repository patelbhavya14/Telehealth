/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Organization;

import com.telehealth.Business.Role.InsuranceRole;
import com.telehealth.Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class InsuranceOrganization extends Organization{

    public InsuranceOrganization() {
        super(Organization.Type.Insurance.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new InsuranceRole());
        return roles;
    }
     
}