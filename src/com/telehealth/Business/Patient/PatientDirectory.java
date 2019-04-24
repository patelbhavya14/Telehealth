/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.telehealth.Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author Kinnar
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;
    
    public PatientDirectory(){
        patientList = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientDirectory) {
        this.patientList = patientDirectory;
    }
    
    public ArrayList<Patient> createAndAddPatient(Patient patient){
        patient.setPatientId(patientList.size()+1);
        patientList.add(patient);
        return patientList;
    }
}
