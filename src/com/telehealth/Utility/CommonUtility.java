/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Utility;

import com.telehealth.Business.DB4OUtil.DB4OUtil;
import com.telehealth.Business.EcoSystem;
import com.telehealth.Business.Enterprise.Enterprise;
import com.telehealth.Business.Network.Network;
import com.telehealth.Business.Organization.Organization;
import com.telehealth.Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;

/**
 *
 * @author Kinnar
 */
public class CommonUtility {
    private static DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private static EcoSystem system = dB4OUtil.retrieveSystem();
    
    public static boolean checkUserIfExists(String username){
        for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
            if(userAccount.getUsername().equals(username)){                        
                return false;
            }                        
        }
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if(userAccount.getUsername().equals(username)){
                        return false;
                    }                        
                }
            }
        }
        
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        if(userAccount.getUsername().equals(username)){                        
                            return false;
                        }
                    }
                }
                
            }
        }
        
        return true;
    }
    
    public static UserAccount checkUserIfExists(String username, String password){
        UserAccount account = null;
        
        //Sysadmin user
        for (UserAccount userAccount : system.getUserAccountDirectory().getUserAccountList()) {
            if(userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){                
                return userAccount;
            }                        
        }
        
        //Enterprise admin user
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if(userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){                        
                        return userAccount;
                    }
                }
            }
        }
        
        //Orgnization user (e.g. Doctor, Pharmacist, Insurance agent)
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        if(userAccount.getUsername().equals(username) && userAccount.getPassword().equals(password)){                        
                            return userAccount;
                        }
                    }
                }
                
            }
        }
        
        return account;
    }
}
