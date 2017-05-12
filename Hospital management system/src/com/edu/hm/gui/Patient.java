/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.hm.gui;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.edu.hm.controllers.ConsultantController;
import com.edu.hm.controllers.PatientController;
import com.edu.hm.controllers.WardController;
import com.edu.hm.dto.AdmissionDTO;
import com.edu.hm.dto.ConsultantDTO;
import com.edu.hm.dto.PatientDTO;
import com.edu.hm.dto.WardDTO;
import static com.edu.hm.gui.Main.pnlMain;
import com.edu.hm.validation.ValidationController;
import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Jinadi
 */
public class Patient extends javax.swing.JPanel {

    /**
     * Creates new form Patience
     */
    ArrayList<ConsultantDTO> arrayList;
    ArrayList<WardDTO> list;
    
    public Patient() {
        initComponents();
        loadConsultant();
        warCombo();
        setCmbDOB();
        back();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        cmboBlood = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jCalendarCombo1 = new org.freixas.jcalendar.JCalendarCombo();
        jLabel3 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        txtName3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNIC = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbConsultant = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbsp = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGname = new javax.swing.JTextField();
        txtGtel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbWardN = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbWardTy = new javax.swing.JComboBox<>();

        setBackground(java.awt.Color.white);
        setMaximumSize(new java.awt.Dimension(1040, 1040));
        setPreferredSize(new java.awt.Dimension(1040, 590));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(1040, 1040));
        jPanel1.setPreferredSize(new java.awt.Dimension(1040, 590));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmboBlood.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cmboBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "C+", "C-", "AB+", "AB-", "O+", "O-" }));
        jPanel2.add(cmboBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 350, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel11.setText("blood group");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 217, 80));

        jCalendarCombo1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.add(jCalendarCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 350, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("date of birth");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 217, 80));

        txtTel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
        });
        jPanel2.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 350, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("tel");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 217, 80));

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 350, 90));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel7.setText("address");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 217, 65));

        txtName1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtName1KeyReleased(evt);
            }
        });
        jPanel2.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, 40));

        txtName2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtName2KeyReleased(evt);
            }
        });
        jPanel2.add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 150, 40));

        txtName3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtName3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtName3KeyReleased(evt);
            }
        });
        jPanel2.add(txtName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("name ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 217, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel4.setText("NIC");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 62, 217, 60));

        txtNIC.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNICKeyReleased(evt);
            }
        });
        jPanel2.add(txtNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 340, 40));

        txtPatientID.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jPanel2.add(txtPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 340, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel10.setText("patient ID");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 217, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 560, 440));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setText("register");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 190, 60));

        jButton4.setBackground(new java.awt.Color(0, 255, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 102, 102));
        jButton4.setText("cancel");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 470, 190, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("consultant");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 217, 70));

        cmbConsultant.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cmbConsultant.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbConsultantItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbConsultant, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 230, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel9.setText("speciality");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -10, 217, 70));

        cmbsp.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cmbsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbspActionPerformed(evt);
            }
        });
        jPanel3.add(cmbsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 190, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel6.setText("guardian name ");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 217, 52));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel8.setText("guardian telphone");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 217, 70));

        txtGname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtGname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGnameActionPerformed(evt);
            }
        });
        txtGname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGnameKeyReleased(evt);
            }
        });
        jPanel3.add(txtGname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 350, 40));

        txtGtel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtGtel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGtelActionPerformed(evt);
            }
        });
        txtGtel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGtelKeyReleased(evt);
            }
        });
        jPanel3.add(txtGtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 350, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel12.setText("ward no");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 217, 70));

        cmbWardN.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cmbWardN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWardNItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbWardN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel13.setText("ward type");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 217, 70));

        cmbWardTy.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cmbWardTy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbWardTyItemStateChanged(evt);
            }
        });
        jPanel3.add(cmbWardTy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 220, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 440, 380));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 610));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void cmbConsultantItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbConsultantItemStateChanged
        cmbsp.setSelectedIndex(cmbConsultant.getSelectedIndex());
    }//GEN-LAST:event_cmbConsultantItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addToPatient();//adding data to patient table
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbspActionPerformed

    private void txtGnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGnameActionPerformed

    private void txtGtelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGtelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGtelActionPerformed

    private void cmbWardNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWardNItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardNItemStateChanged

    private void cmbWardTyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbWardTyItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbWardTyItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        refreshPa();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtNICKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICKeyReleased
        ValidationController.nic(txtNIC);
    }//GEN-LAST:event_txtNICKeyReleased

    private void txtName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName1KeyReleased
        ValidationController.name(txtName1);
    }//GEN-LAST:event_txtName1KeyReleased

    private void txtName2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName2KeyReleased
        ValidationController.name(txtName2);
    }//GEN-LAST:event_txtName2KeyReleased

    private void txtName3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtName3KeyReleased
        ValidationController.name(txtName3);
    }//GEN-LAST:event_txtName3KeyReleased

    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        ValidationController.phoneNumber(txtTel);
    }//GEN-LAST:event_txtTelKeyReleased

    private void txtGnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGnameKeyReleased
        ValidationController.name(txtGname);
    }//GEN-LAST:event_txtGnameKeyReleased

    private void txtGtelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGtelKeyReleased
        ValidationController.phoneNumber(txtGtel);
    }//GEN-LAST:event_txtGtelKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbConsultant;
    private javax.swing.JComboBox<String> cmbWardN;
    private javax.swing.JComboBox<String> cmbWardTy;
    private javax.swing.JComboBox<String> cmboBlood;
    private javax.swing.JComboBox<String> cmbsp;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtGname;
    private javax.swing.JTextField txtGtel;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtName3;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void loadConsultant() {
        try {
            arrayList = ConsultantController.getAllCunsultant();
            for (ConsultantDTO consultantDTO : arrayList) {
                cmbsp.addItem(consultantDTO.getSpeciality());
                cmbConsultant.addItem(consultantDTO.getEmployeeDTO().getFirstName() + "  " + consultantDTO.getEmployeeDTO().getMiddleName() + " " + consultantDTO.getEmployeeDTO().getLastName());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setCmbDOB() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        jCalendarCombo1.setDateFormat(format);
    }
    
    private void addToPatient() {
        try {
            String patientID = txtPatientID.getText();
            String name1 = txtName1.getText();
            String name2 = txtName2.getText();
            String name3 = txtName3.getText();
            String nic = txtNIC.getText();
            String add = txtAddress.getText();
            String cal = (String) jCalendarCombo1.getSelectedItem();
            int tel = Integer.parseInt(txtTel.getText());
            String blood = (String) cmboBlood.getSelectedItem();
            String aID = patientID + (String) cmbWardN.getSelectedItem();
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String startd = dateFormat.format(date);
            String guardianName = txtGname.getText();
            int guardianTel = Integer.parseInt(txtGtel.getText());
            WardDTO dTO = WardController.searchTest((String) cmbWardN.getSelectedItem());
            ConsultantDTO consultantID = arrayList.get(cmbConsultant.getSelectedIndex());
            PatientDTO patientDTO = new PatientDTO(patientID, consultantID, nic, name1, name2, name3, add, tel, cal, blood);
            AdmissionDTO admissionDTO = new AdmissionDTO(aID, patientDTO, dTO, startd, guardianName, guardianTel);
            boolean pAdd = PatientController.newPatienceDetails(patientDTO, admissionDTO);
            if (pAdd) {
                JOptionPane.showMessageDialog(this, "Patient added to system");
                refreshPa();
            } else {
                JOptionPane.showMessageDialog(this, "Patient adding fail");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "OOPS!");
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void back() {
        
    }
    
    private void warCombo() {
        try {
            list = WardController.getWardDTOs();
            for (WardDTO dto : list) {
                cmbWardN.addItem(dto.getWid());
                cmbWardTy.addItem(dto.getType());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void refreshPa() {
        pnlMain.removeAll();
        Patient form = new Patient();
        form.setSize(pnlMain.getSize());
        pnlMain.add(form);
        pnlMain.repaint();
        pnlMain.revalidate();
    }
    
}
