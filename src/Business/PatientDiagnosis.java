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
public class PatientDiagnosis {
    
    private int patientDiagnosisId, bpSystolic, bpDiastolic, heartRate, respiratoryRate;
    private double weight;
    private Date diagnosisDate, nextDiagnosisDate;
    private String diagnosisDetails, notes;
    private Patient patient;
    private Doctor doctor;
    

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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
    
}
