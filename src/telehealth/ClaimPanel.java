/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telehealth;

import com.telehealth.Business.DB4OUtil.DB4OUtil;
import com.telehealth.Business.EcoSystem;
import com.telehealth.Business.Enterprise.Enterprise;
import com.telehealth.Business.Organization.Organization;
import com.telehealth.Business.Patient.Patient;
import com.telehealth.Business.Patient.PatientClaim;
import com.telehealth.Business.Patient.PatientDiagnosis;
import com.telehealth.Business.Patient.PatientInsurance;
import com.telehealth.Business.Patient.PatientPrescription;
import com.telehealth.Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RASHMI
 */
public class ClaimPanel extends javax.swing.JPanel {

    /**
     * Creates new form ClaimPanel
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    String pattern = "MM/dd/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    int table_selected_row;
    UserAccount userAccount;
    PatientDiagnosis patientDiagnosis;
    Patient currentPatient;
    PatientInsurance currentInsurance;
    Enterprise currentEnterprise;
    Organization currentOrganization;
    

    public ClaimPanel(TeleHealthView teleHealthView, EcoSystem system, Enterprise currentEnterprise, Organization currentOrganization, UserAccount userAccount) {
        initComponents();
        this.system = system;
        this.userAccount = userAccount;
        this.currentEnterprise = currentEnterprise;
        this.currentOrganization = currentOrganization;
        btnDelete.setVisible(false);

        populatePatientComboBox();
        populateTable();
        clearFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtClaimDate = new javax.swing.JFormattedTextField();
        cmbPatient = new javax.swing.JComboBox();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClaim = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cmbPatientPrescription = new javax.swing.JComboBox();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(telehealth.TeleHealthApp.class).getContext().getResourceMap(ClaimPanel.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        txtClaimAmount.setFont(resourceMap.getFont("txtClaimAmount.font")); // NOI18N
        txtClaimAmount.setName("txtClaimAmount"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        try {
            txtClaimDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtClaimDate.setFont(resourceMap.getFont("txtClaimDate.font")); // NOI18N
        txtClaimDate.setName("txtClaimDate"); // NOI18N
        txtClaimDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaimDateActionPerformed(evt);
            }
        });

        cmbPatient.setFont(resourceMap.getFont("cmbPatient.font")); // NOI18N
        cmbPatient.setName("cmbPatient"); // NOI18N
        cmbPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatientActionPerformed(evt);
            }
        });

        btnAdd.setFont(resourceMap.getFont("btnAdd.font")); // NOI18N
        btnAdd.setText(resourceMap.getString("btnAdd.text")); // NOI18N
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(resourceMap.getFont("btnDelete.font")); // NOI18N
        btnDelete.setText(resourceMap.getString("btnDelete.text")); // NOI18N
        btnDelete.setName("btnDelete"); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tblClaim.setFont(resourceMap.getFont("tblClaim.font")); // NOI18N
        tblClaim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Patient Insurance", "Claim Amount", "Claim date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClaim.setName("tblClaim"); // NOI18N
        tblClaim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClaimMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblClaim);
        if (tblClaim.getColumnModel().getColumnCount() > 0) {
            tblClaim.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("tblClaim.columnModel.title0")); // NOI18N
            tblClaim.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("tblClaim.columnModel.title1")); // NOI18N
            tblClaim.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("tblClaim.columnModel.title2")); // NOI18N
            tblClaim.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("tblClaim.columnModel.title3")); // NOI18N
        }

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        cmbPatientPrescription.setFont(resourceMap.getFont("cmbPatientPrescription.font")); // NOI18N
        cmbPatientPrescription.setName("cmbPatientPrescription"); // NOI18N
        cmbPatientPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatientPrescriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnAdd)
                                .addGap(12, 12, 12)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPatientPrescription, 0, 194, Short.MAX_VALUE)
                                    .addComponent(cmbPatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtClaimAmount)
                                    .addComponent(txtClaimDate)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(417, 417, 417)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPatientPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaimDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaimDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaimDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaimDateActionPerformed

    private void tblClaimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClaimMouseClicked
        // TODO add your handling code here:

//        try
//        {
//            
//            if (evt.getClickCount() == 2){
//                table_selected_row = tblClaim.getSelectedRow();
//                patientClaim = (PatientClaim)tblClaim.getValueAt(table_selected_row, 1);
//                patient = (Patient)tblClaim.getValueAt(table_selected_row, 0);
//                
//                cmbPatient.setSelectedItem((Patient)tblClaim.getValueAt(table_selected_row, 0));
//                txtClaimAmount.setText(patientClaim.getClaimAmount()+"");
//                txtClaimDate.setText(simpleDateFormat.format(patientClaim.getClaimDate()));
////                if(userAccount.getRole().toString().equals(new HospitalRole().toString())){
//                    btnAdd.setText("Update");
//                    btnDelete.setVisible(true);
////                }
//            }
//        } catch (Exception e){
//            e.printStackTrace();
//        }

    }//GEN-LAST:event_tblClaimMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        PatientPrescription cpp = (PatientPrescription) cmbPatientPrescription.getSelectedItem();
        
        if(validateFields()) {
            cpp.setReceiver2(userAccount);
            cpp.getClaim().setClaimAmount(Double.parseDouble(txtClaimAmount.getText()));
            try {
                cpp.getClaim().setClaimDate(simpleDateFormat.parse(txtClaimDate.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(ClaimPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            dB4OUtil.storeSystem(system);
                clearFields();
                populateTable();
            JOptionPane.showMessageDialog(null, "Insurance claimed successfully");
            
        }
        
//        
//        Patient patient = (Patient)cmbPatient.getSelectedItem();
//        PatientInsurance patientInsurance= (PatientInsurance) cmbPatientInsurance.getSelectedItem();
//        if(btnAdd.getText().equals("Add")){
//            try{
//                if(validateFields()){
//                PatientClaim claim = new PatientClaim(
//                Double.parseDouble(txtClaimAmount.getText()),
//                simpleDateFormat.parse(txtClaimDate.getText()));
//                
//                 patientInsurance.createAndAddPatientClaim(claim);
//                try{
//                        dB4OUtil.storeSystem(system);
//                        clearFields();
//                        populateTable();
//                    } catch(Exception e){
//                        e.printStackTrace();
//                    }
//                }
//            }
//            catch (Exception e){
//                   e.printStackTrace();
//            }
//        }
//        else{
//            try{
//            if(validateFields())
//            {
//               patientClaim.setClaimAmount(Double.parseDouble(txtClaimAmount.getText()));
//               patientClaim.setClaimDate(simpleDateFormat.parse(txtClaimDate.getText()));
//            }
//            
//            try{
//                        dB4OUtil.storeSystem(system);
//                        clearFields();
//                        populateTable();
//                        btnDelete.setVisible(false);
//                    } catch(Exception e){
//                        e.printStackTrace();
//                    }
//        }
//            catch (Exception e){
//                e.printStackTrace();
//            }
//        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
//        int selectedOption = JOptionPane.showConfirmDialog(null, "Delete Claim", "Are you sure you want to delete this Clai?", JOptionPane.YES_NO_OPTION);
//        if(selectedOption == JOptionPane.OK_OPTION){
//            int table_selected_row = tblClaim.getSelectedRow();
//            patientInsurance.getPatientClaimList().remove(patientClaim);
//            dB4OUtil.storeSystem(system);
//            JOptionPane.showMessageDialog(null, "Claim deleted successfully");
//            clearFields();
//            populateTable();
//            btnAdd.setText("Add");
//            btnDelete.setVisible(false);
//        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientActionPerformed
        // TODO add your handling code here:

        populatePatientPrescriptionComboBox();
        
    }//GEN-LAST:event_cmbPatientActionPerformed

    private void cmbPatientPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientPrescriptionActionPerformed
        // TODO add your handling code here:
        PatientPrescription pc = (PatientPrescription) cmbPatientPrescription.getSelectedItem();
        txtClaimAmount.setText(String.valueOf(pc.getAmount()));
    }//GEN-LAST:event_cmbPatientPrescriptionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cmbPatient;
    private javax.swing.JComboBox cmbPatientPrescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblClaim;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JFormattedTextField txtClaimDate;
    // End of variables declaration//GEN-END:variables

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblClaim.getModel();

        model.setRowCount(0);
        
        for(Patient p: this.system.getPatientDirectory().getPatientList()) {
            for(PatientDiagnosis pd: p.getPatientDiagnosisList()) {
            for(PatientPrescription pc: pd.getPatientPrescriptionList()) {
                if(pc.getReceiver1() != null && pc.getReceiver2() !=null) {
                    Object[] row = new Object[4];
                    row[0] = p;
                    row[1] = pc;
                    row[2] = pc.getClaim().getClaimAmount();
                    row[3] = pc.getClaim().getClaimDate();
                    model.addRow(row);
                }
                
            }
        }
        }
        
    }

    public void clearFields() {
        cmbPatient.setSelectedItem(null);
        cmbPatientPrescription.setSelectedItem(null);
        txtClaimAmount.setText("");
        txtClaimDate.setText("");
    }

    public void populatePatientComboBox() {
        cmbPatient.removeAllItems();

        for (Patient patient : this.system.getPatientDirectory().getPatientList()) {
            for (PatientInsurance patientInsurance : patient.getPatientInsuranceList()) {
                if (userAccount == patientInsurance.getInsuranceCompany()) {
                    cmbPatient.addItem(patient);
                    break;
                }
            }
        }
    }

    public boolean validateFields() {

        if (txtClaimAmount.getText().equals("")
                || txtClaimDate.getText().equals("") ||
                cmbPatient.getSelectedIndex() == -1 ||
                cmbPatientPrescription.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            Double.parseDouble(txtClaimAmount.getText());
            simpleDateFormat.parse(txtClaimDate.getText());

        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Please enter valid values", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(null, "Please enter valid values", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void populatePatientPrescriptionComboBox() {

        cmbPatientPrescription.removeAllItems();
        Patient patient = (Patient) cmbPatient.getSelectedItem();
        
        for(PatientDiagnosis pd: patient.getPatientDiagnosisList()) {
            for(PatientPrescription pc: pd.getPatientPrescriptionList()) {
                if(pc.getReceiver1() != null && pc.getReceiver2() ==null) {
                    cmbPatientPrescription.addItem(pc);
                }
                
            }
        }
//        for(Patient patient: this.system.getPatientDirectory().getPatientList()) {
//            for(PatientInsurance patientInsurance: patient.getPatientInsuranceList()) {
//                if(patientInsurance.getInsuranceCompany() == userAccount) {
//                    System.out.println("here in ins");
//                    cmbPatientInsurance.addItem(patient);
//                }
//            }
//        }
//        for (PatientInsurance patientInsurance : ){
//            cmbPatient.addItem(patient);
//        }
    }
}
