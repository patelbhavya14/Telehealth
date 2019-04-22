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
public class Drug {
    
    private int drugId;
    
    private String drugName, drugComponent;
    
    private double price;

    public Drug(int drugId, String drugName, String drugComponent, double price) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.drugComponent = drugComponent;
        this.price = price;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugComponent() {
        return drugComponent;
    }

    public void setDrugComponent(String drugComponent) {
        this.drugComponent = drugComponent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
