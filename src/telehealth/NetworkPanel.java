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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static telehealth.TeleHealthApp.logger;

/**
 *
 * @author Kinnar
 */
public class NetworkPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkPanel
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private int networkId;    
    
    public NetworkPanel(TeleHealthView teleHealthView, EcoSystem system) {
        initComponents();
        this.system = system;
        populateTable();
        btnDeleteNetwork.setVisible(false);
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
        txtNetworkName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNetwork = new javax.swing.JTable();
        btnAddNetwork = new javax.swing.JButton();
        btnDeleteNetwork = new javax.swing.JButton();

        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(telehealth.TeleHealthApp.class).getContext().getResourceMap(NetworkPanel.class);
        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        txtNetworkName.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        txtNetworkName.setText(resourceMap.getString("txtNetworkName.text")); // NOI18N
        txtNetworkName.setName("txtNetworkName"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tblNetwork.setFont(resourceMap.getFont("tblNetwork.font")); // NOI18N
        tblNetwork.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network Id", "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNetwork.setName("tblNetwork"); // NOI18N
        tblNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNetworkMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNetwork);
        if (tblNetwork.getColumnModel().getColumnCount() > 0) {
            tblNetwork.getColumnModel().getColumn(0).setResizable(false);
            tblNetwork.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblNetwork.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("tblNetwork.columnModel.title0")); // NOI18N
            tblNetwork.getColumnModel().getColumn(1).setResizable(false);
            tblNetwork.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblNetwork.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("tblNetwork.columnModel.title1")); // NOI18N
        }

        btnAddNetwork.setFont(resourceMap.getFont("btnAddNetwork.font")); // NOI18N
        btnAddNetwork.setIcon(resourceMap.getIcon("btnAddNetwork.icon")); // NOI18N
        btnAddNetwork.setText(resourceMap.getString("btnAddNetwork.text")); // NOI18N
        btnAddNetwork.setName("btnAddNetwork"); // NOI18N
        btnAddNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNetworkActionPerformed(evt);
            }
        });

        btnDeleteNetwork.setFont(resourceMap.getFont("btnDeleteNetwork.font")); // NOI18N
        btnDeleteNetwork.setIcon(resourceMap.getIcon("btnDeleteNetwork.icon")); // NOI18N
        btnDeleteNetwork.setText(resourceMap.getString("btnDeleteNetwork.text")); // NOI18N
        btnDeleteNetwork.setName("btnDeleteNetwork"); // NOI18N
        btnDeleteNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteNetworkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnDeleteNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNetworkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNetwork)
                    .addComponent(btnDeleteNetwork))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNetworkActionPerformed
        // TODO add your handling code here:
        String networkName = txtNetworkName.getText();
//        network.setName(networkName);

        if(networkName != null && !networkName.equals("")){
            boolean networkExists = false;
            if(btnAddNetwork.getText().equals("Add")){
                
                for(Network network: system.getNetworkList()){
                    if(network.getName().equals(networkName)){
                        networkExists = true;
                    }
                }
                if(!networkExists){
                    Network network = system.createAndAddNetwork();
                    network.setName(networkName);
                    
                    Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(
                            "Hospital Enterprise", Enterprise.EnterpriseType.Hospital,
                            "", "", "", "", "", "", "" , "");

                    enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(
                            "Pharmacy Enterprise", Enterprise.EnterpriseType.Pharmacy,
                            "", "", "", "", "", "", "" , "");

                    enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(
                            "Insurance Enterprise", Enterprise.EnterpriseType.Insurance,
                            "", "", "", "", "", "", "" , "");
                    dB4OUtil.storeSystem(system);
                    JOptionPane.showMessageDialog(null, "Network added successfully");
                    clearFields();
                    logger.debug("Network added");
                } else {
                    JOptionPane.showMessageDialog(null, "Network with entered name already exists", "Validation Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                int table_selected_row = tblNetwork.getSelectedRow();
//                int networkId = Integer.parseInt(tblNetwork.getValueAt(table_selected_row, 0).toString());
                Network networkToBeUpdated = null;               
                for(Network network : system.getNetworkList()){
                    if(network.getNetworkId() != networkId && network.getName().equals(networkName)){                        
                        networkExists = true;
                        break;
                    } else {                        
                        if(network.getNetworkId() == networkId){
                            logger.debug(network.getNetworkId()+"-"+network.getName());
                            networkToBeUpdated = network;
                        }
                    }
                }
                if(networkToBeUpdated != null && !networkExists){
                    networkToBeUpdated.setName(networkName);
                    dB4OUtil.storeSystem(system);
                    JOptionPane.showMessageDialog(null, "Network updated successfully");
                    clearFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Network with entered name already exists", "Validation Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            populateTable();        
        } else {
            JOptionPane.showMessageDialog(null, "Please enter Network Name", "Validation Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddNetworkActionPerformed

    private void tblNetworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNetworkMouseClicked
        // TODO add your handling code here:
        try
        {
            int table_selected_row;
            if (evt.getClickCount() == 2){
                table_selected_row = tblNetwork.getSelectedRow();
                networkId = Integer.parseInt(tblNetwork.getValueAt(table_selected_row, 0).toString());
                String networkName = tblNetwork.getValueAt(table_selected_row, 1).toString();
                txtNetworkName.setText(tblNetwork.getValueAt(table_selected_row, 1).toString());
                btnAddNetwork.setText("Update");
                btnDeleteNetwork.setVisible(true);                
            }
        } catch (Exception e){
            e.printStackTrace();
            logger.error("Exception in mouse click", e);
        }
    }//GEN-LAST:event_tblNetworkMouseClicked

    private void btnDeleteNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteNetworkActionPerformed
        // TODO add your handling code here:
        
        int selectedOption = JOptionPane.showConfirmDialog(null, "Delete Network", "Are you sure you want to delete this network?", JOptionPane.YES_NO_OPTION);
        if(selectedOption == JOptionPane.OK_OPTION){
            int table_selected_row = tblNetwork.getSelectedRow();
            networkId = Integer.parseInt(tblNetwork.getValueAt(table_selected_row, 0).toString());
            for(Network network : system.getNetworkList()){
                if(network.getNetworkId() == networkId){
                    system.getNetworkList().remove(network);
                    dB4OUtil.storeSystem(system);
                    JOptionPane.showMessageDialog(null, "Network deleted successfully");
                    clearFields();
                    populateTable();
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnDeleteNetworkActionPerformed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblNetwork.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[2];
            row[0] = network.getNetworkId();
            row[1] = network.getName();
            model.addRow(row);
        }
        
    }
    
    public void clearFields(){
        txtNetworkName.setText("");
        btnAddNetwork.setText("Add");
        btnDeleteNetwork.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNetwork;
    private javax.swing.JButton btnDeleteNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNetwork;
    private javax.swing.JTextField txtNetworkName;
    // End of variables declaration//GEN-END:variables
}
