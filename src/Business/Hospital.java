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
public class Hospital {
    
    private int hospitalId;
    private String hospitalName, hospitalAddress1, hospitalAddress2, city, state, zip, country, hospitalPhoneNumber, 
            hospitalEmailId, hospitalContactPerson;

    

    public Hospital(int hospitalId, String hospitalName, String hospitalAddress1, String hospitalAddress2, String city, String state, String zip, String country, String hospitalPhoneNumber, String hospitalEmailId, String hospitalContactPerson) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.hospitalAddress1 = hospitalAddress1;
        this.hospitalAddress2 = hospitalAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.hospitalPhoneNumber = hospitalPhoneNumber;
        this.hospitalEmailId = hospitalEmailId;
        this.hospitalContactPerson = hospitalContactPerson;
    }
    
    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress1() {
        return hospitalAddress1;
    }

    public void setHospitalAddress1(String hospitalAddress1) {
        this.hospitalAddress1 = hospitalAddress1;
    }

    public String getHospitalAddress2() {
        return hospitalAddress2;
    }

    public void setHospitalAddress2(String hospitalAddress2) {
        this.hospitalAddress2 = hospitalAddress2;
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

    public String getHospitalPhoneNumber() {
        return hospitalPhoneNumber;
    }

    public void setHospitalPhoneNumber(String hospitalPhoneNumber) {
        this.hospitalPhoneNumber = hospitalPhoneNumber;
    }

    public String getHospitalEmailId() {
        return hospitalEmailId;
    }

    public void setHospitalEmailId(String hospitalEmailId) {
        this.hospitalEmailId = hospitalEmailId;
    }

    public String getHospitalContactPerson() {
        return hospitalContactPerson;
    }

    public void setHospitalContactPerson(String hospitalContactPerson) {
        this.hospitalContactPerson = hospitalContactPerson;
    }

    
    
    
}
