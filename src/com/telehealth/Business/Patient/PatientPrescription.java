/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Patient;

import com.telehealth.Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Kinnar
 */
public class PatientPrescription {
    private int patientPrescriptionId;
    private double amount;
    private Date nextPrescription;
    private String notes;
    private ArrayList<PrescriptionDrugs> prescriptionDrugList;
    private int hospitalOrganizationID;
    private int pharmacyOrganizationID;
    private int insuranceOrganizationID;
    private UserAccount sender;
    private UserAccount receiver1;
    private UserAccount receiver2;
    private PatientClaim claim;

    public PatientPrescription(double amount, Date nextPrescription, String notes) {
        this.amount = amount;
        this.nextPrescription = nextPrescription;
        this.notes = notes;
        prescriptionDrugList = new ArrayList<>();
        claim = new PatientClaim();
    }

    public int getPatientPrescriptionId() {
        return patientPrescriptionId;
    }

    public void setPatientPrescriptionId(int patientPrescriptionId) {
        this.patientPrescriptionId = patientPrescriptionId;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }    

    public Date getNextPrescription() {
        return nextPrescription;
    }

    public void setNextPrescription(Date nextPrescription) {
        this.nextPrescription = nextPrescription;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<PrescriptionDrugs> getPrescriptionDrugList() {
        return prescriptionDrugList;
    }

    public void setPrescriptionDrugList(ArrayList<PrescriptionDrugs> prescriptionDrugList) {
        this.prescriptionDrugList = prescriptionDrugList;
    }
    
    public ArrayList<PrescriptionDrugs> createAndAddPrescriptionDrug(PrescriptionDrugs prescriptionDrugs){
        prescriptionDrugList.add(prescriptionDrugs);
        return prescriptionDrugList;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver1() {
        return receiver1;
    }

    public void setReceiver1(UserAccount receiver1) {
        this.receiver1 = receiver1;
    }

    public UserAccount getReceiver2() {
        return receiver2;
    }

    public void setReceiver2(UserAccount receiver2) {
        this.receiver2 = receiver2;
    }

    public PatientClaim getClaim() {
        return claim;
    }

    public void setClaim(PatientClaim claim) {
        this.claim = claim;
    }
    
    @Override
    public String toString(){
        return this.notes;
    }
}
