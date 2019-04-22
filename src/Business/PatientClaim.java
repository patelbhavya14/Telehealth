/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author RASHMI
 */
public class PatientClaim {
    
    private int patientClaimId;
    
    private Date claimDate;
    
    private double claimAmount;
    
    private PatientInsurance patientInsurance;
    private PatientDiagnosis patientDiagnosis;

    public PatientClaim(int patientClaimId, Date claimDate, double claimAmount) {
        this.patientClaimId = patientClaimId;
        this.claimDate = claimDate;
        this.claimAmount = claimAmount;
        this.patientInsurance=null;
        this.patientDiagnosis=null;
    }

    public PatientInsurance getPatientInsurance() {
        return patientInsurance;
    }

    public void setPatientInsurance(PatientInsurance patientInsurance) {
        this.patientInsurance = patientInsurance;
    }

    public PatientDiagnosis getPatientDiagnosis() {
        return patientDiagnosis;
    }

    public void setPatientDiagnosis(PatientDiagnosis patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }

    public int getPatientClaimId() {
        return patientClaimId;
    }

    public void setPatientClaimId(int patientClaimId) {
        this.patientClaimId = patientClaimId;
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
