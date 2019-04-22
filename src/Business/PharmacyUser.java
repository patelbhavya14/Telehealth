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
public class PharmacyUser {
    
    private int pharmacyUserId;
    private Pharmacy pharmacy;
    private User user;

    public PharmacyUser(int pharmacyUserId) {
        this.pharmacyUserId = pharmacyUserId;
        this.pharmacy=null;
        this.user=null;
    }
    public int getPharmacyUserId() {
        return pharmacyUserId;
    }
    public void setPharmacyUserId(int pharmacyUserId) {
        this.pharmacyUserId = pharmacyUserId;
    }

    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
    
    
    
}
