/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.WorkQueue;

/**
 *
 * @author Kinnar
 */
public class ClaimWorkRequest extends WorkRequest{
    private boolean insuranceClaimed;

    public boolean isInsuranceClaimed() {
        return insuranceClaimed;
    }

    public void setInsuranceClaimed(boolean insuranceClaimed) {
        this.insuranceClaimed = insuranceClaimed;
    }    
}
