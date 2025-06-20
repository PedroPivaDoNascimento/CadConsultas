/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.cadconsultas.gui.dlg.dlgConsultas;

import com.mycompany.cadconsultas.gui.dlg.dlgConsultas.dlgConsultasEdit.DlgEditConsultas;
import com.mycompany.cadconsultas.listas.ListConsultas;
import com.mycompany.cadconsultas.listas.ListMedicos;
import com.mycompany.cadconsultas.listas.ListPacientes;
import javax.swing.JFrame;

/**
 *
 * @author piva
 */
public class DlgCadConsultas extends javax.swing.JDialog {
    private final ListConsultas consultasCadastradas;
    private final ListMedicos medicosCadastrados;
    private final ListPacientes pacientesCadastrados;
    private final JFrame frParent;
    
    
    /**
     * Creates new form DlgCadConsultas
     * @param parent
     * @param modal
     * @param consultasCadastradas
     * @param medicosCadastrados
     * @param pacientesCadastrados
     */
    public DlgCadConsultas(java.awt.Frame parent, boolean modal, ListConsultas consultasCadastradas, ListMedicos medicosCadastrados, ListPacientes pacientesCadastrados) {
        super(parent, modal);
        initComponents();
        
        this.consultasCadastradas = consultasCadastradas; 
        this.medicosCadastrados = medicosCadastrados;
        this.pacientesCadastrados = pacientesCadastrados;
        this.frParent = (JFrame) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        painelOptions = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        lblTitle.setText("CADASTRO DAS CONSULTAS");
        painelTitle.add(lblTitle);

        painelOptions.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        painelOptions.add(btnCadastrar);

        btnEdit.setText("EDITAR");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        painelOptions.add(btnEdit);

        btnRemove.setText("REMOVER");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        painelOptions.add(btnRemove);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.setVisible(false);
        DlgCreateConsultas screenCreateConsultas = new DlgCreateConsultas(frParent, true, this.consultasCadastradas);
        screenCreateConsultas.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        this.setVisible(false);
        DlgEditConsultas screenEditConsultas =  new DlgEditConsultas(frParent, true, this.consultasCadastradas, this.medicosCadastrados, this.pacientesCadastrados);
        screenEditConsultas.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        this.setVisible(false);
        DlgRemoveConsultas screenRemoveConsultas = new DlgRemoveConsultas(frParent, true, consultasCadastradas);
        screenRemoveConsultas.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_btnRemoveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel painelOptions;
    private javax.swing.JPanel painelTitle;
    // End of variables declaration//GEN-END:variables
}
