
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fabio
 */
public class Cadastro extends javax.swing.JFrame {
      DefaultListModel modeloJlist;

    /**
     * Creates new form dc
     */
    public Cadastro() {
        initComponents();
        setarModeloJlist();
        //modeloJlist.addElement("Produto 01");
        //modeloJlist.addElement("Produto 02");
        //modeloJlist.addElement("Produto 03");

    }
       
    
    void setarModeloJlist(){
        modeloJlist = new DefaultListModel();
        listCadastro.setModel(modeloJlist);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCadastro = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        btEnviar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Produto");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        listCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCadastroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listCadastro);

        jLabel2.setText("Lista de Produtos");

        btEnviar.setForeground(new java.awt.Color(0, 0, 0));
        btEnviar.setText("Cadastrar");
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        btRemover.setForeground(new java.awt.Color(0, 0, 0));
        btRemover.setText("Apagar");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btEditar.setForeground(new java.awt.Color(0, 0, 0));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEnviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditar))
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtNome))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEnviar)
                    .addComponent(btRemover)
                    .addComponent(btEditar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        // TODO add your handling code here:
        String NomeProduto = txtNome.getText();
        if (NomeProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome do produto deve ser preenchido!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        modeloJlist.addElement(txtNome.getText());
        txtNome.setText("");
        txtNome.requestFocus();

    }//GEN-LAST:event_btEnviarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        // TODO add your handling code here:
        if (listCadastro.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int linha = listCadastro.getSelectedIndex();
        modeloJlist.remove(linha);
        txtNome.setText("");
        txtNome.requestFocus();
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        if (listCadastro.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione um produto para editar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int linhaSelecionada = listCadastro.getSelectedIndex();
        modeloJlist.setElementAt(txtNome.getText(), linhaSelecionada);
        txtNome.setText("");
        txtNome.requestFocus();
    }//GEN-LAST:event_btEditarActionPerformed

    private void listCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCadastroMouseClicked
        // TODO add your handling code here:
          String nomeSelecionado = listCadastro.getSelectedValue();
        txtNome.setText(nomeSelecionado);
    }//GEN-LAST:event_listCadastroMouseClicked

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listCadastro;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    
        
    }

