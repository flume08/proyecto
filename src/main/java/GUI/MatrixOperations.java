/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import classes.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author kraik
 */
public class MatrixOperations extends javax.swing.JFrame {
       
    String userInput;
    String separator;
    String userName;
    int userCode;
    int secondUserCode;
    int relationNumber;
    String manageUserExample = "userCode, @username  |  Ex: 121, @Pepe_Gónzales";
    String manageRelationExample = "user1Code, user2Code, relationNumber  |  Ex: 123, 321, 4";
    /**
     * Creates new form MatrixOperations
     */
    public MatrixOperations() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);       
    }
    
    
    private int getXComponent(List<User> users, List<int []> relations, int id){
            for(int j=0;j < users.getSize();j++){
            if ((id == users.accessElement(j).getNumberOfRelation())){
                return j;
            }
        }
    return 0;
    }
    
    private int getYComponent(List<User> users, List<int []> relations,int id){
            for(int j=0;j < users.getSize();j++){
            if ((id == users.accessElement(j).getNumberOfRelation())){
                return j;
            }
        }
    return 0;
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
        addUserButton = new javax.swing.JButton();
        addRelationButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        deleteRelationButton = new javax.swing.JButton();
        backToGraphVisualizer = new javax.swing.JButton();
        deleteUserInput = new javax.swing.JTextField();
        addUserInput = new javax.swing.JTextField();
        deleteRelationInput = new javax.swing.JTextField();
        addRelationInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addUserButton.setBackground(new java.awt.Color(204, 204, 204));
        addUserButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addUserButton.setForeground(new java.awt.Color(0, 0, 0));
        addUserButton.setText("Add User");
        addUserButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserButtonMouseClicked(evt);
            }
        });
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 130, 50));

        addRelationButton.setBackground(new java.awt.Color(204, 204, 204));
        addRelationButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addRelationButton.setForeground(new java.awt.Color(0, 0, 0));
        addRelationButton.setText("Add Relation");
        addRelationButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addRelationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRelationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRelationButtonMouseClicked(evt);
            }
        });
        addRelationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addRelationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 130, 50));

        deleteUserButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteUserButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteUserButton.setText("Delete User");
        deleteUserButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        deleteUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteUserButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteUserButtonMouseClicked(evt);
            }
        });
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 130, 50));

        deleteRelationButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteRelationButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteRelationButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteRelationButton.setText("Delete Relation");
        deleteRelationButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        deleteRelationButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteRelationButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteRelationButtonMouseClicked(evt);
            }
        });
        deleteRelationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRelationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteRelationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 130, 50));

        backToGraphVisualizer.setBackground(new java.awt.Color(204, 204, 204));
        backToGraphVisualizer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backToGraphVisualizer.setForeground(new java.awt.Color(0, 0, 0));
        backToGraphVisualizer.setText("Visualize Graph");
        backToGraphVisualizer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backToGraphVisualizer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToGraphVisualizer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToGraphVisualizerMouseClicked(evt);
            }
        });
        backToGraphVisualizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToGraphVisualizerActionPerformed(evt);
            }
        });
        jPanel1.add(backToGraphVisualizer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 220, 60));

        deleteUserInput.setBackground(new java.awt.Color(255, 255, 223));
        deleteUserInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteUserInput.setForeground(new java.awt.Color(153, 153, 153));
        deleteUserInput.setText("userCode, @username  |  Ex: 121, @Pepe_Gónzales");
        deleteUserInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteUserInputMouseClicked(evt);
            }
        });
        jPanel1.add(deleteUserInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 380, 30));

        addUserInput.setBackground(new java.awt.Color(255, 255, 223));
        addUserInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addUserInput.setForeground(new java.awt.Color(153, 153, 153));
        addUserInput.setText("userCode, @username  |  Ex: 121, @Pepe_Gónzales");
        addUserInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserInputMouseClicked(evt);
            }
        });
        addUserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserInputActionPerformed(evt);
            }
        });
        jPanel1.add(addUserInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 380, 30));

        deleteRelationInput.setBackground(new java.awt.Color(255, 255, 223));
        deleteRelationInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteRelationInput.setForeground(new java.awt.Color(153, 153, 153));
        deleteRelationInput.setText("user1Code, user2Code, relationNumber  |  Ex: 123, 321, 4");
        deleteRelationInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteRelationInputMouseClicked(evt);
            }
        });
        deleteRelationInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRelationInputActionPerformed(evt);
            }
        });
        jPanel1.add(deleteRelationInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 380, 30));

        addRelationInput.setBackground(new java.awt.Color(255, 255, 223));
        addRelationInput.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addRelationInput.setForeground(new java.awt.Color(153, 153, 153));
        addRelationInput.setText("user1Code, user2Code, relationNumber  |  Ex: 123, 321, 4");
        addRelationInput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRelationInputMouseClicked(evt);
            }
        });
        addRelationInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRelationInputActionPerformed(evt);
            }
        });
        jPanel1.add(addRelationInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 380, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed

    }//GEN-LAST:event_addUserButtonActionPerformed

    private void addRelationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRelationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRelationButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void deleteRelationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRelationButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteRelationButtonActionPerformed

    private void backToGraphVisualizerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToGraphVisualizerActionPerformed

    }//GEN-LAST:event_backToGraphVisualizerActionPerformed

    private void backToGraphVisualizerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToGraphVisualizerMouseClicked
        VisualizeGraph graphVisualizer = new VisualizeGraph();
        this.setVisible(false);
        graphVisualizer.setVisible(true);
    }//GEN-LAST:event_backToGraphVisualizerMouseClicked

    private void deleteRelationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteRelationButtonMouseClicked
        boolean flag = true;
        userInput = deleteRelationInput.getText();
        if (!userInput.contains(", ")) {           
            deleteRelationInput.setForeground(new java.awt.Color(153, 153, 153));
            deleteRelationInput.setText(manageRelationExample);
            JOptionPane.showMessageDialog(null, "You need to separate the information with ', ' as shown in the example!");
            flag = false;
            
        } else {
            String[] userInputArray = userInput.split(", ");
            
            try {               
                userCode = Integer.parseInt(userInputArray[0]);
                secondUserCode = Integer.parseInt(userInputArray[1]);
                relationNumber = Integer.parseInt(userInputArray[2]);
            } catch (Exception e) {                
                addRelationInput.setForeground(new java.awt.Color(153, 153, 153));
                addRelationInput.setText(manageRelationExample);
                JOptionPane.showMessageDialog(null, "User code and relation number MUST be numbers, and none of them can be missing!");
                flag = false;
            }
            
            if (flag) {
                int x;
                int y;
                boolean banner = true;
                x = getXComponent(Principal.globalUsersList, Principal.globalRelationsList, userCode);
                y = getYComponent(Principal.globalUsersList, Principal.globalRelationsList, secondUserCode);
                if (x == 0 || y == 0) {
                    banner = false;
                }
            
            if (banner) {
                Principal.globalGraph.deleteArista(userCode, secondUserCode);
                int relations[] = new int[3];
                relations[0] = userCode;
                relations[1] = secondUserCode;
                relations[2] = relationNumber;
                for (int i = 0; i < Principal.globalRelationsList.getSize(); i++) {
                    int listRelations[] = (int[]) Principal.globalRelationsList.accessElement(i);
                    if (relations[0] == listRelations[0]) {
                        if (relations[1] == listRelations[1]) {
                            Principal.globalRelationsList.deleteIndex(i);
                            break;
                        }
                    }
                    
                   
                }
            }
        }
            
        } 
    }//GEN-LAST:event_deleteRelationButtonMouseClicked

    private void deleteUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserButtonMouseClicked
        boolean flag = true;
        userInput = deleteUserInput.getText();
        if (!userInput.contains(", ")) {           
            deleteUserInput.setForeground(new java.awt.Color(153, 153, 153));
            deleteUserInput.setText(manageUserExample);
            JOptionPane.showMessageDialog(null, "You need to separate the information with ', ' as shown in the example!");
            flag = false;
            
        } else {            
            String[] userInputArray = userInput.split(", ");
            
            try {               
                userCode = Integer.parseInt(userInputArray[0]);
                userName = userInputArray[1];            
            } catch (Exception e) {                
                deleteUserInput.setForeground(new java.awt.Color(153, 153, 153));
                deleteUserInput.setText(manageUserExample);
                JOptionPane.showMessageDialog(null, "Input before the separator must be a valid user code!");
                flag = false;
            }
            
            if (userName.charAt(0) != '@') {
                deleteUserInput.setForeground(new java.awt.Color(153, 153, 153));
                deleteUserInput.setText(manageUserExample);
                JOptionPane.showMessageDialog(null, "Username must start with @!");
                flag = false;
            }
            
            if (flag) {
            boolean banner = true;
            for (int i = 0; i < Principal.globalUsersList.getSize(); i++) {
                User user = (User) Principal.globalUsersList.accessElement(i);
                if (userCode == user.getNumberOfRelation()) {
                    //Principal.globalGraph.
                    break;
                }   
            }

            if (banner) {
                User user = new User(userName, userCode);
                Principal.globalUsersList.addAtTheEndT(user);
                Principal.globalGraph.insertaVertice(Principal.globalUsersList.getSize());
            }
        }
            
            
        }       
    }//GEN-LAST:event_deleteUserButtonMouseClicked

    private void addRelationButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRelationButtonMouseClicked
        boolean flag = true;
        userInput = addRelationInput.getText();
        if (!userInput.contains(", ")) {           
            addRelationInput.setForeground(new java.awt.Color(153, 153, 153));
            addRelationInput.setText(manageRelationExample);
            JOptionPane.showMessageDialog(null, "You need to separate the information with ', ' as shown in the example!");
            flag = false;
            
        } else {
            String[] userInputArray = userInput.split(", ");
            
            try {               
                userCode = Integer.parseInt(userInputArray[0]);
                secondUserCode = Integer.parseInt(userInputArray[1]);
                relationNumber = Integer.parseInt(userInputArray[2]);
            } catch (Exception e) {                
                addRelationInput.setForeground(new java.awt.Color(153, 153, 153));
                addRelationInput.setText(manageRelationExample);
                JOptionPane.showMessageDialog(null, "User code and relation number MUST be numbers, and none of them can be missing!");
                flag = false;
            }
            
            if (flag) {
                int x;
                int y;
                boolean banner = true;
                x = getXComponent(Principal.globalUsersList, Principal.globalRelationsList, userCode);
                y = getYComponent(Principal.globalUsersList, Principal.globalRelationsList, secondUserCode);
                if (x == 0 || y == 0) {
                    banner = false;
                }
            
            if (banner) {
                int relations[] = new int[3];
                relations[0] = userCode;
                relations[1] = secondUserCode;
                relations[2] = relationNumber;
                Principal.globalRelationsList.addAtTheEndT(relations);
                Principal.globalGraph.insertArista(userCode, secondUserCode, relationNumber);
            }
        }
            
        }  
        
    }//GEN-LAST:event_addRelationButtonMouseClicked

    private void addUserButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserButtonMouseClicked
        boolean flag = true;
        userInput = addUserInput.getText();
        if (!userInput.contains(", ")) {           
            addUserInput.setForeground(new java.awt.Color(153, 153, 153));
            addUserInput.setText(manageUserExample);
            JOptionPane.showMessageDialog(null, "You need to separate the information with ', ' as shown in the example!");
            flag = false;
            
        } else {            
            String[] userInputArray = userInput.split(", ");
            
            try {               
                userCode = Integer.parseInt(userInputArray[0]);
                userName = userInputArray[1];            
            } catch (Exception e) {                
                addUserInput.setForeground(new java.awt.Color(153, 153, 153));
                addUserInput.setText(manageUserExample);
                JOptionPane.showMessageDialog(null, "Input before the separator must be a valid user code!");
                flag = false;
            }
            
            if (userName.charAt(0) != '@') {
                addUserInput.setForeground(new java.awt.Color(153, 153, 153));
                addUserInput.setText(manageUserExample);
                JOptionPane.showMessageDialog(null, "Username must start with @!");
                flag = false;
            }        
        }
        if (flag) {
            boolean banner = true;
            for (int i = 0; i < Principal.globalUsersList.getSize(); i++) {
                User user = (User) Principal.globalUsersList.accessElement(i);
                if (userCode == user.getNumberOfRelation()) {
                    banner = false;
                    break;
                }   
            }

            if (banner) {
                User user = new User(userName, userCode);
                Principal.globalUsersList.addAtTheEndT(user);
                Principal.globalGraph.insertaVertice(Principal.globalUsersList.getSize());
            }
        }
    }//GEN-LAST:event_addUserButtonMouseClicked

    private void deleteRelationInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRelationInputActionPerformed

    }//GEN-LAST:event_deleteRelationInputActionPerformed

    private void addRelationInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRelationInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRelationInputActionPerformed

    private void addUserInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addUserInputActionPerformed

    private void deleteRelationInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteRelationInputMouseClicked
        if (manageRelationExample.equals(deleteRelationInput.getText())) {
            deleteRelationInput.setText("");
            deleteRelationInput.setForeground(Color.black);
        }
    }//GEN-LAST:event_deleteRelationInputMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked

    }//GEN-LAST:event_jPanel1MouseClicked

    private void addRelationInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRelationInputMouseClicked
        if (manageRelationExample.equals(addRelationInput.getText())) {
            addRelationInput.setText("");
            addRelationInput.setForeground(Color.black);
        }
    }//GEN-LAST:event_addRelationInputMouseClicked

    private void addUserInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserInputMouseClicked
        if (manageUserExample.equals(addUserInput.getText())) {
            addUserInput.setText("");
            addUserInput.setForeground(Color.black);
        }
    }//GEN-LAST:event_addUserInputMouseClicked

    private void deleteUserInputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserInputMouseClicked
        if (manageUserExample.equals(deleteUserInput.getText())) {
            deleteUserInput.setText("");
            deleteUserInput.setForeground(Color.black);
        }
    }//GEN-LAST:event_deleteUserInputMouseClicked

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
            java.util.logging.Logger.getLogger(MatrixOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixOperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixOperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRelationButton;
    private javax.swing.JTextField addRelationInput;
    private javax.swing.JButton addUserButton;
    private javax.swing.JTextField addUserInput;
    private javax.swing.JButton backToGraphVisualizer;
    private javax.swing.JButton deleteRelationButton;
    private javax.swing.JTextField deleteRelationInput;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JTextField deleteUserInput;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
