/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String address1, String address2, String city, String state, String zip, String phone, String email, String contactPerson){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name, address1, address2, city, state, zip, phone, email, contactPerson);
            enterprise.setEnterpriseId(enterpriseList.size()+1);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Pharmacy){
            enterprise=new PharmacyEnterprise(name, address1, address2, city, state, zip, phone, email, contactPerson);
            enterprise.setEnterpriseId(enterpriseList.size()+1);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Insurance){
            enterprise=new InsuranceEnterprise(name, address1, address2, city, state, zip, phone, email, contactPerson);
            enterprise.setEnterpriseId(enterpriseList.size()+1);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
