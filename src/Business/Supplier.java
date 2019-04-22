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
public class Supplier {
    
    private int supplierId;
    
    private String supplierName, supplierAddress1, supplierAddress2, city, state, zip, country, supplierPhoneNumber,
            supplierEmailId, supplierContactPerson;

    

    public Supplier(int supplierId, String supplierName, String supplierAddress1, String supplierAddress2, String city, String state, String zip, String country, String supplierPhoneNumber, String supplierEmailId, String supplierContactPerson) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.supplierAddress1 = supplierAddress1;
        this.supplierAddress2 = supplierAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.supplierPhoneNumber = supplierPhoneNumber;
        this.supplierEmailId = supplierEmailId;
        this.supplierContactPerson = supplierContactPerson;
    }
    
    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress1() {
        return supplierAddress1;
    }

    public void setSupplierAddress1(String supplierAddress1) {
        this.supplierAddress1 = supplierAddress1;
    }

    public String getSupplierAddress2() {
        return supplierAddress2;
    }

    public void setSupplierAddress2(String supplierAddress2) {
        this.supplierAddress2 = supplierAddress2;
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

    public String getSupplierPhoneNumber() {
        return supplierPhoneNumber;
    }

    public void setSupplierPhoneNumber(String supplierPhoneNumber) {
        this.supplierPhoneNumber = supplierPhoneNumber;
    }

    public String getSupplierEmailId() {
        return supplierEmailId;
    }

    public void setSupplierEmailId(String supplierEmailId) {
        this.supplierEmailId = supplierEmailId;
    }

    public String getSupplierContactPerson() {
        return supplierContactPerson;
    }

    public void setSupplierContactPerson(String supplierContactPerson) {
        this.supplierContactPerson = supplierContactPerson;
    }
    
    
}
