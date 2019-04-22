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
public class Pharmacy {
    
    private int pharmacyId;
    
    private String pharmacyName, pharmacyAddress1, pharmacyAddress2, city, state, zip, country, pharmacyPhoneNumber,
            pharmacyEmailId, pharmacyContactNumber;


    public Pharmacy(int pharmacyId, String pharmacyName, String pharmacyAddress1, String pharmacyAddress2, String city, String state, String zip, String country, String pharmacyPhoneNumber, String pharmacyEmailId, String pharmacyContactNumber) {
        this.pharmacyId = pharmacyId;
        this.pharmacyName = pharmacyName;
        this.pharmacyAddress1 = pharmacyAddress1;
        this.pharmacyAddress2 = pharmacyAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.pharmacyPhoneNumber = pharmacyPhoneNumber;
        this.pharmacyEmailId = pharmacyEmailId;
        this.pharmacyContactNumber = pharmacyContactNumber;
    }
    
    public int getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(int pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmacyAddress1() {
        return pharmacyAddress1;
    }

    public void setPharmacyAddress1(String pharmacyAddress1) {
        this.pharmacyAddress1 = pharmacyAddress1;
    }

    public String getPharmacyAddress2() {
        return pharmacyAddress2;
    }

    public void setPharmacyAddress2(String pharmacyAddress2) {
        this.pharmacyAddress2 = pharmacyAddress2;
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

    public String getPharmacyPhoneNumber() {
        return pharmacyPhoneNumber;
    }

    public void setPharmacyPhoneNumber(String pharmacyPhoneNumber) {
        this.pharmacyPhoneNumber = pharmacyPhoneNumber;
    }

    public String getPharmacyEmailId() {
        return pharmacyEmailId;
    }

    public void setPharmacyEmailId(String pharmacyEmailId) {
        this.pharmacyEmailId = pharmacyEmailId;
    }

    public String getPharmacyContactNumber() {
        return pharmacyContactNumber;
    }

    public void setPharmacyContactNumber(String pharmacyContactNumber) {
        this.pharmacyContactNumber = pharmacyContactNumber;
    }
    
    
}
