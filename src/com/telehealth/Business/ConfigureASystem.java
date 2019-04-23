package com.telehealth.Business;

import com.telehealth.Business.DB4OUtil.DB4OUtil;
import com.telehealth.Business.Employee.Employee;
import com.telehealth.Business.Role.SystemAdminRole;
import com.telehealth.Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Three Musketeers");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("a", "a", employee, new SystemAdminRole());               
        
        System.out.println("new employee created");
        
        return system;
    }
    
}
