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
import com.telehealth.Business.Patient.PatientDiagnosis;
import com.telehealth.Business.UserAccount.UserAccount;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RASHMI
 */
public class DiagnosisPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiagnosisPanel
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    String pattern = "MM/dd/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    int table_selected_row;
    UserAccount userAccount;
    PatientDiagnosis patientDiagnosis;
    Patient patient;
    Enterprise currentEnterprise;
    Organization currentOrganization;    
    
    public DiagnosisPanel(TeleHealthView teleHealthView, EcoSystem system, Enterprise currentEnterprise, Organization currentOrganization, UserAccount userAccount) {
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
        txtBloodPressureSystolic = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBloodPressureDiastolic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        heartRateTextFeild = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        respiratoryRateTextFeild = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weightTextFeild = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        diagnosisDateTextField = new javax.swing.JFormattedTextField();
        nextDiagnosisDateTextField = new javax.swing.JFormattedTextField();
        diagnosisDetailTextFeild = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        notesTextArea = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiagnosis = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        cmbPatient = new javax.swing.JComboBox();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(telehealth.TeleHealthApp.class).getContext().getResourceMap(DiagnosisPanel.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        txtBloodPressureSystolic.setFont(resourceMap.getFont("txtBloodPressureSystolic.font")); // NOI18N
        txtBloodPressureSystolic.setName("txtBloodPressureSystolic"); // NOI18N

        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        txtBloodPressureDiastolic.setFont(resourceMap.getFont("txtBloodPressureDiastolic.font")); // NOI18N
        txtBloodPressureDiastolic.setName("txtBloodPressureDiastolic"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        heartRateTextFeild.setFont(resourceMap.getFont("heartRateTextFeild.font")); // NOI18N
        heartRateTextFeild.setName("heartRateTextFeild"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        respiratoryRateTextFeild.setFont(resourceMap.getFont("respiratoryRateTextFeild.font")); // NOI18N
        respiratoryRateTextFeild.setName("respiratoryRateTextFeild"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        weightTextFeild.setFont(resourceMap.getFont("weightTextFeild.font")); // NOI18N
        weightTextFeild.setName("weightTextFeild"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jLabel7.setFont(resourceMap.getFont("jLabel7.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N

        jLabel8.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        try {
            diagnosisDateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        diagnosisDateTextField.setName("diagnosisDateTextField"); // NOI18N

        try {
            nextDiagnosisDateTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        nextDiagnosisDateTextField.setName("nextDiagnosisDateTextField"); // NOI18N

        diagnosisDetailTextFeild.setFont(resourceMap.getFont("diagnosisDetailTextFeild.font")); // NOI18N
        diagnosisDetailTextFeild.setName("diagnosisDetailTextFeild"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        notesTextArea.setColumns(20);
        notesTextArea.setRows(5);
        notesTextArea.setName("notesTextArea"); // NOI18N
        jScrollPane2.setViewportView(notesTextArea);

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

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tblDiagnosis.setFont(resourceMap.getFont("tblDiagnosis.font")); // NOI18N
        tblDiagnosis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient", "BP Systolic", "BP Diastolic", "Heart Rate", "Respiratory Rate", "Diagnosis Date", "Next Diagnosis Date", "Details", "Notes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiagnosis.setName("tblDiagnosis"); // NOI18N
        tblDiagnosis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiagnosisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDiagnosis);
        if (tblDiagnosis.getColumnModel().getColumnCount() > 0) {
            tblDiagnosis.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title8")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title0")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title1")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title2")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title3")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(5).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title4")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(6).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title5")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(7).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title6")); // NOI18N
            tblDiagnosis.getColumnModel().getColumn(8).setHeaderValue(resourceMap.getString("tblDiagnosis.columnModel.title7")); // NOI18N
        }

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        cmbPatient.setName("cmbPatient"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBloodPressureDiastolic)
                    .addComponent(txtBloodPressureSystolic)
                    .addComponent(heartRateTextFeild)
                    .addComponent(respiratoryRateTextFeild)
                    .addComponent(weightTextFeild)
                    .addComponent(cmbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diagnosisDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diagnosisDetailTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextDiagnosisDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnDelete)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbPatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBloodPressureSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(diagnosisDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBloodPressureDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(nextDiagnosisDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(heartRateTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(diagnosisDetailTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(respiratoryRateTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDiagnosisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiagnosisMouseClicked
        // TODO add your handling code here:
        try
        {
            
            if (evt.getClickCount() == 2){
                table_selected_row = tblDiagnosis.getSelectedRow();
                patientDiagnosis = (PatientDiagnosis)tblDiagnosis.getValueAt(table_selected_row, 7);
                patient = (Patient)tblDiagnosis.getValueAt(table_selected_row, 0);
                
                cmbPatient.setSelectedItem((Patient)tblDiagnosis.getValueAt(table_selected_row, 0));
                txtBloodPressureSystolic.setText(patientDiagnosis.getBpSystolic()+"");
                txtBloodPressureDiastolic.setText(patientDiagnosis.getBpDiastolic()+"");
                heartRateTextFeild.setText(patientDiagnosis.getHeartRate()+"");
                respiratoryRateTextFeild.setText(patientDiagnosis.getRespiratoryRate()+"");
                weightTextFeild.setText(patientDiagnosis.getWeight()+"");
                diagnosisDateTextField.setText(simpleDateFormat.format(patientDiagnosis.getDiagnosisDate()));
                nextDiagnosisDateTextField.setText(simpleDateFormat.format(patientDiagnosis.getNextDiagnosisDate()));
                diagnosisDetailTextFeild.setText(patientDiagnosis.getDiagnosisDetails());
                notesTextArea.setText(patientDiagnosis.getNotes());
                btnAdd.setText("Update");
                btnDelete.setVisible(true);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblDiagnosisMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Patient patient = (Patient)cmbPatient.getSelectedItem();
        
        if(btnAdd.getText().equals("Add")){
            try{
                if(validateFields()){
                    PatientDiagnosis diagnosis = new PatientDiagnosis(
                        Integer.parseInt(txtBloodPressureSystolic.getText()), 
                        Integer.parseInt(txtBloodPressureDiastolic.getText()), 
                        Integer.parseInt(heartRateTextFeild.getText()), 
                        Integer.parseInt(respiratoryRateTextFeild.getText()), 
                        Double.parseDouble(weightTextFeild.getText()),
                        simpleDateFormat.parse(diagnosisDateTextField.getText()), 
                        simpleDateFormat.parse(nextDiagnosisDateTextField.getText()), 
                        diagnosisDetailTextFeild.getText(), 
                        notesTextArea.getText());

                    PatientDiagnosis patientDiagnosis = patient.createAndAddPatientDiagnosis(diagnosis);

                    try{
                        dB4OUtil.storeSystem(system);
                        clearFields();
                        populateTable();
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        } else {
            try{
                if(validateFields()){
                    patientDiagnosis.setBpSystolic(Integer.parseInt(txtBloodPressureSystolic.getText()));
                    patientDiagnosis.setBpDiastolic(Integer.parseInt(txtBloodPressureDiastolic.getText()));
                    patientDiagnosis.setHeartRate(Integer.parseInt(heartRateTextFeild.getText()));
                    patientDiagnosis.setRespiratoryRate(Integer.parseInt(respiratoryRateTextFeild.getText()));
                    patientDiagnosis.setWeight(Double.parseDouble(weightTextFeild.getText()));
                    patientDiagnosis.setDiagnosisDate(simpleDateFormat.parse(diagnosisDateTextField.getText()));
                    patientDiagnosis.setNextDiagnosisDate(simpleDateFormat.parse(nextDiagnosisDateTextField.getText()));
                    patientDiagnosis.setDiagnosisDetails(diagnosisDetailTextFeild.getText());
                    patientDiagnosis.setNotes(notesTextArea.getText());
                                                               
                    try{
                        dB4OUtil.storeSystem(system);
                        clearFields();
                        populateTable();
                        btnDelete.setVisible(false);
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, "Delete Diagnosis", "Are you sure you want to delete this diagnosis?", JOptionPane.YES_NO_OPTION);
        if(selectedOption == JOptionPane.OK_OPTION){
            patient.getPatientDiagnosisList().remove(patientDiagnosis);            
            try{
                dB4OUtil.storeSystem(system);
                clearFields();
                populateTable();
                btnDelete.setVisible(false);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cmbPatient;
    private javax.swing.JFormattedTextField diagnosisDateTextField;
    private javax.swing.JTextField diagnosisDetailTextFeild;
    private javax.swing.JTextField heartRateTextFeild;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField nextDiagnosisDateTextField;
    private javax.swing.JTextArea notesTextArea;
    private javax.swing.JTextField respiratoryRateTextFeild;
    private javax.swing.JTable tblDiagnosis;
    private javax.swing.JTextField txtBloodPressureDiastolic;
    private javax.swing.JTextField txtBloodPressureSystolic;
    private javax.swing.JTextField weightTextFeild;
    // End of variables declaration//GEN-END:variables


    public void populatePatientComboBox(){
        cmbPatient.removeAllItems();
        
        for (Patient patient : system.getPatientDirectory().getPatientList()){
            cmbPatient.addItem(patient);
        }
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblDiagnosis.getModel();

        model.setRowCount(0);
        for (Patient patient : system.getPatientDirectory().getPatientList()) {
            for (PatientDiagnosis diagnosis : patient.getPatientDiagnosisList()) {            
                Object[] row = new Object[9];
                row[0] = patient;
                row[1] = diagnosis.getBpSystolic();
                row[2] = diagnosis.getBpDiastolic();                    
                row[3] = diagnosis.getHeartRate();
                row[4] = diagnosis.getRespiratoryRate();
                row[5] = simpleDateFormat.format(diagnosis.getDiagnosisDate());
                row[6] = simpleDateFormat.format(diagnosis.getNextDiagnosisDate());
                row[7] = diagnosis;
                row[8] = diagnosis.getNotes();
                model.addRow(row);                
            }
        }
    }
    
    public void clearFields(){
        Date today = new Date();
        populatePatientComboBox();
        txtBloodPressureSystolic.setText("");
        txtBloodPressureDiastolic.setText("");
        heartRateTextFeild.setText("");
        respiratoryRateTextFeild.setText("");
        weightTextFeild.setText("");
        diagnosisDateTextField.setText(simpleDateFormat.format(today));
        nextDiagnosisDateTextField.setText(simpleDateFormat.format(today));
        diagnosisDetailTextFeild.setText("");
        notesTextArea.setText("");
                
    }
    
    public boolean validateFields(){
        
        if(txtBloodPressureSystolic.getText().equals("") || 
            txtBloodPressureDiastolic.getText().equals("") || 
            heartRateTextFeild.getText().equals("") || 
            respiratoryRateTextFeild.getText().equals("") || 
            weightTextFeild.getText().equals("") || 
            diagnosisDateTextField.getText().equals("") || 
            nextDiagnosisDateTextField.getText().equals("") || 
            diagnosisDetailTextFeild.getText().equals("") || 
            notesTextArea.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields are mandatory", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try{
            Integer.parseInt(txtBloodPressureSystolic.getText()); 
            Integer.parseInt(txtBloodPressureDiastolic.getText());
            Integer.parseInt(heartRateTextFeild.getText());
            Integer.parseInt(respiratoryRateTextFeild.getText());
            Double.parseDouble(weightTextFeild.getText());
            simpleDateFormat.parse(diagnosisDateTextField.getText()); 
            simpleDateFormat.parse(nextDiagnosisDateTextField.getText());
            
        } catch (NumberFormatException ne){
            JOptionPane.showMessageDialog(null, "Please enter valid values", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        } catch (ParseException pe){
            JOptionPane.showMessageDialog(null, "Please enter valid values", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        
        return true;
    }
}