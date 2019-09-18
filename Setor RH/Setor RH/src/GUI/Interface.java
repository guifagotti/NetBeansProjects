/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author GuiFagotti
 */

import Classe.EmpregadoHORISTA;
import Classe.EmpregadoCLT;
import Classe.Empregado;

public class Interface extends javax.swing.JFrame {
    
    Empregado empregados[] = new Empregado[10];
    int indice =0;


    EmpregadoCLT salva1 = new EmpregadoCLT();
    EmpregadoHORISTA salva2 = new EmpregadoHORISTA();
    Interface opc = new Interface();

    public void cadastraCLT() {
        salva1.InserirDadosCLT();
        empregados[indice] = salva1;
        

    }

    public void cadastraHOR() {
        salva2.InserirDadosHorista();

        empregados[indice] = salva2;
        

    }

    public void printDados() {
        for (int i = 0; i < indice; i++) {  //nao pega lista vazia
            System.out.printf("\n Nome %s\n", empregados[i].getNome());
            System.out.printf("CPF:" + empregados[i].getCpf());
            System.out.printf("Endereço : " + empregados[i].getEndereco());

           
            if (empregados[i] instanceof EmpregadoCLT) {
                System.out.println("Categoria CLT");
                
                EmpregadoCLT temp = (EmpregadoCLT) (empregados[i]); 
                System.out.println("Salário Bruto" + temp.getsBrutoCLT());
               System.out.println("Salario Líquido" + temp.salLiquido());
          } else {
                System.out.println("Categoria Horista");
                
                EmpregadoHORISTA temp = (EmpregadoHORISTA) (empregados[i]); 
                System.out.println("Número de horas" + temp.getnHoras());
                System.out.println("Preços" + temp.getPrecoH());
                System.out.println("Salario Líquido" + temp.salLiquido());
            }
        }
    }

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

        jLabel1 = new javax.swing.JLabel();
        bt_empregadoCLT = new javax.swing.JButton();
        bt_empragadoHORISTA = new javax.swing.JButton();
        bt_RELATORIO = new javax.swing.JButton();
        bt_SAIR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("        Bem vindo ");

        bt_empregadoCLT.setText("Cadastrar Empregado CLT");
        bt_empregadoCLT.setMaximumSize(new java.awt.Dimension(175, 23));
        bt_empregadoCLT.setMinimumSize(new java.awt.Dimension(175, 23));
        bt_empregadoCLT.setPreferredSize(new java.awt.Dimension(175, 23));
        bt_empregadoCLT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_empregadoCLTMouseClicked(evt);
            }
        });

        bt_empragadoHORISTA.setText("Cadastrar Empregado Horista");
        bt_empragadoHORISTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_empragadoHORISTAMouseClicked(evt);
            }
        });
        bt_empragadoHORISTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_empragadoHORISTAActionPerformed(evt);
            }
        });

        bt_RELATORIO.setText("Imprimir Relatório");
        bt_RELATORIO.setPreferredSize(new java.awt.Dimension(175, 23));
        bt_RELATORIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_RELATORIOMouseClicked(evt);
            }
        });

        bt_SAIR.setText("SAIR");
        bt_SAIR.setPreferredSize(new java.awt.Dimension(175, 23));
        bt_SAIR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_SAIRMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_empregadoCLT, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_SAIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_RELATORIO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_empragadoHORISTA, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_empregadoCLT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_empragadoHORISTA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_RELATORIO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_SAIR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_empregadoCLTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_empregadoCLTMouseClicked

        this.dispose();
        new emp_CLT().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_empregadoCLTMouseClicked

    private void bt_empragadoHORISTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_empragadoHORISTAMouseClicked

        this.dispose();
        new emp_HOR().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_empragadoHORISTAMouseClicked

    private void bt_empragadoHORISTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_empragadoHORISTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_empragadoHORISTAActionPerformed

    private void bt_RELATORIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_RELATORIOMouseClicked

        opc.printDados();


        // TODO add your handling code here:
    }//GEN-LAST:event_bt_RELATORIOMouseClicked

    private void bt_SAIRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_SAIRMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_bt_SAIRMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_RELATORIO;
    private javax.swing.JButton bt_SAIR;
    private javax.swing.JButton bt_empragadoHORISTA;
    private javax.swing.JButton bt_empregadoCLT;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
