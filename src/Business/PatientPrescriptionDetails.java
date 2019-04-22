/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author RASHMI
 */
public class PatientPrescriptionDetails {
    
    private int patientPrescriptionDetailId, drugId, quantity;
    
    private PatientPrescription patientPrescription;

    public PatientPrescriptionDetails(int patientPrescriptionDetailId, int drugId, int quantity) {
        this.patientPrescriptionDetailId = patientPrescriptionDetailId;
        this.drugId = drugId;
        this.quantity = quantity;
        this.patientPrescription=null;
    }

    public int getPatientPrescriptionDetailId() {
        return patientPrescriptionDetailId;
    }

    public void setPatientPrescriptionDetailId(int patientPrescriptionDetailId) {
        this.patientPrescriptionDetailId = patientPrescriptionDetailId;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public PatientPrescription getPatientPrescription() {
        return patientPrescription;
    }

    public void setPatientPrescription(PatientPrescription patientPrescription) {
        this.patientPrescription = patientPrescription;
    }
    
    
    
    
}
