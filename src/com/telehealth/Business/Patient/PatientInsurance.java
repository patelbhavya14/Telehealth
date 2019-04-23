/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Patient;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kinnar
 */
public class PatientInsurance {
    private int patientInsuranceId;
    private String insurancePlan, policyNumber,policyCoverage;
    private double policyAmount;
    private Date policyStartDate, policyEndDate;
    private int hospitalOrganizationID;
    private int pharmacyOrganizationID;
    private int insuranceOrganizationID;
    private ArrayList<PatientClaim> patientClaimList;

    public PatientInsurance(int patientInsuranceId, String insurancePlan, String policyNumber, String policyCoverage, double policyAmount, Date policyStartDate, Date policyEndDate) {
        this.insurancePlan = insurancePlan;
        this.policyNumber = policyNumber;
        this.policyCoverage = policyCoverage;
        this.policyAmount = policyAmount;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
        this.patientClaimList = new ArrayList<PatientClaim>();
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

    public int getHospitalOrganizationID() {
        return hospitalOrganizationID;
    }

    public void setHospitalOrganizationID(int hospitalOrganizationID) {
        this.hospitalOrganizationID = hospitalOrganizationID;
    }

    public int getPharmacyOrganizationID() {
        return pharmacyOrganizationID;
    }

    public void setPharmacyOrganizationID(int pharmacyOrganizationID) {
        this.pharmacyOrganizationID = pharmacyOrganizationID;
    }

    public int getInsuranceOrganizationID() {
        return insuranceOrganizationID;
    }

    public void setInsuranceOrganizationID(int insuranceOrganizationID) {
        this.insuranceOrganizationID = insuranceOrganizationID;
    }

    public ArrayList<PatientClaim> getPatientClaimList() {
        return patientClaimList;
    }

    public void setPatientClaimList(ArrayList<PatientClaim> patientClaimList) {
        this.patientClaimList = patientClaimList;
    }
    
    public ArrayList<PatientClaim> createAndAddPatientClaim(PatientClaim patientClaim){
        patientClaimList.add(patientClaim);
        return patientClaimList;
    }
}
