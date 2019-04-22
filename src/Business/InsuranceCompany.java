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
public class InsuranceCompany {
    
    
   private int insuranceComapanyId;
   
   private String insuranceComapanyName, insuranceComapanyAddress1, insuranceComapanyAddress2, city, state, zip, country, 
           insuranceComapanyPhoneNumber, insuranceComapanyEmailId, insuranceComapanyContactPerson;


    public InsuranceCompany(int insuranceComapanyId, String insuranceComapanyName, String insuranceComapanyAddress1, String insuranceComapanyAddress2, String city, String state, String zip, String country, String insuranceComapanyPhoneNumber, String insuranceComapanyEmailId, String insuranceComapanyContactPerson) {
        this.insuranceComapanyId = insuranceComapanyId;
        this.insuranceComapanyName = insuranceComapanyName;
        this.insuranceComapanyAddress1 = insuranceComapanyAddress1;
        this.insuranceComapanyAddress2 = insuranceComapanyAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.insuranceComapanyPhoneNumber = insuranceComapanyPhoneNumber;
        this.insuranceComapanyEmailId = insuranceComapanyEmailId;
        this.insuranceComapanyContactPerson = insuranceComapanyContactPerson;
    }
    
    public int getInsuranceComapanyId() {
        return insuranceComapanyId;
    }

    public void setInsuranceComapanyId(int insuranceComapanyId) {
        this.insuranceComapanyId = insuranceComapanyId;
    }

    public String getInsuranceComapanyName() {
        return insuranceComapanyName;
    }

    public void setInsuranceComapanyName(String insuranceComapanyName) {
        this.insuranceComapanyName = insuranceComapanyName;
    }

    public String getInsuranceComapanyAddress1() {
        return insuranceComapanyAddress1;
    }

    public void setInsuranceComapanyAddress1(String insuranceComapanyAddress1) {
        this.insuranceComapanyAddress1 = insuranceComapanyAddress1;
    }

    public String getInsuranceComapanyAddress2() {
        return insuranceComapanyAddress2;
    }

    public void setInsuranceComapanyAddress2(String insuranceComapanyAddress2) {
        this.insuranceComapanyAddress2 = insuranceComapanyAddress2;
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

    public String getInsuranceComapanyPhoneNumber() {
        return insuranceComapanyPhoneNumber;
    }

    public void setInsuranceComapanyPhoneNumber(String insuranceComapanyPhoneNumber) {
        this.insuranceComapanyPhoneNumber = insuranceComapanyPhoneNumber;
    }

    public String getInsuranceComapanyEmailId() {
        return insuranceComapanyEmailId;
    }

    public void setInsuranceComapanyEmailId(String insuranceComapanyEmailId) {
        this.insuranceComapanyEmailId = insuranceComapanyEmailId;
    }

    public String getInsuranceComapanyContactPerson() {
        return insuranceComapanyContactPerson;
    }

    public void setInsuranceComapanyContactPerson(String insuranceComapanyContactPerson) {
        this.insuranceComapanyContactPerson = insuranceComapanyContactPerson;
    }
   
   
}
