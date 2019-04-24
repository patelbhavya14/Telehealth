package com.telehealth.Business;


import com.telehealth.Business.Employee.Employee;
import com.telehealth.Business.Enterprise.Enterprise;
import com.telehealth.Business.Network.Network;
import com.telehealth.Business.Patient.Patient;
import com.telehealth.Business.Role.SystemAdminRole;
import com.telehealth.Business.UserAccount.UserAccount;
import java.util.Date;

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
        
        Network network = system.createAndAddNetwork();
        network.setName("Boston Network");
        
        Enterprise enterprise = system.getNetworkList().get(0).getEnterpriseDirectory().createAndAddEnterprise(
                "Hospital Enterprise", Enterprise.EnterpriseType.Hospital,
                "", "", "", "", "", "", "" , "");
        
        enterprise = system.getNetworkList().get(0).getEnterpriseDirectory().createAndAddEnterprise(
                "Pharmacy Enterprise", Enterprise.EnterpriseType.Pharmacy,
                "", "", "", "", "", "", "" , "");
        
        enterprise = system.getNetworkList().get(0).getEnterpriseDirectory().createAndAddEnterprise(
                "Insurance Enterprise", Enterprise.EnterpriseType.Insurance,
                "", "", "", "", "", "", "" , "");
        
        Patient patient = new Patient(1, "Kinnar Kansara", "75 St Alphonsus", "Apt 602", "Boston", "MA", "02120", "US", "5163436447", "kinnar@gmail.com", "B +ve", new Date());
        system.getPatientDirectory().createAndAddPatient(patient);
        
        System.out.println("new employee created");
        
        return system;
    }
    
}
