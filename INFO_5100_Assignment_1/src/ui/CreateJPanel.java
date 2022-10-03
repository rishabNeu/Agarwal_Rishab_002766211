/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author Rishab
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    String filePath = "";
    private EmployeeHistory empHistory;

    public CreateJPanel(EmployeeHistory history) {

        initComponents();

        empHistory = history;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblEmpId = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPosition = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblMobile = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnUpload = new javax.swing.JButton();
        txtPosition = new javax.swing.JTextField();
        comboGender = new javax.swing.JComboBox<>();
        lblUploadSuccess = new javax.swing.JLabel();
        lblContactInfo = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        lblTitle.setText("Create Employee");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("Name :");

        lblAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAge.setText("Age :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAgeMouseClicked(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblEmpId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmpId.setText("Employee Id");

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDate.setText("Start Date");

        lblLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLevel.setText("Level");

        lblTeamInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTeamInfo.setText("Team Information");

        lblPosition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPosition.setText("Position");

        lblGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        lblMobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMobile.setText("Mobile Number :");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblPhoto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPhoto.setText("Photo");

        txtEmpId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmpIdKeyTyped(evt);
            }
        });

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });
        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStartDateKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStartDateKeyTyped(evt);
            }
        });

        btnUpload.setText("Upload File");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        comboGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a value", "Male", "Female", "Other" }));
        comboGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGenderActionPerformed(evt);
            }
        });

        lblContactInfo.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContactInfo.setText("Contact Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmpId)
                                    .addComponent(lblAge)
                                    .addComponent(lblName)
                                    .addComponent(lblGender))
                                .addGap(144, 144, 144)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEmpId, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(comboGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblLevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDate, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblTeamInfo))
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblContactInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtMobile, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnUpload, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(3, 3, 3)
                                .addComponent(lblUploadSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAge)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmpId))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmpId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(comboGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPosition)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContactInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobile)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPhoto)
                        .addComponent(btnUpload))
                    .addComponent(lblUploadSuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAge, lblName});

    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        String name = txtName.getText();
        String ageTemp = txtAge.getText();
        String empId = txtEmpId.getText();
        String gender = comboGender.getSelectedItem().toString();
        String startDatetemp = txtStartDate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String position = txtPosition.getText();
        String phone = txtMobile.getText();
        String email = txtEmail.getText();

        boolean isValid = validateData();

        if (isValid == true) {

            //Setting the employee object
            Employee emp = empHistory.addEmployee();
            emp.setName(name);
            emp.setAge(Integer.parseInt(txtAge.getText()));

            emp.setEmpId(Integer.parseInt(empId));

            emp.setGender(gender);
            emp.setLevel(level);
            emp.setMobileNo(phone);
            emp.setEmail(email);
            emp.setPositionTitle(position);
            emp.setTeamInfo(teamInfo);

            emp.setStartDate(txtStartDate.getText());

            if (!filePath.equals("")) {
                emp.setPhoto(filePath);
            }

            JOptionPane.showMessageDialog(this, "New Employee Created");
            txtName.setText("");
            txtAge.setText("");
            txtEmail.setText("");
            txtEmpId.setText("");
            txtStartDate.setText("");
            txtLevel.setText("");
            txtTeamInfo.setText("");
            txtMobile.setText("");
            txtEmail.setText("");
            txtPosition.setText("");
            comboGender.setSelectedIndex(0);
            lblUploadSuccess.setText("");
        }


    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed

        JFileChooser filePicker = new JFileChooser();
        filePicker.showOpenDialog(null);
        File file = filePicker.getSelectedFile();
        filePath = file.getAbsolutePath();

        if (filePath.equals("")) {
            JOptionPane.showMessageDialog(null, "Not able to upload");
        } else {
            lblUploadSuccess.setText("Uploaded Successfully");
        }

    }//GEN-LAST:event_btnUploadActionPerformed

    private void comboGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGenderActionPerformed


    }//GEN-LAST:event_comboGenderActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased

    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtEmpIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyTyped

    }//GEN-LAST:event_txtEmpIdKeyTyped

    private void txtEmpIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyReleased

//        }    }//GEN-LAST:event_txtEmpIdKeyReleased
    }


    private void txtEmpIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpIdKeyPressed

    }//GEN-LAST:event_txtEmpIdKeyPressed

    private void txtAgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAgeMouseClicked

    }//GEN-LAST:event_txtAgeMouseClicked

    private void txtStartDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyReleased


    }//GEN-LAST:event_txtStartDateKeyReleased

    private void txtStartDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyTyped
