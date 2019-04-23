/*
 * TeleHealthView.java
 */

package telehealth;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.telehealth.Business.DB4OUtil.DB4OUtil;
import com.telehealth.Business.EcoSystem;
import com.telehealth.Business.Enterprise.Enterprise;
import com.telehealth.Business.Network.Network;
import com.telehealth.Business.Organization.Organization;
import com.telehealth.Business.UserAccount.UserAccount;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * The application's main frame.
 */
public class TeleHealthView extends FrameView {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private String message;
    private JPanel currentPanel;
    private TitlePanel titlePanel;
    
    public TeleHealthView(SingleFrameApplication app) {
        super(app);

        initComponents();
        
        currentPanel = new JPanel(new BorderLayout());
        titlePanel = new TitlePanel();
        
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting().serializeNulls();
        Gson gson = builder.create();
        System.out.println(gson.toJson(system));
        
        system = dB4OUtil.retrieveSystem();
        
//        dB4OUtil.storeSystem(system);

        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusMessageLabel.setText("");
            }
        });
        messageTimer.setRepeats(false);
        int busyAnimationRate = resourceMap.getInteger("StatusBar.busyAnimationRate");
        for (int i = 0; i < busyIcons.length; i++) {
            busyIcons[i] = resourceMap.getIcon("StatusBar.busyIcons[" + i + "]");
        }
        busyIconTimer = new Timer(busyAnimationRate, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                busyIconIndex = (busyIconIndex + 1) % busyIcons.length;
                statusAnimationLabel.setIcon(busyIcons[busyIconIndex]);
            }
        });
        idleIcon = resourceMap.getIcon("StatusBar.idleIcon");
        statusAnimationLabel.setIcon(idleIcon);
        progressBar.setVisible(false);

        // connecting action tasks to status bar via TaskMonitor
        TaskMonitor taskMonitor = new TaskMonitor(getApplication().getContext());
        taskMonitor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                String propertyName = evt.getPropertyName();
                if ("started".equals(propertyName)) {
                    if (!busyIconTimer.isRunning()) {
                        statusAnimationLabel.setIcon(busyIcons[0]);
                        busyIconIndex = 0;
                        busyIconTimer.start();
                    }
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(true);
                } else if ("done".equals(propertyName)) {
                    busyIconTimer.stop();
                    statusAnimationLabel.setIcon(idleIcon);
                    progressBar.setVisible(false);
                    progressBar.setValue(0);
                } else if ("message".equals(propertyName)) {
                    String text = (String)(evt.getNewValue());
                    statusMessageLabel.setText((text == null) ? "" : text);
                    messageTimer.restart();
                } else if ("progress".equals(propertyName)) {
                    int value = (Integer)(evt.getNewValue());
                    progressBar.setVisible(true);
                    progressBar.setIndeterminate(false);
                    progressBar.setValue(value);
                }
            }
        });
    }

    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = TeleHealthApp.getApplication().getMainFrame();
            aboutBox = new TeleHealthAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        TeleHealthApp.getApplication().show(aboutBox);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        javax.swing.JMenu fileMenu = new javax.swing.JMenu();
        jmiNetwork = new javax.swing.JMenuItem();
        jmiOrganization = new javax.swing.JMenuItem();
        jmiUserAccount = new javax.swing.JMenuItem();
        jmiPatient = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JMenuItem exitMenuItem = new javax.swing.JMenuItem();
        javax.swing.JMenu helpMenu = new javax.swing.JMenu();
        javax.swing.JMenuItem aboutMenuItem = new javax.swing.JMenuItem();
        statusPanel = new javax.swing.JPanel();
        javax.swing.JSeparator statusPanelSeparator = new javax.swing.JSeparator();
        statusMessageLabel = new javax.swing.JLabel();
        statusAnimationLabel = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();

        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                mainPanelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        mainPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                mainPanelComponentResized(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        menuBar.setName("menuBar"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(telehealth.TeleHealthApp.class).getContext().getResourceMap(TeleHealthView.class);
        fileMenu.setText(resourceMap.getString("fileMenu.text")); // NOI18N
        fileMenu.setFont(resourceMap.getFont("fileMenu.font")); // NOI18N
        fileMenu.setName("fileMenu"); // NOI18N

        jmiNetwork.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmiNetwork.setText(resourceMap.getString("jmiNetwork.text")); // NOI18N
        jmiNetwork.setName("jmiNetwork"); // NOI18N
        jmiNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNetworkActionPerformed(evt);
            }
        });
        fileMenu.add(jmiNetwork);

        jmiOrganization.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.META_MASK));
        jmiOrganization.setText(resourceMap.getString("jmiOrganization.text")); // NOI18N
        jmiOrganization.setName("jmiOrganization"); // NOI18N
        fileMenu.add(jmiOrganization);

        jmiUserAccount.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.META_MASK));
        jmiUserAccount.setText(resourceMap.getString("jmiUserAccount.text")); // NOI18N
        jmiUserAccount.setName("jmiUserAccount"); // NOI18N
        fileMenu.add(jmiUserAccount);

        jmiPatient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.META_MASK));
        jmiPatient.setText(resourceMap.getString("jmiPatient.text")); // NOI18N
        jmiPatient.setName("jmiPatient"); // NOI18N
        fileMenu.add(jmiPatient);

        jSeparator1.setName("jSeparator1"); // NOI18N
        fileMenu.add(jSeparator1);

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(telehealth.TeleHealthApp.class).getContext().getActionMap(TeleHealthView.class, this);
        exitMenuItem.setAction(actionMap.get("quit")); // NOI18N
        exitMenuItem.setFont(resourceMap.getFont("exitMenuItem.font")); // NOI18N
        exitMenuItem.setName("exitMenuItem"); // NOI18N
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        helpMenu.setText(resourceMap.getString("helpMenu.text")); // NOI18N
        helpMenu.setFont(resourceMap.getFont("helpMenu.font")); // NOI18N
        helpMenu.setName("helpMenu"); // NOI18N

        aboutMenuItem.setAction(actionMap.get("showAboutBox")); // NOI18N
        aboutMenuItem.setFont(resourceMap.getFont("aboutMenuItem.font")); // NOI18N
        aboutMenuItem.setName("aboutMenuItem"); // NOI18N
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        statusPanel.setName("statusPanel"); // NOI18N

        statusPanelSeparator.setName("statusPanelSeparator"); // NOI18N

        statusMessageLabel.setName("statusMessageLabel"); // NOI18N

        statusAnimationLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        statusAnimationLabel.setName("statusAnimationLabel"); // NOI18N

        progressBar.setName("progressBar"); // NOI18N

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusPanelSeparator, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(statusMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1040, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusAnimationLabel)
                .addContainerGap())
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addComponent(statusPanelSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusMessageLabel)
                    .addComponent(statusAnimationLabel)
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        setComponent(mainPanel);
        setMenuBar(menuBar);
        setStatusBar(statusPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void mainPanelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_mainPanelAncestorAdded
        // TODO add your handling code here:
        
        boolean loginFlag = true;
        login();
    }//GEN-LAST:event_mainPanelAncestorAdded

    private void jmiNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNetworkActionPerformed
        // TODO add your handling code here:
        currentPanel.removeAll();
        currentPanel.invalidate();
        
        NetworkPanel networkPanel = new NetworkPanel(this, system);
        currentPanel = networkPanel;
        Dimension dim = getMainPanelDimension();
        titlePanel.setTitle("Network Panel");
        titlePanel.setSize(1200, 50);
        titlePanel.setBounds((int) dim.getWidth(), (int) dim.getHeight(), 1200, 50);
        currentPanel.setBounds((int) dim.getWidth(), (int) dim.getHeight() + 55, 1200, 640);
        mainPanel.add(titlePanel);
        mainPanel.add(currentPanel);
        
        currentPanel.repaint();
        currentPanel.revalidate();
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_jmiNetworkActionPerformed

    private void mainPanelComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_mainPanelComponentResized
        // TODO add your handling code here:
        Dimension dim=getMainPanelDimension();
        currentPanel.setBounds((int)dim.getWidth(),(int)dim.getHeight()+55,1200,640);
        titlePanel.setBounds((int)dim.getWidth(),(int)dim.getHeight(),1200,50);
    }//GEN-LAST:event_mainPanelComponentResized
    
    public void login(){
        boolean loginFlag = true;
        UserAccount userAccount1 = new UserAccount();
        LoginPanel _login = new LoginPanel(userAccount1);
                
        while (loginFlag) {
            UIManager.put("OptionPane.okButtonText", "LOGIN");
            UIManager.put("OptionPane.cancelButtonText", "CLOSE");
            int option = JOptionPane.showConfirmDialog(mainPanel, _login, "PLEASE LOGIN", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            UIManager.put("OptionPane.okButtonText", "OK");
            UIManager.put("OptionPane.cancelButtonText", "CLOSE");
            
            Enterprise inEnterprise=null;
            Organization inOrganization=null;
        
            if (option == 0)
            {
                UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userAccount1.getUsername(), userAccount1.getPassword());
                    if(userAccount==null){
                    //Step 2: Go inside each network and check each enterprise
                    for(Network network:system.getNetworkList()){
                        //Step 2.a: check against each enterprise
                        for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                            userAccount=enterprise.getUserAccountDirectory().authenticateUser(userAccount1.getUsername(), userAccount1.getPassword());
                            if(userAccount==null){
                               //Step 3:check against each organization for each enterprise
                               for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                                   userAccount=organization.getUserAccountDirectory().authenticateUser(userAccount1.getUsername(), userAccount1.getPassword());
                                   if(userAccount!=null){
                                       inEnterprise=enterprise;
                                       inOrganization=organization;
                                       break;
                                   }
                               }
                            }
                            else{
                               inEnterprise=enterprise;
                               break;
                            }
                            if(inOrganization!=null){
                                break;
                            }  
                        }
                        if(inEnterprise!=null){
                            break;
                        }
                    }
                }
                if(userAccount==null){
                    JOptionPane.showMessageDialog(null, "Invalid credentials");                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Login successful!!");
                    GsonBuilder builder = new GsonBuilder();
                    builder.setPrettyPrinting().serializeNulls();
                    Gson gson = builder.create();
                    System.out.println(gson.toJson(system));
                    
                    system.getUserAccountDirectory().getUserAccountList().get(0).setUsername("a");
                    system.getUserAccountDirectory().getUserAccountList().get(0).setPassword("a");
                    dB4OUtil.storeSystem(system);
                    
                    loginFlag = false;
                }
            } else {              
                System.exit(0);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem jmiNetwork;
    private javax.swing.JMenuItem jmiOrganization;
    private javax.swing.JMenuItem jmiPatient;
    private javax.swing.JMenuItem jmiUserAccount;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusAnimationLabel;
    private javax.swing.JLabel statusMessageLabel;
    private javax.swing.JPanel statusPanel;
    // End of variables declaration//GEN-END:variables

    private final Timer messageTimer;
    private final Timer busyIconTimer;
    private final Icon idleIcon;
    private final Icon[] busyIcons = new Icon[15];
    private int busyIconIndex = 0;

    private JDialog aboutBox;
    
    public Dimension getMainPanelDimension()
    {
        Dimension d = mainPanel.getSize();
        if(d.getWidth()>1200 && d.getHeight()<=700)
        {
            d.setSize((d.getWidth()-1200)/2, 0);
        }
        else if(d.getWidth()<=1200 && d.getHeight()>700)
        {
            d.setSize(0, (d.getWidth()-1200)/2-10);
        }
        else if(d.getWidth()>1200 && d.getHeight()>700)
        {
            d.setSize((d.getWidth()-1200)/2, ((d.getHeight()-700)/2)-10);
        }
        else
        {
            d.setSize(0,0);
        }
        return d;

    }
}
