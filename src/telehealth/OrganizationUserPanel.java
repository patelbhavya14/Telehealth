/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telehealth;

import com.telehealth.Business.DB4OUtil.DB4OUtil;
import com.telehealth.Business.EcoSystem;
import com.telehealth.Business.Employee.Employee;
import com.telehealth.Business.Enterprise.Enterprise;
import com.telehealth.Business.Network.Network;
import com.telehealth.Business.UserAccount.UserAccount;
import com.telehealth.Business.Organization.Organization;
import com.telehealth.Business.Role.HospitalRole;
import com.telehealth.Utility.CommonUtility;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhaVYa
 */
public class OrganizationUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganizationUserPanel
     */
    Enterprise enterprise;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private int networkId;
    int table_selected_row;
    UserAccount userAccount;

    public OrganizationUserPanel(TeleHealthView teleHealthView, EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        populateOrganizationCombolist();
        this.system = system;
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
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JFormattedTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEntAdmin = new javax.swing.JTable();
        cmbOrganization = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(telehealth.TeleHealthApp.class).getContext().getResourceMap(OrganizationUserPanel.class);
        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        txtUsername.setFont(resourceMap.getFont("txtUsername.font")); // NOI18N
        txtUsername.setName("txtUsername"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        pwdPassword.setFont(resourceMap.getFont("pwdPassword.font")); // NOI18N
        pwdPassword.setName("pwdPassword"); // NOI18N

        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        txtName.setFont(resourceMap.getFont("txtName.font")); // NOI18N
        txtName.setName("txtName"); // NOI18N

        jLabel6.setFont(resourceMap.getFont("jLabel6.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        txtEmail.setFont(resourceMap.getFont("txtEmail.font")); // NOI18N
        txtEmail.setName("txtEmail"); // NOI18N

        jLabel9.setFont(resourceMap.getFont("jLabel9.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N

        try {
            txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPhone.setFont(resourceMap.getFont("txtPhone.font")); // NOI18N
        txtPhone.setName("txtPhone"); // NOI18N

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

        tblEntAdmin.setFont(resourceMap.getFont("tblEntAdmin.font")); // NOI18N
        tblEntAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization", "Username", "Name", "Email", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEntAdmin.setName("tblEntAdmin"); // NOI18N
        tblEntAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEntAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEntAdmin);
        if (tblEntAdmin.getColumnModel().getColumnCount() > 0) {
            tblEntAdmin.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("tblEntAdmin.columnModel.title1")); // NOI18N
            tblEntAdmin.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("tblEntAdmin.columnModel.title2")); // NOI18N
            tblEntAdmin.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("tblEntAdmin.columnModel.title3")); // NOI18N
            tblEntAdmin.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("tblEntAdmin.columnModel.title4")); // NOI18N
            tblEntAdmin.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("tblEntAdmin.columnModel.title5")); // NOI18N
        }

        cmbOrganization.setFont(resourceMap.getFont("cmbOrganization.font")); // NOI18N
        cmbOrganization.setName("cmbOrganization"); // NOI18N

        jLabel10.setFont(resourceMap.getFont("jLabel10.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(429, 429, 429)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(484, 484, 484))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pwdPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                .addComponent(txtUsername)
                                .addComponent(cmbOrganization, 0, 199, Short.MAX_VALUE))
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (btnAdd.getText().equals("Add")) {

            if (validateFields()) {
                Organization org = (Organization) cmbOrganization.getSelectedItem();
                String username = txtUsername.getText();
                String password = String.valueOf(pwdPassword.getPassword());
                String name = txtName.getText();
                String email = txtEmail.getText();
                String phone = txtPhone.getText();

                Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
                employee.setEmail(email);
                employee.setPhone(phone);

                org.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalRole());

                try {
                    dB4OUtil.storeSystem(system);
                    clearFields();
                    populateTable();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } else {
            if (validateFields()) {

                userAccount.setUsername(txtUsername.getText());
                userAccount.setPassword(String.valueOf(pwdPassword.getPassword()));
                Employee employee = userAccount.getEmployee();
                employee.setName(txtName.getText());
                employee.setEmail(txtEmail.getText());
                employee.setPhone(txtPhone.getText());

                try {
                    dB4OUtil.storeSystem(system);
                    clearFields();
                    populateTable();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedOption = JOptionPane.showConfirmDialog(null, "Delete User Account", "Are you sure you want to delete this account?", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.OK_OPTION) {
            Organization org = (Organization) tblEntAdmin.getValueAt(table_selected_row, 0);

            org.getUserAccountDirectory().getUserAccountList().remove(userAccount);
            try {
                dB4OUtil.storeSystem(system);
                clearFields();
                populateTable();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEntAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEntAdminMouseClicked
        // TODO add your handling code here:
        try {

            if (evt.getClickCount() == 2) {
                table_selected_row = tblEntAdmin.getSelectedRow();
                userAccount = (UserAccount) tblEntAdmin.getValueAt(table_selected_row, 1);
                Organization org = (Organization) tblEntAdmin.getValueAt(table_selected_row, 0);

                cmbOrganization.setSelectedItem(org);
                txtUsername.setText(userAccount.getUsername());
                pwdPassword.setText(userAccount.getPassword());
                txtName.setText(userAccount.getEmployee().getName());
                txtEmail.setText(userAccount.getEmployee().getEmail());
                txtPhone.setText(userAccount.getEmployee().getPhone());

                btnAdd.setText("Update");
                btnDelete.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblEntAdminMouseClicked

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblEntAdmin.getModel();

        model.setRowCount(0);

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount userAccount : org.getUserAccountDirectory().getUserAccountList()) {
                Object[] row = new Object[5];
                row[0] = org;
                row[1] = userAccount;
                row[2] = userAccount.getEmployee().getName();
                row[3] = userAccount.getEmployee().getEmail();
                row[4] = userAccount.getEmployee().getPhone();
                model.addRow(row);
            }
        }

    }

    private void populateOrganizationCombolist() {

        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            cmbOrganization.addItem(org);
        }

    }

    public boolean validateFields() {

        if (txtUsername.getText().equals("")
                || String.valueOf(pwdPassword.getPassword()).equals("")
                || txtName.getText().equals("")
                || txtEmail.getText().equals("")
                || txtPhone.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (!CommonUtility.checkUserIfExists(txtUsername.getText())) {
            JOptionPane.showMessageDialog(null, "Username already exists", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (String.valueOf(pwdPassword.getPassword()).length() < 6) {
            JOptionPane.showMessageDialog(null, "Password length should be at least 6 characters", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
//        String regex = "^[A-Za-z0-9]+[A-Za-z0-9+_.]+@[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txtEmail.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Please enter valid email id", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        regex = "^\\(\\d{3}\\)\\d{3}-\\d{4}$";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(txtPhone.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(null, "Please enter valid phone number", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    public void clearFields() {
        txtUsername.setText("");
        pwdPassword.setText("");
        txtName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtPhone.setValue(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTable tblEntAdmin;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

}