//        if (isDateValid(txtStartDate.getText()) == false) {
//            JOptionPane.showMessageDialog(null, "Please enter the date in dd/MM/yyyy format");
//            txtStartDate.requestFocus();
//        }
    }//GEN-LAST:event_txtStartDateKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox<String> comboGender;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblContactInfo;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblMobile;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPosition;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUploadSuccess;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPosition;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(String value) {

        if (value == null || value == "") {
            return false;
        }
        try {
            int temp = Integer.parseInt(value);

        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;

    }

    private boolean validateData() {

        boolean val = true;

        if (txtName.getText().equals("")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the name!");
            txtName.requestFocus();
            return false;
        } else {
            String pattern = "^[a-zA-Z]+[\\-'\\s]?[a-zA-Z ]+$";

            Pattern patternToMatch = Pattern.compile(pattern);
            Matcher match = patternToMatch.matcher(txtName.getText());
            if (!match.matches()) {
                JOptionPane.showMessageDialog(null, "Enter the name properly. It is Invalid");
                txtName.requestFocus();
                txtName.setText("");
                val = false;
                return false;
            }
        }

        if (txtAge.getText().equals("")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the Employee Age!");
            txtAge.requestFocus();
            return false;
        } else {
            if (isNumeric(txtAge.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Please enter the age in numeric format only");
                txtAge.requestFocus();
                txtAge.setText("");
                val = false;
                return false;
            } else if (Integer.parseInt(txtAge.getText()) < 21 || Integer.parseInt(txtAge.getText()) > 60) {
                JOptionPane.showMessageDialog(null, "Please enter the age in proper range which is 20 to 60 only");
                txtAge.requestFocus();
                txtAge.setText("");
                val = false;
                return false;
            }
        }

        if (txtEmpId.getText().equals("")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the Employee Id!");
            txtEmpId.requestFocus();
            return false;
        } else {
            if (isNumeric(txtEmpId.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Please enter the Employee ID in numeric format!");
                txtEmpId.requestFocus();
                txtEmpId.setText("");
                val = false;
                return false;
            } else if (searchForSameId(txtEmpId.getText()) == true) {
                JOptionPane.showMessageDialog(null, "Please enter a Unique Employee ID as this already exists!");
                txtEmpId.requestFocus();
                txtEmpId.setText("");
                return false;
            }
        }

        if (comboGender.getSelectedItem().toString().equals("Select a value")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please select an appropriate gender ");
            comboGender.setSelectedIndex(0);
            return false;
        }

        if (txtStartDate.getText().equals("") && isDateValid(txtStartDate.getText()) == false) {

            val = false;

            JOptionPane.showMessageDialog(null, "Please enter the Employee Start Date!");
            txtStartDate.requestFocus();
            return false;
        } else {
            
            if (!(txtStartDate.getText().matches("^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$"))) {
                JOptionPane.showMessageDialog(this, "Please enter the Employee Start Date in proper format mm/dd/yyyy!");
                txtStartDate.requestFocus();
                txtStartDate.setText("");
                val = false;
                return false;
            }
            
        }

        if (txtLevel.getText().equals("")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the Employee Level!");
            txtLevel.requestFocus();
            return false;
        } else if (txtTeamInfo.getText().equals("")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the Employee Team Information!");
            txtTeamInfo.requestFocus();
            return false;
        }

        
         if (txtPosition.getText().equals("")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the Employee Position!");
            txtPosition.requestFocus();
            return false;
        }

        
        if (txtMobile.getText().equals("")) {
            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the Mobile number!");
            txtMobile.requestFocus();
            return false;
        } else {

            String patternPhone = "^[0-9]{0,10}$";

            Pattern phonePatternToMatch = Pattern.compile(patternPhone);
            Matcher matchPhone = phonePatternToMatch.matcher(txtMobile.getText());

            if (!matchPhone.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid Phone number!");
                val = false;
                txtMobile.requestFocus();
                txtMobile.setText("");
                return false;
            } else if (txtMobile.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "Please enter a valid 10 digit mobile number");
                val = false;
                txtMobile.requestFocus();
                txtMobile.setText("");
                return false;
            }
        }

        if (txtEmail.getText().equals("")) {

            val = false;
            JOptionPane.showMessageDialog(null, "Please enter the Email Address!");
            txtEmail.requestFocus();
            return false;
        } else {
            if (emailValidation(txtEmail.getText()) == false) {
                JOptionPane.showMessageDialog(null, "Invalid email ID ");
                val = false;
                txtEmail.requestFocus();
                txtEmail.setText("");
                return false;
            }
        }
        
        if(lblUploadSuccess.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please select a photo ");
                val = false;
                return false;
        }
        
   
       
        return val;

    }

    private boolean isDateValid(String startDate) {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        formatter.setLenient(false);
        Date parsedDate = null;
        try {
            parsedDate = formatter.parse(startDate);

        } catch (ParseException e) {
            //Handle exception
            return false;
        }
        return true;
    }

    private boolean emailValidation(String email) {

        String pattern
                = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patternToMatch = Pattern.compile(pattern);
        Matcher match = patternToMatch.matcher(email);

        if (!match.matches()) {

            return false;
        }
        return true;

    }

    private Date convertStringToDate(String startDate) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        Date parsedDate = null;
        parsedDate = formatter.parse(startDate);

        return parsedDate;

    }

    public boolean searchForSameId(String empId) {
        ArrayList<Employee> employeeList = empHistory.getEmpList();

        for (Employee employee : employeeList) {

            if (Integer.parseInt(empId) == employee.getEmpId()) {
                return true;
            }

        }
        return false;
    }

}
