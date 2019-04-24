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
        
        return true;
    }
    
    public static boolean checkUserIfExists(String username, String password){
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
        
        return true;
    }
}
