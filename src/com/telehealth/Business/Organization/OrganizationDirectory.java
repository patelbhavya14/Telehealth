/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Organization;

import com.telehealth.Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization();
            organization.setOrganizationID(organizationList.size()+1);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organization.setOrganizationID(organizationList.size()+1);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Insurance.getValue())){
            organization = new InsuranceOrganization();
            organization.setOrganizationID(organizationList.size()+1);
            organizationList.add(organization);
        }
        return organization;
    }
}