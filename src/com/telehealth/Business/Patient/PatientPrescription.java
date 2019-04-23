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
public class PatientPrescription {
    private int patientPrescriptionId;
    private double amount;
    private Date nextPrescription;
    private String notes;
    private ArrayList<PrescriptionDrugs> prescriptionDrugList;
    private int hospitalOrganizationID;
    private int pharmacyOrganizationID;
    private int insuranceOrganizationID;

    public PatientPrescription(double amount, Date nextPrescription, String notes) {
        this.amount = amount;
        this.nextPrescription = nextPrescription;
        this.notes = notes;        
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
}
