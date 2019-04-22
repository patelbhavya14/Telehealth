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
public class PatientInsurance {
    
    private int patientInsuranceId;
    
    private String insurancePlan, policyNumber,policyCoverage;
    
    private double policyAmount;
    
    private Date policyStartDate, policyEndDate;
    
    private Patient patient;
    private InsuranceCompany insuranceCompany;

    public PatientInsurance(int patientInsuranceId, String insurancePlan, String policyNumber, String policyCoverage, double policyAmount, Date policyStartDate, Date policyEndDate) {
        this.patientInsuranceId = patientInsuranceId;
        this.insurancePlan = insurancePlan;
        this.policyNumber = policyNumber;
        this.policyCoverage = policyCoverage;
        this.policyAmount = policyAmount;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.patient=null;
        this.insuranceCompany=null;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public InsuranceCompany getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(InsuranceCompany insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public int getPatientInsuranceId() {
        return patientInsuranceId;
    }

    public void setPatientInsuranceId(int patientInsuranceId) {
        this.patientInsuranceId = patientInsuranceId;
    }

    public String getInsurancePlan() {
        return insurancePlan;
    }

    public void setInsurancePlan(String insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyCoverage() {
        return policyCoverage;
    }

    public void setPolicyCoverage(String policyCoverage) {
        this.policyCoverage = policyCoverage;
    }

    public double getPolicyAmount() {
        return policyAmount;
    }

    public void setPolicyAmount(double policyAmount) {
        this.policyAmount = policyAmount;
    }

    public Date getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(Date policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public Date getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(Date policyEndDate) {
        this.policyEndDate = policyEndDate;
    }
    
    
    
}
