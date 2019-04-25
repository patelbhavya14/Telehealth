/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.WorkQueue;


import com.telehealth.Business.Patient.PatientClaim;
import com.telehealth.Business.Patient.PatientDiagnosis;
import com.telehealth.Business.Patient.PatientPrescription;
import com.telehealth.Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private UserAccount receiver2;
    private String status;
    private String status2;
    private String status3;
    private Date requestDate;
    private Date resolveDate;
    private PatientDiagnosis diagnosis;
    private PatientPrescription prescription;
    private PatientClaim claim;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public PatientDiagnosis getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(PatientDiagnosis diagnosis) {
        this.diagnosis = diagnosis;
    }

    public PatientPrescription getPrescription() {
        return prescription;
    }

    public void setPrescription(PatientPrescription prescription) {
        this.prescription = prescription;
    }

    public PatientClaim getClaim() {
        return claim;
    }

    public void setClaim(PatientClaim claim) {
        this.claim = claim;
    }

    public UserAccount getReceiver2() {
        return receiver2;
    }

    public void setReceiver2(UserAccount receiver2) {
        this.receiver2 = receiver2;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }
        
}
