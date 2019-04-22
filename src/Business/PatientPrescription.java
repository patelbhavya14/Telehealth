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
public class PatientPrescription {
    
    private int patientPrescriptionId;
    
    private double amoutnt;
    
    private Date nextPrescription;
    
    private String notes;
    
    private PatientDiagnosis patientDiagnosis;

    public PatientPrescription(int patientPrescriptionId, double amoutnt, Date nextPrescription, String notes) {
        this.patientPrescriptionId = patientPrescriptionId;
        this.amoutnt = amoutnt;
        this.nextPrescription = nextPrescription;
        this.notes = notes;
        this.patientDiagnosis=null;
    }

    public PatientDiagnosis getPatientDiagnosis() {
        return patientDiagnosis;
    }

    public void setPatientDiagnosis(PatientDiagnosis patientDiagnosis) {
        this.patientDiagnosis = patientDiagnosis;
    }

    
    public int getPatientPrescriptionId() {
        return patientPrescriptionId;
    }

    public void setPatientPrescriptionId(int patientPrescriptionId) {
        this.patientPrescriptionId = patientPrescriptionId;
    }

    public double getAmoutnt() {
        return amoutnt;
    }

    public void setAmoutnt(double amoutnt) {
        this.amoutnt = amoutnt;
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
    
    
    
    
}
