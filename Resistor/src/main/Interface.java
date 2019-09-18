/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import classes.Resistor;
import javax.swing.JOptionPane;

/**
 *
 * @author IgorMoreira
 */
public class Interface extends javax.swing.JFrame {

    Resistor r1 = new Resistor();
    Resistor r2 = new Resistor();
    Resistor req = new Resistor(); 
    
    

    
    
    /**
     * Creates new form Interface
     */
    public Interface() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        b_set = new javax.swing.JButton();
        t_pot = new javax.swing.JTextField();
        t_res = new javax.swing.JTextField();
        calcula = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        op_1 = new javax.swing.JRadioButton();
        op_2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b_set.setText("Set Resistor");
        b_set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_setMouseClicked(evt);
            }
        });

        t_pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_potActionPerformed(evt);
            }
        });

        t_res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_resActionPerformed(evt);
            }
        });

        calcula.setText("Calcular");
        calcula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculaMouseClicked(evt);
            }
        });
        calcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculaActionPerformed(evt);
            }
        });

        jLabel1.setText("Resistencia ");

        jLabel2.setText("Potencia ");

        op_1.setText("Resistor 1");
        op_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_1ActionPerformed(evt);
            }
        });

        op_2.setText("Resistor 2");
        op_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t_res, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel2))
                                .addComponent(t_pot))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op_2)
                                    .addComponent(op_1)))
                            .addComponent(b_set)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(calcula)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_res, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_pot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op_2)
                .addGap(18, 18, 18)
                .addComponent(b_set)
                .addGap(18, 18, 18)
                .addComponent(calcula)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_potActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_potActionPerformed

    private void t_resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_resActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_resActionPerformed

    private void calculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calculaActionPerformed

    private void b_setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_setMouseClicked
        
        if(op_1.isSelected())
        { 
        
        r1.setRes(Double.parseDouble(t_res.getText()));
        r1.setPot(Double.parseDouble(t_pot.getText()));  
        }
        if(op_1.isSelected() )
            {
        if(op_2.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Selecione apenas 1 Resistor" );
        }
        
    }
        
        if(op_2.isSelected())
        {
            
        r2.setRes(Double.parseDouble(t_res.getText()));
        r2.setPot(Double.parseDouble(t_pot.getText()));
        }
        
             // TODO add your handling code here:
    }//GEN-LAST:event_b_setMouseClicked

    private void calculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculaMouseClicked
 
        req=r1.Serie(r2);
        req.Imprime();
        req=r1.Paralelo(r2);
        req.Imprime();
          

        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_calculaMouseClicked

    private void op_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_1ActionPerformed

    private void op_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_op_2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_set;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton op_1;
    private javax.swing.JRadioButton op_2;
    private javax.swing.JTextField t_pot;
    private javax.swing.JTextField t_res;
    // End of variables declaration//GEN-END:variables
}
