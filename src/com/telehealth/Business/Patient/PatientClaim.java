/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Patient;

import java.util.Date;

/**
 *
 * @author Kinnar
 */
public class PatientClaim {
    private Date claimDate;
    private double claimAmount;
    
    public PatientClaim(){
        
    }

    public PatientClaim(double claimAmount, Date claimDate) {
        
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }
    
    
}
