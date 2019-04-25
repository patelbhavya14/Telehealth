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
public class Patient {
    
    private int patientId;
    
    private String patientName, patientAddress1, patientAddress2, city, state, zip, country, patientPhoneNumber, 
            patientEmailId, patientBloodGroup;
    
    private Date dateOfBirth;
    private ArrayList<PatientDiagnosis> patientDiagnosisList;
    private ArrayList<PatientPrescription> patientPrescriptionList;
    private ArrayList<PatientInsurance> patientInsuranceList;

    public Patient(int patientId, String patientName, String patientAddress1, String patientAddress2, String city, String state, String zip, String country, String patientPhoneNumber, String patientEmailId, String patientBloodGroup, Date dateOfBirth) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAddress1 = patientAddress1;
        this.patientAddress2 = patientAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.patientPhoneNumber = patientPhoneNumber;
        this.patientEmailId = patientEmailId;
        this.patientBloodGroup = patientBloodGroup;
        this.dateOfBirth = dateOfBirth;
        patientDiagnosisList = new ArrayList<PatientDiagnosis>();
        patientPrescriptionList = new ArrayList<PatientPrescription>();
        patientInsuranceList = new ArrayList<PatientInsurance>();
    }
    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientAddress1() {
        return patientAddress1;
    }

    public void setPatientAddress1(String patientAddress1) {
        this.patientAddress1 = patientAddress1;
    }

    public String getPatientAddress2() {
        return patientAddress2;
    }

    public void setPatientAddress2(String patientAddress2) {
        this.patientAddress2 = patientAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
    }

    public String getPatientEmailId() {
        return patientEmailId;
    }

    public void setPatientEmailId(String patientEmailId) {
        this.patientEmailId = patientEmailId;
    }

    public String getPatientBloodGroup() {
        return patientBloodGroup;
    }

    public void setPatientBloodGroup(String patientBloodGroup) {
        this.patientBloodGroup = patientBloodGroup;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public ArrayList<PatientDiagnosis> getPatientDiagnosisList() {
        return patientDiagnosisList;
    }

    public void setPatientDiagnosisList(ArrayList<PatientDiagnosis> patientDiagnosisList) {
        this.patientDiagnosisList = patientDiagnosisList;
    }
    
    public PatientDiagnosis createAndAddPatientDiagnosis(PatientDiagnosis patientDiagnosis){
        patientDiagnosis.setPatientDiagnosisId(patientDiagnosisList.size()+1);
        patientDiagnosisList.add(patientDiagnosis);
        return patientDiagnosis;
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

    public ArrayList<PatientInsurance> getPatientInsuranceList() {
        return patientInsuranceList;
    }

    public void setPatientInsuranceList(ArrayList<PatientInsurance> patientInsuranceList) {
        this.patientInsuranceList = patientInsuranceList;
    }
    
    public PatientInsurance createAndAddPatientInsurance(PatientInsurance patientInsurance){
        patientInsurance.setPatientInsuranceId(patientInsuranceList.size()+1);
        patientInsuranceList.add(patientInsurance);
        return patientInsurance;
    }

    @Override
    public String toString() {
        return this.patientName;
    }
}
