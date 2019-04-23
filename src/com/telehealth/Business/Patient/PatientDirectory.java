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
    
    private ArrayList<Patient> patientDirectory;

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public ArrayList<Patient> createAndAddPatient(Patient patient){
        patient.setPatientId(patientDirectory.size()+1);
        patientDirectory.add(patient);
        return patientDirectory;
    }
}
