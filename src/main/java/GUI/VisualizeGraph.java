/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package GUI;
import classes.*;
import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.view.mxStylesheet;
import org.jgrapht.Graph;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;
/**
 *
 * @author kraik
 */
public class VisualizeGraph extends javax.swing.JFrame {
    /**
     * Creates new form VisualizeGraph
     */
    public VisualizeGraph() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matrixVisualizeBox = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        cosmeticItem = new javax.swing.JPanel();
        GraphVisualizeBackground = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backToMainMenuButton1 = new javax.swing.JButton();
        identifyBridgesButton = new javax.swing.JButton();
        bfsAmountOfIslesButton = new javax.swing.JButton();
        dfsAmountOfIslesOutput = new javax.swing.JLabel();
        bfsAmountOfIslesOutput = new javax.swing.JLabel();
        dfsAmountOfIslesButton = new javax.swing.JButton();
        VisualizeGraphButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bridgesVisualizer = new javax.swing.JTextArea();
        backToMainMenuButton = new javax.swing.JButton();
        toGraphOperationsButton = new javax.swing.JButton();

        javax.swing.GroupLayout matrixVisualizeBoxLayout = new javax.swing.GroupLayout(matrixVisualizeBox);
        matrixVisualizeBox.setLayout(matrixVisualizeBoxLayout);
        matrixVisualizeBoxLayout.setHorizontalGroup(
            matrixVisualizeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        matrixVisualizeBoxLayout.setVerticalGroup(
            matrixVisualizeBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cosmeticItem.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout cosmeticItemLayout = new javax.swing.GroupLayout(cosmeticItem);
        cosmeticItem.setLayout(cosmeticItemLayout);
        cosmeticItemLayout.setHorizontalGroup(
            cosmeticItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        cosmeticItemLayout.setVerticalGroup(
            cosmeticItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        background.add(cosmeticItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 220, 610));

        GraphVisualizeBackground.setBackground(new java.awt.Color(204, 204, 204));
        GraphVisualizeBackground.setBorder(new javax.swing.border.MatteBorder(null));
        GraphVisualizeBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Amount of isles:");
        GraphVisualizeBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 30));

        backToMainMenuButton1.setBackground(new java.awt.Color(204, 204, 204));
        backToMainMenuButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backToMainMenuButton1.setForeground(new java.awt.Color(0, 0, 0));
        backToMainMenuButton1.setText("Main Menu");
        backToMainMenuButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backToMainMenuButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToMainMenuButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToMainMenuButton1MouseClicked(evt);
            }
        });
        backToMainMenuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainMenuButton1ActionPerformed(evt);
            }
        });
        GraphVisualizeBackground.add(backToMainMenuButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 130, 50));

        identifyBridgesButton.setBackground(new java.awt.Color(153, 255, 153));
        identifyBridgesButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        identifyBridgesButton.setForeground(new java.awt.Color(0, 0, 0));
        identifyBridgesButton.setText("Indetify Bridges");
        identifyBridgesButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        identifyBridgesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        identifyBridgesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                identifyBridgesButtonMouseClicked(evt);
            }
        });
        identifyBridgesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifyBridgesButtonActionPerformed(evt);
            }
        });
        GraphVisualizeBackground.add(identifyBridgesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, 40));

        bfsAmountOfIslesButton.setBackground(new java.awt.Color(153, 255, 153));
        bfsAmountOfIslesButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bfsAmountOfIslesButton.setForeground(new java.awt.Color(0, 0, 0));
        bfsAmountOfIslesButton.setText("BFS");
        bfsAmountOfIslesButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bfsAmountOfIslesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bfsAmountOfIslesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bfsAmountOfIslesButtonMouseClicked(evt);
            }
        });
        bfsAmountOfIslesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfsAmountOfIslesButtonActionPerformed(evt);
            }
        });
        GraphVisualizeBackground.add(bfsAmountOfIslesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 30));

        dfsAmountOfIslesOutput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dfsAmountOfIslesOutput.setForeground(new java.awt.Color(51, 51, 51));
        GraphVisualizeBackground.add(dfsAmountOfIslesOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 50, 30));

        bfsAmountOfIslesOutput.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bfsAmountOfIslesOutput.setForeground(new java.awt.Color(51, 51, 51));
        GraphVisualizeBackground.add(bfsAmountOfIslesOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 50, 30));

        dfsAmountOfIslesButton.setBackground(new java.awt.Color(153, 255, 153));
        dfsAmountOfIslesButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dfsAmountOfIslesButton.setForeground(new java.awt.Color(0, 0, 0));
        dfsAmountOfIslesButton.setText("DFS");
        dfsAmountOfIslesButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dfsAmountOfIslesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dfsAmountOfIslesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dfsAmountOfIslesButtonMouseClicked(evt);
            }
        });
        dfsAmountOfIslesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfsAmountOfIslesButtonActionPerformed(evt);
            }
        });
        GraphVisualizeBackground.add(dfsAmountOfIslesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 30));

        VisualizeGraphButton.setBackground(new java.awt.Color(153, 255, 153));
        VisualizeGraphButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VisualizeGraphButton.setForeground(new java.awt.Color(0, 0, 0));
        VisualizeGraphButton.setText("Visualize Graph");
        VisualizeGraphButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        VisualizeGraphButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VisualizeGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizeGraphButtonActionPerformed(evt);
            }
        });
        GraphVisualizeBackground.add(VisualizeGraphButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 190, 80));

        bridgesVisualizer.setBackground(new java.awt.Color(255, 255, 255));
        bridgesVisualizer.setColumns(20);
        bridgesVisualizer.setRows(5);
        jScrollPane2.setViewportView(bridgesVisualizer);

        GraphVisualizeBackground.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 250, 340));

        background.add(GraphVisualizeBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 810, 500));

        backToMainMenuButton.setBackground(new java.awt.Color(204, 204, 204));
        backToMainMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backToMainMenuButton.setForeground(new java.awt.Color(0, 0, 0));
        backToMainMenuButton.setText("Main Menu");
        backToMainMenuButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backToMainMenuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backToMainMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToMainMenuButtonMouseClicked(evt);
            }
        });
        backToMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainMenuButtonActionPerformed(evt);
            }
        });
        background.add(backToMainMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 130, 50));

        toGraphOperationsButton.setBackground(new java.awt.Color(204, 204, 204));
        toGraphOperationsButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toGraphOperationsButton.setForeground(new java.awt.Color(0, 0, 0));
        toGraphOperationsButton.setText("Graph Operations");
        toGraphOperationsButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        toGraphOperationsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toGraphOperationsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toGraphOperationsButtonActionPerformed(evt);
            }
        });
        background.add(toGraphOperationsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 150, 50));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    static Graph<Integer, DefaultWeightedEdge> duplicateGraph(){
        Graph<Integer, DefaultWeightedEdge> graph = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);         
        for(int j=0;j < Principal.globalUsersList.getSize();j++){
             User user = (User) Principal.globalUsersList.accessElement(j);
             graph.addVertex(user.getNumberOfRelation());
        }
        for(int j=0;j < Principal.globalRelationsList.getSize();j++){
             int [] relation = (int []) Principal.globalRelationsList.accessElement(j);
             DefaultWeightedEdge edge = graph.addEdge(relation[0],relation[1]);
             graph.setEdgeWeight(edge, relation[2]);
        }
        return graph;
    }
    private void VisualizeGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizeGraphButtonActionPerformed
        Graph<Integer, DefaultWeightedEdge> graph;
        graph = VisualizeGraph.duplicateGraph();
        // Convert JGraphT graph to JGraphX graph
        JGraphXAdapter<Integer, DefaultWeightedEdge> jgxAdapter = new JGraphXAdapter<>(graph);
        // Apply a layout algorithm to the graph
        mxCircleLayout layout = new mxCircleLayout(jgxAdapter);
        layout.execute(jgxAdapter.getDefaultParent());

        // Create a Swing component to display the graph
        mxGraphComponent component = new mxGraphComponent(jgxAdapter);

        // Create a JFrame to hold the component
        JFrame frame = new JFrame();
        frame.getContentPane().add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);

        // Export the graph as an image
        BufferedImage image = mxCellRenderer.createBufferedImage(jgxAdapter, null, 20,Color.WHITE, true, null);
        File outputFile = new File("graph.png");
        try {
            ImageIO.write(image, "png", outputFile);
            System.out.println("Graph image saved to: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error saving graph image: " + e.getMessage());
        }
    }//GEN-LAST:event_VisualizeGraphButtonActionPerformed

    private void identifyBridgesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifyBridgesButtonActionPerformed
        
    }//GEN-LAST:event_identifyBridgesButtonActionPerformed

    private void identifyBridgesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identifyBridgesButtonMouseClicked
        List bridges= Principal.globalGraph.findBridges();
        String q="";
        List a = Principal.globalUsersList;
        for (int i =0; i<bridges.getSize();i++){
            int[] temp=(int[])bridges.accessElement(i);
            int x;
            int o;
            x =((User) a.accessElement(temp[0])).getNumberOfRelation();
            o= ((User)a.accessElement(temp[1])).getNumberOfRelation();
            q+="Users: "+x+","+o+"\n";
        }
        bridgesVisualizer.setText(q);

    }//GEN-LAST:event_identifyBridgesButtonMouseClicked

    private void backToMainMenuButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMainMenuButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backToMainMenuButton1MouseClicked

    private void backToMainMenuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainMenuButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backToMainMenuButton1ActionPerformed

    private void backToMainMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToMainMenuButtonMouseClicked
        Principal mainMenu = new Principal();
        this.setVisible(false);
        mainMenu.setVisible(true);
    }//GEN-LAST:event_backToMainMenuButtonMouseClicked

    private void backToMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backToMainMenuButtonActionPerformed

    private void bfsAmountOfIslesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bfsAmountOfIslesButtonMouseClicked
        bfsAmountOfIslesOutput.setText(Integer.toString(Principal.globalGraph.contarIslas1()));
    }//GEN-LAST:event_bfsAmountOfIslesButtonMouseClicked

    private void bfsAmountOfIslesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfsAmountOfIslesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bfsAmountOfIslesButtonActionPerformed

    private void dfsAmountOfIslesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dfsAmountOfIslesButtonMouseClicked
        dfsAmountOfIslesOutput.setText(Integer.toString(Principal.globalGraph.countIslandsdfs()));
    }//GEN-LAST:event_dfsAmountOfIslesButtonMouseClicked

    private void dfsAmountOfIslesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfsAmountOfIslesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dfsAmountOfIslesButtonActionPerformed

    private void toGraphOperationsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toGraphOperationsButtonActionPerformed
        MatrixOperations graphOperations = new MatrixOperations();
        this.setVisible(false);
        graphOperations.setVisible(true);
    }//GEN-LAST:event_toGraphOperationsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizeGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizeGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizeGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizeGraph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizeGraph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphVisualizeBackground;
    private javax.swing.JButton VisualizeGraphButton;
    private javax.swing.JButton backToMainMenuButton;
    private javax.swing.JButton backToMainMenuButton1;
    private javax.swing.JPanel background;
    private javax.swing.JButton bfsAmountOfIslesButton;
    private javax.swing.JLabel bfsAmountOfIslesOutput;
    private javax.swing.JTextArea bridgesVisualizer;
    private javax.swing.JPanel cosmeticItem;
    private javax.swing.JButton dfsAmountOfIslesButton;
    private javax.swing.JLabel dfsAmountOfIslesOutput;
    private javax.swing.JButton identifyBridgesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel matrixVisualizeBox;
    private javax.swing.JButton toGraphOperationsButton;
    // End of variables declaration//GEN-END:variables
}
