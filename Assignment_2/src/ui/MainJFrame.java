/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Dimension;
import model.Address;
import model.Person;
import model.PersonDirectory;
import ui.PersonManager.ListPersonJPanel;
import ui.PersonManager.ManagePersonJPanel;


/**
 *
 * @author Rohit Gunnelly
 */
public class MainJFrame extends javax.swing.JFrame {
    private PersonDirectory personDirectory;


    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.personDirectory = new PersonDirectory();
        this.setPreferredSize(new Dimension(1100, 900));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        generateDemoData();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnListPerson = new javax.swing.JButton();
        btnManagePerson = new javax.swing.JButton();
        workAreaJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(153, 204, 255));
        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mainPanel.setLayout(new java.awt.CardLayout());

        btnListPerson.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnListPerson.setText("List Persons");
        btnListPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListPersonActionPerformed(evt);
            }
        });

        btnManagePerson.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnManagePerson.setText("Manage Person");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnManagePerson)
                .addGap(34, 34, 34)
                .addComponent(btnListPerson)
                .addContainerGap(365, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        workAreaJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workAreaJPanel);

        mainPanel.add(jSplitPane1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListPersonActionPerformed
        // TODO add your handling code here:
        ListPersonJPanel panel = new ListPersonJPanel(workAreaJPanel, personDirectory);
        workAreaJPanel.add("ListPersonJPanel", panel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnListPersonActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel panel = new ManagePersonJPanel(workAreaJPanel, personDirectory);
        workAreaJPanel.add("ManagePersonJPanel", panel);
        CardLayout layout = (CardLayout) workAreaJPanel.getLayout();
        layout.next(workAreaJPanel);
    }//GEN-LAST:event_btnManagePersonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListPerson;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel workAreaJPanel;
    // End of variables declaration//GEN-END:variables
 private void generateDemoData() {
    Person newPerson = personDirectory.addPerson();
    newPerson.setFirstName("Rohit");
    newPerson.setLastName("Sharma");
    newPerson.setAge(30);
    newPerson.setSsn("222222222");
    Address home1 = new Address("123 Main St", "Apt 101", "Boston", "MA", "02115", "123456789");
    Address work1 = new Address("456 Business Rd", "Suite 500", "Boston", "MA", "02115", "987654321");
    newPerson.setHomeAddress(home1);
    newPerson.setWorkAddress(work1);

    Person person1 = personDirectory.addPerson();
    person1.setFirstName("Neha");
    person1.setLastName("Kapoor");
    person1.setSsn("333333333");
    person1.setAge(28);
    Address homeAddress1 = new Address("789 Elm St", "Apt 202", "Seattle", "WA", "98101", "567891234");
    Address workAddress1 = new Address("321 Corporate Blvd", "Floor 12", "Seattle", "WA", "98101", "876543210");
    person1.setHomeAddress(homeAddress1);
    person1.setWorkAddress(workAddress1);

    Person person2 = personDirectory.addPerson();
    person2.setFirstName("Aarav");
    person2.setLastName("Patel");
    person2.setSsn("444444444");
    person2.setAge(35);
    Address homeAddress2 = new Address("100 Pine St", "Apt 303", "San Francisco", "CA", "94105", "345678901");
    Address workAddress2 = new Address("200 Tech Way", "Building A", "San Francisco", "CA", "94105", "654321098");
    person2.setHomeAddress(homeAddress2);
    person2.setWorkAddress(workAddress2);

    Person person3 = personDirectory.addPerson();
    person3.setFirstName("Maya");
    person3.setLastName("Singh");
    person3.setSsn("555555555");
    person3.setAge(26);
    Address homeAddress3 = new Address("500 Oak Ave", "Apt 404", "Austin", "TX", "78701", "432109876"); 
    Address workAddress3 = new Address("700 Market St", "Suite 100", "Austin", "TX", "78701", "789012345");
    person3.setHomeAddress(homeAddress3);
    person3.setWorkAddress(workAddress3);

    Person person4 = personDirectory.addPerson();
    person4.setFirstName("Ishaan");
    person4.setLastName("Verma");
    person4.setSsn("666666666");
    person4.setAge(29);
    Address homeAddress4 = new Address("1500 River Rd", "Apt 505", "Chicago", "IL", "60601", "123890456");
    Address workAddress4 = new Address("800 Loop St", "Floor 5", "Chicago", "IL", "60601", "890123456");
    person4.setHomeAddress(homeAddress4);
    person4.setWorkAddress(workAddress4);
}
}
