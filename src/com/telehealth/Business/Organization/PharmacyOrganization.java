/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Organization;

import com.telehealth.Business.Role.PharmacyRole;
import com.telehealth.Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PharmacyOrganization extends Organization{

    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }
     
   
    
    
}
