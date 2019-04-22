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
public class Doctor {
    
    private int doctorId;
    private String doctorName, doctorSpecialization, doctorDegree, doctorEmailId, doctorPhoneNumber;
    private Hospital hospital;

    public Doctor(int doctorId, String doctorName, String doctorSpecialization, String doctorDegree, String doctorEmailId, String doctorPhoneNumber) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.doctorSpecialization = doctorSpecialization;
        this.doctorDegree = doctorDegree;
        this.doctorEmailId = doctorEmailId;
        this.doctorPhoneNumber = doctorPhoneNumber;
        this.hospital=null;
    }
    
    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

    public String getDoctorDegree() {
        return doctorDegree;
    }

    public void setDoctorDegree(String doctorDegree) {
        this.doctorDegree = doctorDegree;
    }

    public String getDoctorEmailId() {
        return doctorEmailId;
    }

    public void setDoctorEmailId(String doctorEmailId) {
        this.doctorEmailId = doctorEmailId;
    }

    public String getDoctorPhoneNumber() {
        return doctorPhoneNumber;
    }

    public void setDoctorPhoneNumber(String doctorPhoneNumber) {
        this.doctorPhoneNumber = doctorPhoneNumber;
    }
    
    
}
