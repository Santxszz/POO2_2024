package aula_04_11_24;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaProfessores extends javax.swing.JFrame {

    DefaultTableModel modeloTabela;
    int linhaSelecionada;

    public TelaProfessores() {
        initComponents();
        definirModeloTabela();
    }

    void definirModeloTabela() {
        modeloTabela = (DefaultTableModel) tbProfessores.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        btnInserir = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProfessores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JToggleButton();
        btnApagar = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade");

        btnInserir.setText("Cadastrar");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        tbProfessores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Cargo"
            }
        ));
        jScrollPane2.setViewportView(tbProfessores);

        jLabel3.setText("Cargo");

        btnEditar.setText("Alterar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnApagar.setText("Excluir");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtIdade)
                            .addComponent(txtNome)
                            .addComponent(txtCargo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String cargo = txtCargo.getText();
        
        System.out.println(idade);
        
  
        
        if(txtNome.getText().isEmpty() || txtCargo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos obrigatórios!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        
        
        //if (nome.isEmpty() || txtIdade.getText().isEmpty() || cargo.isEmpty()) {;
            //JOptionPane.showMessageDialog(null, "Todos os campos obrigatórios!", "ERRO", JOptionPane.ERROR_MESSAGE);
          //  return;
        //}

        try {
            modeloTabela.addRow(new Object[]{nome, idade, cargo});
        txtNome.requestFocus();
        txtNome.setText("");
        txtIdade.setText("");
        txtCargo.setText("");
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Todos os campos obrigatórios!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        linhaSelecionada = tbProfessores.getSelectedRow();
        
        String novoNome = txtNome.getText();
        int novaIdade = Integer.parseInt(txtIdade.getText());
        String novoCargo = txtCargo.getText();
        
        tbProfessores.setValueAt(novoNome, linhaSelecionada, 0);
        tbProfessores.setValueAt(novaIdade, linhaSelecionada, 1);
        tbProfessores.setValueAt(novoCargo, linhaSelecionada, 2);
        
        txtNome.requestFocus();
        txtNome.setText("");
        txtIdade.setText("");
        txtCargo.setText("");
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // TODO add your handling code here:
        linhaSelecionada = tbProfessores.getSelectedRow();
        if(linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item para excluir!");
        } else {
            modeloTabela.removeRow(linhaSelecionada);
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProfessores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnApagar;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnInserir;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbProfessores;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
