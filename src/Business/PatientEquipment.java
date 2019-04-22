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
public class PatientEquipment {
    
    private int patientEquipmentId , patientDiagnosisId;
    
    private Date nexEquipment;
    
    private Equipments equipments;

    public PatientEquipment(int patientEquipmentId, int patientDiagnosisId,Date nexEquipment) {
        this.patientEquipmentId = patientEquipmentId;
        this.patientDiagnosisId = patientDiagnosisId;
        this.nexEquipment = nexEquipment;
        this.equipments=null;
    }

    public Equipments getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipments equipments) {
        this.equipments = equipments;
    }
    
    

    public int getPatientEquipmentId() {
        return patientEquipmentId;
    }

    public void setPatientEquipmentId(int patientEquipmentId) {
        this.patientEquipmentId = patientEquipmentId;
    }

    public int getPatientDiagnosisId() {
        return patientDiagnosisId;
    }

    public void setPatientDiagnosisId(int patientDiagnosisId) {
        this.patientDiagnosisId = patientDiagnosisId;
    }

    public Date getNexEquipment() {
        return nexEquipment;
    }

    public void setNexEquipment(Date nexEquipment) {
        this.nexEquipment = nexEquipment;
    }
    
    
    
}
