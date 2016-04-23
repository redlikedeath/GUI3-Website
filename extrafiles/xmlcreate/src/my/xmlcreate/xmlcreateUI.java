/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.xmlcreate;

import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author nick
 */
public class xmlcreateUI extends javax.swing.JFrame {

    //string for informiaton
    public String[] information = new String[20];
    //array of orgs
    public List<organization> organizationList = new ArrayList<organization>();
    //array of dates
    public List<date> dateList = new ArrayList<date>();
    /**
     * Creates new form xmlcreateUI
     */
    public xmlcreateUI() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        tabs = new javax.swing.JTabbedPane();
        organizationTab = new javax.swing.JTabbedPane();
        organizationPane = new javax.swing.JPanel();
        nameTextFeild = new javax.swing.JTextField();
        iconTextFeild = new javax.swing.JTextField();
        advisorTextFeild = new javax.swing.JTextField();
        presidentTextFeild = new javax.swing.JTextField();
        officersTextFeild = new javax.swing.JTextField();
        membersTextFeild = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextFeild = new javax.swing.JTextArea();
        clearButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        organizationPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        organizationTextArea = new javax.swing.JTextArea();
        datetab = new javax.swing.JTabbedPane();
        datePane = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        titleTextFeild = new javax.swing.JTextField();
        desTextFeild = new javax.swing.JTextField();
        locationTextFeild = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        noteTextFeild = new javax.swing.JTextArea();
        organizationTextFeild = new javax.swing.JTextField();
        linkTextFeild = new javax.swing.JTextField();
        sMonth = new javax.swing.JComboBox<>();
        sDay = new javax.swing.JComboBox<>();
        sYear = new javax.swing.JComboBox<>();
        datePanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        quitmenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        organizationTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                organizationTabMouseClicked(evt);
            }
        });

        jLabel1.setText("name");

        jLabel2.setText("icon");

        jLabel3.setText("advisor");

        jLabel4.setText("president");

        jLabel5.setText("officers");

        jLabel7.setText("members");

        jLabel8.setText("description");

        descriptionTextFeild.setColumns(20);
        descriptionTextFeild.setRows(5);
        jScrollPane1.setViewportView(descriptionTextFeild);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout organizationPaneLayout = new javax.swing.GroupLayout(organizationPane);
        organizationPane.setLayout(organizationPaneLayout);
        organizationPaneLayout.setHorizontalGroup(
            organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organizationPaneLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(45, 45, 45)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTextFeild)
                    .addComponent(iconTextFeild)
                    .addComponent(advisorTextFeild)
                    .addComponent(presidentTextFeild)
                    .addComponent(officersTextFeild)
                    .addComponent(membersTextFeild)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, organizationPaneLayout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(clearButton)
                .addGap(27, 27, 27)
                .addComponent(submitButton)
                .addGap(150, 150, 150))
        );
        organizationPaneLayout.setVerticalGroup(
            organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organizationPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(advisorTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presidentTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(officersTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(membersTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(organizationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearButton)
                    .addComponent(submitButton))
                .addGap(19, 19, 19))
        );

        organizationTab.addTab("create", organizationPane);

        organizationTextArea.setColumns(20);
        organizationTextArea.setRows(5);
        jScrollPane2.setViewportView(organizationTextArea);

        javax.swing.GroupLayout organizationPanelLayout = new javax.swing.GroupLayout(organizationPanel);
        organizationPanel.setLayout(organizationPanelLayout);
        organizationPanelLayout.setHorizontalGroup(
            organizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                .addContainerGap())
        );
        organizationPanelLayout.setVerticalGroup(
            organizationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(organizationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                .addContainerGap())
        );

        organizationTab.addTab("current xml", organizationPanel);

        tabs.addTab("Organization", organizationTab);

        jLabel6.setText("Title");

        jLabel9.setText("description");

        jLabel10.setText("startdate");

        jLabel11.setText("enddate");

        jLabel12.setText("starttime");

        jLabel13.setText("endtime");

        jLabel14.setText("location");

        jLabel15.setText("organization");

        jLabel16.setText("note");

        jLabel17.setText("link");

        desTextFeild.setText("jTextField2");

        locationTextFeild.setText("jTextField2");

        noteTextFeild.setColumns(20);
        noteTextFeild.setRows(5);
        jScrollPane4.setViewportView(noteTextFeild);

        organizationTextFeild.setText("jTextField2");

        linkTextFeild.setText("jTextField2");

        sMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        sDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout datePaneLayout = new javax.swing.GroupLayout(datePane);
        datePane.setLayout(datePaneLayout);
        datePaneLayout.setHorizontalGroup(
            datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addGroup(datePaneLayout.createSequentialGroup()
                        .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(datePaneLayout.createSequentialGroup()
                                .addComponent(sMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(titleTextFeild)
                                .addComponent(desTextFeild)
                                .addComponent(locationTextFeild)
                                .addComponent(organizationTextFeild)
                                .addComponent(linkTextFeild)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        datePaneLayout.setVerticalGroup(
            datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePaneLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(titleTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(desTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(locationTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(organizationTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(linkTextFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        datetab.addTab("Date", datePane);

        javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        datetab.addTab("tab2", datePanel);

        tabs.addTab("Date", datetab);

        jFileMenu.setText("File");

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        jFileMenu.add(openMenuItem);

        jMenuItem2.setText("Save");
        jFileMenu.add(jMenuItem2);

        quitmenuItem.setText("Quit");
        quitmenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitmenuItemMouseClicked(evt);
            }
        });
        quitmenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitmenuItemActionPerformed(evt);
            }
        });
        jFileMenu.add(quitmenuItem);

        jMenuBar1.add(jFileMenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitmenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitmenuItemMouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_quitmenuItemMouseClicked

    private void quitmenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitmenuItemActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showOptionDialog(
                    null, "Are You Sure to would like to quit?", 
                    "Exit Confirmation", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    System.exit(0);
                }
    }//GEN-LAST:event_quitmenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = fileChooser.showOpenDialog(jFileMenu);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        
        
        information[0] = nameTextFeild.getText();
        information[1] = iconTextFeild.getText(); 
        information[2] = advisorTextFeild.getText();
        information[3] = presidentTextFeild.getText();
        information[4] = officersTextFeild.getText();
        information[5] = membersTextFeild.getText();
        information[6] = descriptionTextFeild.getText();  
        
        //add org
        organizationList.add( new organization(information));
        clearFeilds();
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void organizationTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_organizationTabMouseClicked
        // TODO add your handling code here:
        for (organization org : organizationList) 
        {
            organizationTextArea.append( org.toStart() + "\n" );
            organizationTextArea.append( org.toName() + "\n" );
            organizationTextArea.append( org.toIcon() + "\n");
            organizationTextArea.append( org.toAdvisor() + "\n" );
            organizationTextArea.append( org.toPresident() + "\n" );
            organizationTextArea.append( org.toOfficers() + "\n" );
            organizationTextArea.append( org.toMembers() + "\n" );
            organizationTextArea.append( org.toDescription() + "\n" );
            organizationTextArea.append( org.toEnd() + "\n" );
            
        }
    }//GEN-LAST:event_organizationTabMouseClicked

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        
        clearFeilds();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        WindowListener exitListener = new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(
                    null, "Are You Sure to would like to quit?", 
                    "Exit Confirmation", JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (confirm == 0) {
                    System.exit(0);
                }
            }   
        };
    }//GEN-LAST:event_formWindowClosed

    public void clearFeilds(){
        nameTextFeild.setText("");
        iconTextFeild.setText(""); 
        advisorTextFeild.setText("");
        presidentTextFeild.setText("");
        officersTextFeild.setText("");
        membersTextFeild.setText("");
        descriptionTextFeild.setText("");
    }
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
            java.util.logging.Logger.getLogger(xmlcreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xmlcreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xmlcreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xmlcreateUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xmlcreateUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField advisorTextFeild;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel datePane;
    private javax.swing.JPanel datePanel;
    private javax.swing.JTabbedPane datetab;
    private javax.swing.JTextField desTextFeild;
    private javax.swing.JTextArea descriptionTextFeild;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JTextField iconTextFeild;
    private javax.swing.JMenu jFileMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField linkTextFeild;
    private javax.swing.JTextField locationTextFeild;
    private javax.swing.JTextField membersTextFeild;
    private javax.swing.JTextField nameTextFeild;
    private javax.swing.JTextArea noteTextFeild;
    private javax.swing.JTextField officersTextFeild;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel organizationPane;
    private javax.swing.JPanel organizationPanel;
    private javax.swing.JTabbedPane organizationTab;
    private javax.swing.JTextArea organizationTextArea;
    private javax.swing.JTextField organizationTextFeild;
    private javax.swing.JTextField presidentTextFeild;
    private javax.swing.JMenuItem quitmenuItem;
    private javax.swing.JComboBox<String> sDay;
    private javax.swing.JComboBox<String> sMonth;
    private javax.swing.JComboBox<String> sYear;
    private javax.swing.JButton submitButton;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTextField titleTextFeild;
    // End of variables declaration//GEN-END:variables
}