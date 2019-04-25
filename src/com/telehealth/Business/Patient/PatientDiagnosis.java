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
public class PatientDiagnosis {
    private int patientDiagnosisId, bpSystolic, bpDiastolic, heartRate, respiratoryRate;
    private double weight;
    private Date diagnosisDate, nextDiagnosisDate;
    private String diagnosisDetails, notes;
    private Patient patient;
    private int hospitalOrganizationID;
    private int pharmacyOrganizationID;
    private int insuranceOrganizationID;
    private UserAccount sender;
    private UserAccount receiver1;
    private UserAccount receiver2;
    
    private ArrayList<PatientPrescription> patientPrescriptionList;
    

    public PatientDiagnosis(int bpSystolic, int bpDiastolic, int heartRate, int respiratoryRate, double weight, Date diagnosisDate, Date nextDiagnosisDate, String diagnosisDetails, String notes) {
        
        this.bpSystolic = bpSystolic;
        this.bpDiastolic = bpDiastolic;
        this.heartRate = heartRate;
        this.respiratoryRate = respiratoryRate;
        this.weight = weight;
        this.diagnosisDate = diagnosisDate;
        this.nextDiagnosisDate = nextDiagnosisDate;
        this.diagnosisDetails = diagnosisDetails;
        this.notes = notes;
        patientPrescriptionList = new ArrayList<PatientPrescription>();
    }

    public int getPatientDiagnosisId() {
        return patientDiagnosisId;
    }
    public void setPatientDiagnosisId(int patientDiagnosisId) {
        this.patientDiagnosisId = patientDiagnosisId;
    }

    public int getBpSystolic() {
        return bpSystolic;
    }

    public void setBpSystolic(int bpSystolic) {
        this.bpSystolic = bpSystolic;
    }

    public int getBpDiastolic() {
        return bpDiastolic;
    }

    public void setBpDiastolic(int bpDiastolic) {
        this.bpDiastolic = bpDiastolic;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }

    public Date getNextDiagnosisDate() {
        return nextDiagnosisDate;
    }

    public void setNextDiagnosisDate(Date nextDiagnosisDate) {
        this.nextDiagnosisDate = nextDiagnosisDate;
    }

    public String getDiagnosisDetails() {
        return diagnosisDetails;
    }

    public void setDiagnosisDetails(String diagnosisDetails) {
        this.diagnosisDetails = diagnosisDetails;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
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
    
    public ArrayList<PatientPrescription> getPatientPrescriptionList() {
        return patientPrescriptionList;
    }

    public void setPatientPrescriptionList(ArrayList<PatientPrescription> patientPrescriptionList) {
        this.patientPrescriptionList = patientPrescriptionList;
    }
    
    public PatientPrescription createAndAddPatientPrescription(PatientPrescription patientPrescription){
        patientPrescription.setPatientPrescriptionId(patientPrescriptionList.size()+1);
        patientPrescriptionList.add(patientPrescription);
        return patientPrescription;
    }
    
    @Override
    public String toString(){
        return this.diagnosisDetails;
    }
}
