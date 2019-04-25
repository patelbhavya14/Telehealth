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
public class PrescriptionWorkRequest extends WorkRequest{
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
}
