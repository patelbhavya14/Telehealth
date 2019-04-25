/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telehealth;

import com.telehealth.Business.DB4OUtil.DB4OUtil;
import com.telehealth.Business.EcoSystem;
import com.telehealth.Business.Enterprise.Enterprise;
import com.telehealth.Business.Network.Network;
import com.telehealth.Business.Organization.InsuranceOrganization;
import com.telehealth.Business.Organization.Organization;
import com.telehealth.Business.Organization.PharmacyOrganization;
import com.telehealth.Business.Patient.Patient;
import com.telehealth.Business.Patient.PatientDiagnosis;
import com.telehealth.Business.Patient.PatientPrescription;
import com.telehealth.Business.Patient.PrescriptionDrugs;
import com.telehealth.Business.UserAccount.UserAccount;
import com.telehealth.Business.WorkQueue.PrescriptionWorkRequest;
import com.telehealth.Business.WorkQueue.WorkRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import telehealth.TeleHealthView;

/**
 *
 * @author Kinnar
 */
public class PharmacyWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyWorkAreaPanel
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    int table_selected_row;    
    UserAccount userAccount;
    PatientDiagnosis patientDiagnosis;
    Patient patient;
    Enterprise currentEnterprise;
    Organization currentOrganization;
    PatientPrescription prescription;
    private ArrayList<PrescriptionDrugs> prescriptionDrugList = new ArrayList<>();
    String pattern = "MM/dd/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    PharmacyOrganization pharmacyOrganization;
    WorkRequest request;
    
    public PharmacyWorkAreaPanel(TeleHealthView teleHealthView, EcoSystem system, Enterprise currentEnterprise, Organization currentOrganization, UserAccount userAccount) {
        initComponents();
        
        this.system = system;
        this.userAccount = userAccount;
        this.currentEnterprise = currentEnterprise;
        this.currentOrganization = currentOrganization;   
        this.pharmacyOrganization = (PharmacyOrganization)currentOrganization;
        populatePatientComboBox();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaNotes = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrescription = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrescriptionDetails = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbPatient = new javax.swing.JComboBox();
        cmbPatientDiagnosis = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtNextPrescriptionDate = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(telehealth.TeleHealthApp.class).getContext().getResourceMap(PharmacyWorkAreaPanel.class);
        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        txtAreaNotes.setEditable(false);
        txtAreaNotes.setColumns(10);
        txtAreaNotes.setFont(resourceMap.getFont("txtAreaNotes.font")); // NOI18N
        txtAreaNotes.setRows(2);
        txtAreaNotes.setTabSize(0);
        txtAreaNotes.setName("txtAreaNotes"); // NOI18N
        jScrollPane2.setViewportView(txtAreaNotes);

        jSeparator1.setName("jSeparator1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tblPrescription.setFont(resourceMap.getFont("tblPrescription.font")); // NOI18N
        tblPrescription.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "Patient Diagnosis", "Amount", "Next Prescription Date", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrescription.setName("tblPrescription"); // NOI18N
        tblPrescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrescriptionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPrescription);
        if (tblPrescription.getColumnModel().getColumnCount() > 0) {
            tblPrescription.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("tblPrescription.columnModel.title0")); // NOI18N
            tblPrescription.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("tblPrescription.columnModel.title1")); // NOI18N
            tblPrescription.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("tblPrescription.columnModel.title2")); // NOI18N
            tblPrescription.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("tblPrescription.columnModel.title3")); // NOI18N
            tblPrescription.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("tblPrescription.columnModel.title4")); // NOI18N
        }

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        tblPrescriptionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrescriptionDetails.setName("tblPrescriptionDetails"); // NOI18N
        jScrollPane3.setViewportView(tblPrescriptionDetails);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        cmbPatient.setFont(resourceMap.getFont("cmbPatient.font")); // NOI18N
        cmbPatient.setEnabled(false);
        cmbPatient.setName("cmbPatient"); // NOI18N
        cmbPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatientActionPerformed(evt);
            }
        });

        cmbPatientDiagnosis.setFont(resourceMap.getFont("cmbPatientDiagnosis.font")); // NOI18N
        cmbPatientDiagnosis.setEnabled(false);
        cmbPatientDiagnosis.setName("cmbPatientDiagnosis"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        btnAdd.setFont(resourceMap.getFont("btnAdd.font")); // NOI18N
        btnAdd.setText(resourceMap.getString("btnAdd.text")); // NOI18N
        btnAdd.setName("btnAdd"); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtNextPrescriptionDate.setEditable(false);
        try {
            txtNextPrescriptionDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNextPrescriptionDate.setFont(resourceMap.getFont("txtNextPrescriptionDate.font")); // NOI18N
        txtNextPrescriptionDate.setName("txtNextPrescriptionDate"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        txtAmount.setFont(resourceMap.getFont("txtAmount.font")); // NOI18N
        txtAmount.setText(resourceMap.getString("txtAmount.text")); // NOI18N
        txtAmount.setName("txtAmount"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(119, 119, 119)
                                        .addComponent(cmbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(32, 32, 32))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(35, 35, 35)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                            .addComponent(txtNextPrescriptionDate)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(62, 62, 62)
                                        .addComponent(cmbPatientDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator1))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(534, 534, 534)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbPatientDiagnosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNextPrescriptionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblPrescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrescriptionMouseClicked
        // TODO add your handling code here:
        try
        {
            if (evt.getClickCount() == 2){
                table_selected_row = tblPrescription.getSelectedRow();
                patientDiagnosis = (PatientDiagnosis)tblPrescription.getValueAt(table_selected_row, 1);
                patient = (Patient)tblPrescription.getValueAt(table_selected_row, 0);
                cmbPatient.setSelectedItem((Patient)tblPrescription.getValueAt(table_selected_row, 0));
                cmbPatientDiagnosis.setSelectedItem((PatientDiagnosis)tblPrescription.getValueAt(table_selected_row, 1));

                prescription = (PatientPrescription)tblPrescription.getValueAt(table_selected_row, 4);

                //                txtAmount.setText(prescription.getAmount()+"");

                txtNextPrescriptionDate.setText(simpleDateFormat.format(prescription.getNextPrescription()));
                txtAreaNotes.setText(prescription.getNotes());

                btnAdd.setText("Update");
//                request = (WorkRequest)tblPrescription.getValueAt(table_selected_row, 5);

                prescriptionDrugList = prescription.getPrescriptionDrugList();
                populateDrugTable();

            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_tblPrescriptionMouseClicked

    private void cmbPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatientActionPerformed
        // TODO add your handling code here:
        Patient patient = (Patient) cmbPatient.getSelectedItem();
        if (patient != null){
            populatePatientDiagnosisComboBox(patient);
        }
    }//GEN-LAST:event_cmbPatientActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(btnAdd.getText().equals("Add")){
            try{
                if(validateFields()){
                    //                    double amount = Double.parseDouble(txtAmount.getText());
                    Date nextPrescriptionDate = simpleDateFormat.parse(txtNextPrescriptionDate.getText());
                    String notes = txtAreaNotes.getText();
                    Patient patient = (Patient) cmbPatient.getSelectedItem();
                    PatientDiagnosis patientDiagnosis = (PatientDiagnosis) cmbPatientDiagnosis.getSelectedItem();

                    //                    PatientPrescription prescription = new PatientPrescription(amount, nextPrescriptionDate, notes);
                    PatientPrescription prescription = new PatientPrescription(0, nextPrescriptionDate, notes);
                    prescription.setPrescriptionDrugList(prescriptionDrugList);

                    PatientPrescription patientPrescription = patientDiagnosis.createAndAddPatientPrescription(prescription);

                    try{
                        //Add work request
                        PrescriptionWorkRequest request = new PrescriptionWorkRequest();
                        request.setDiagnosis(patientDiagnosis);
                        request.setPrescription(prescription);

                        request.setMessage("Sending request for getting medicines");
                        request.setSender(userAccount);
                        request.setStatus("sent");

                        Organization org = null;
                        for (Organization organization : currentEnterprise.getOrganizationDirectory().getOrganizationList()){
                            if (organization instanceof PharmacyOrganization){
                                org = organization;
                                break;
                            }
                        }
                        Organization org2 = null;
                        for (Organization organization : currentEnterprise.getOrganizationDirectory().getOrganizationList()){
                            if (organization instanceof InsuranceOrganization){
                                org2 = organization;
                                break;
                            }
                        }
                        if (org!=null && org2!=null){
                            org.getWorkQueue().getWorkRequestList().add(request);
                            org2.getWorkQueue().getWorkRequestList().add(request);
                            userAccount.getWorkQueue().getWorkRequestList().add(request);
                        }
                        //work request added

                        //                        GsonBuilder builder = new GsonBuilder();
                        //                        builder.setPrettyPrinting().serializeNulls();
                        //                        Gson gson = builder.create();
                        //                        System.out.println(gson.toJson(system));

                        dB4OUtil.storeSystem(system);
                        JOptionPane.showMessageDialog(null, "Prescription added successfully");

                        clearFields();
                        populateTable();

                    } catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            try{
                if(validateFields()){
                    double amount = Double.parseDouble(txtAmount.getText());
//                    Date nextPrescriptionDate = simpleDateFormat.parse(txtNextPrescriptionDate.getText());
//                    String notes = txtAreaNotes.getText();
//                    Patient patient = (Patient) cmbPatient.getSelectedItem();
//                    PatientDiagnosis patientDiagnosis = (PatientDiagnosis) cmbPatientDiagnosis.getSelectedItem();
                    prescription.setAmount(amount);
//                    prescription.setNextPrescription(nextPrescriptionDate);
//                    prescription.setNotes(notes);
//                    prescription.setPrescriptionDrugList(prescriptionDrugList);

                    try{
                        
//                        request.setReceiver(userAccount);
//                        request.setStatus("Medicines provided");
//                        request.setStatus2("Medicines provided");
                        
                        dB4OUtil.storeSystem(system);
                        JOptionPane.showMessageDialog(null, "Prescription updated successfully");
                        clearFields();
                        populateTable();                        
//                        btnAdd.setText("Add");
                    } catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    public void populatePatientComboBox(){
        cmbPatient.removeAllItems();
        
        for (Patient patient : system.getPatientDirectory().getPatientList()){
            cmbPatient.addItem(patient);
        }
    }
    
    public void populatePatientDiagnosisComboBox(Patient patient){
        cmbPatientDiagnosis.removeAllItems();
        
        for (PatientDiagnosis diagnosis : patient.getPatientDiagnosisList()){
            cmbPatientDiagnosis.addItem(diagnosis);
        }
    }
    
    public void populateTable() {
                       
//        Organization org = null;
//        for (Organization organization : currentEnterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof PharmacyOrganization){
//                org = organization;
//                break;
//            }
//        }
        DefaultTableModel model = (DefaultTableModel) tblPrescription.getModel();
        model.setRowCount(0);
        
//        Network currentNetwork;
//        for(Network network : system.getNetworkList()){            
//            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
//                if(enterprise.equals(currentEnterprise)){
//                    currentNetwork = network;
//                    break;
//                }
//            }
//        }
//        
        
        
//        for(Network network : system.getNetworkList()){            
//            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
//                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//                    
//                }
//            }
//        }
        
        for(Patient patient: system.getPatientDirectory().getPatientList()){
            for(PatientDiagnosis patientDiagnosis: patient.getPatientDiagnosisList()){
                for(PatientPrescription patientPrescription: patientDiagnosis.getPatientPrescriptionList()){
                    if(patientPrescription.getReceiver1() == null || userAccount.equals(patientPrescription.getReceiver1()) ){
                        Object[] row = new Object[5];
                        row[0] = patient;
                        row[1] = patientDiagnosis;
                        row[2] = patientPrescription.getAmount() == 0 ? "" : patientPrescription.getAmount();
                        row[3] = simpleDateFormat.format(patientPrescription.getNextPrescription());
                        row[4] = patientPrescription;
                        model.addRow(row);
                    }
                }
            }
        }
        
//        for(WorkRequest request: pharmacyOrganization.getWorkQueue().getWorkRequestList()){
//            for(Patient patient: system.getPatientDirectory().getPatientList()){
//                for(PatientDiagnosis diagnosis: patient.getPatientDiagnosisList()){
//                    if(diagnosis.equals(request.getDiagnosis())){
//                        Object[] row = new Object[6];
//                        row[0] = patient;
//                        row[1] = request.getDiagnosis();
//                        row[2] = request.getPrescription().getAmount() == 0 ? "" : prescription.getAmount();
//                        row[3] = simpleDateFormat.format(request.getPrescription().getNextPrescription());
//                        row[4] = request.getPrescription();
//                        row[5] = request;
//                        model.addRow(row);
//                    }
//                }
//            
//            }
//        }
//            for(Patient patient: system.getPatientDirectory().getPatientList()){
//                if(request.getPrescription())
//            }
//            Object[] row = new Object[5];
//            row[0] = patient;
//            row[1] = diagnosis;
//            row[2] = prescription.getAmount() == 0 ? "" : prescription.getAmount();
//            row[3] = simpleDateFormat.format(prescription.getNextPrescription());
//            row[4] = prescription;
//            model.addRow(row);
//        }
//        for(Patient patient: system.getPatientDirectory().getPatientList()){
//            for(PatientDiagnosis diagnosis: patient.getPatientDiagnosisList()){
//                for(PatientPrescription prescription: diagnosis.getPatientPrescriptionList()){
//                    Object[] row = new Object[5];
//                    row[0] = patient;
//                    row[1] = diagnosis;
//                    row[2] = prescription.getAmount() == 0 ? "" : prescription.getAmount();
//                    row[3] = simpleDateFormat.format(prescription.getNextPrescription());
//                    row[4] = prescription;
//                    model.addRow(row);            
//                }
//            }
//        }        
    }
    
    public void populateDrugTable(){
        DefaultTableModel model = (DefaultTableModel) tblPrescriptionDetails.getModel();
        model.setRowCount(0);        
        for (PrescriptionDrugs drug : prescriptionDrugList) {
            Object[] row = new Object[2];
            row[0] = drug;
            row[1] = drug.getDrugQuantity();                                
            model.addRow(row);            
        }
    }

    public void clearFields() {
        txtAmount.setText("");
//        txtNextPrescriptionDate.setText("");
//        txtAreaNotes.setText("");        
//        DefaultTableModel model = (DefaultTableModel) tblPrescriptionDetails.getModel();
//        model.setRowCount(0);
//        prescriptionDrugList = new ArrayList<>();
    }
    
    public boolean validateFields(){
        
        
        try{                       
            Double.parseDouble(txtAmount.getText());            
        } catch (NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Please enter valid amount", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox cmbPatient;
    private javax.swing.JComboBox cmbPatientDiagnosis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblPrescription;
    private javax.swing.JTable tblPrescriptionDetails;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextArea txtAreaNotes;
    private javax.swing.JFormattedTextField txtNextPrescriptionDate;
    // End of variables declaration//GEN-END:variables
}